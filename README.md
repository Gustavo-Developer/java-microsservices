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

Now you are ready to start experimenting with microservices! 🚀