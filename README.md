# Microservices Study Application

![Full Architecture](./github/arch.png)

## Overview
This application is designed to study how microservices work together using various technologies.

### Technologies Used
- **Spring Boot**
- **Docker**
- **RabbitMQ**
- **Apache Kafka**
- **AWS**

## Getting Started

To download maven dependencies type in your terminal:
```sh
mvn clean install
```

### Running the Containers
To download and start all required containers, run the following command in your terminal:

```sh
docker compose up -d
```

### Expected Output
After running the command, you should see an output similar to this:

```
[+] Running 8/8
✔ Network mendesscriptservices_postgres   Created  0.0s
✔ Network mendesscriptservices_spring     Created  0.0s
✔ Volume "mendesscriptservices_pgadmin"   Created  0.0s
✔ Volume "mendesscriptservices_postgres"  Created  0.0s
✔ Container postgres                      Started  0.1s
✔ Container pgadmin                       Started  0.1s
✔ Container rabbitmq                      Started  0.1s
✔ Container zipkin                        Started  0.1s
```

### Checking Running Containers
To check if all containers are running properly, use:

```sh
docker compose ps
```

---

after this you be able to see the pgAdmin on port 5050.
paste on your browser: http://localhost:5050/

the application need an password, you can see the password on your docker-file.ylm
if you don't change anything on your archive your password probably is the default: "password"

after you need to create a server with the same credentials.
you also need to create a table called "customer".


Now you are ready to start experimenting with microservices! 🚀