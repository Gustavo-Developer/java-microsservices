package com.mendesscript.app.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstName(request.firstName()).lastName(request.lastName()).email(request.email()).build();

        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject( "http://localhost:8091/api/v1/fraud-check/{customerId}",
        FraudCheckResponse.class,
        customer.getId()
        );

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }
    }
}
