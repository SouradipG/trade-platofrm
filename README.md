# 📈 Reactive Trading Platform with Spring WebFlux

A fully reactive, event-driven **Trading Platform** built using **Spring WebFlux**, **R2DBC**, and **Project Reactor**.

---

## 🚀 Project Overview

This application simulates a real-time stock trading platform consisting of **three reactive microservices**:

1. **Aggregator Service** (Orchestrator & API Gateway)
2. **Customer Service** (Portfolio Management & Transactions)
3. **Stock Service** (Price Feed & Market Updates)

The system demonstrates:
- Reactive communication between services
- Server-Sent Events (SSE) for real-time stock price updates
- Asynchronous processing using **Flux** and **Mono**
- Reactive data access via **Spring Data R2DBC**
- Functional and annotation-based endpoint design

---

## 🧩 System Architecture

```
Client ⇄ Aggregator Service ⇄ Customer Service
                           ⇄ Stock Service
```

### 🔄 Reactive Flow

- The **Stock Service** emits real-time stock price changes using a `Flux`.
- The **Aggregator Service** subscribes to this stream and exposes it to the frontend via **Server-Sent Events (SSE)**.
- A user can **buy/sell stocks** via the Aggregator API.
  - Aggregator fetches **current price** from Stock Service.
  - Aggregator initiates **portfolio update** via Customer Service.
- All components interact **non-blockingly**, maximizing resource efficiency.

---

## 🧠 Key Concepts & Features

### 📌 Spring WebFlux
- Annotation-based reactive controllers
- Functional endpoints with concise lambda expressions
- Non-blocking request processing using `Flux` and `Mono`

### ⚡ Reactive Programming with Project Reactor
- Efficient use of system resources via asynchronous pipelines
- Backpressure-aware streaming
- Error handling in reactive pipelines

### 💾 Reactive Data Access
- **Spring Data R2DBC** with PostgreSQL/MySQL
- Fully reactive repositories and transaction support
- Benchmarks highlighting performance over traditional JPA

### 🌐 WebClient Usage
- Reactive client-side HTTP calls
- Handling backpressure and streaming uploads/downloads

### 📡 Server-Sent Events (SSE)
- Stream stock price updates from server to client in real-time

### 🔐 Transaction Logic (Customer Service)
- Validates customer account balance (for buy)
- Checks portfolio for stock ownership (for sell)
- Maintains updated customer stock holdings and transaction history

### 🧪 Integration Testing
- `WebTestClient` for testing reactive endpoints
- Mocking external service dependencies
- End-to-end tests covering reactive pipelines

### 🔧 WebFilters
- Pre/post request processing for logging and context passing
- Attribute sharing between filters and endpoints

### 🚀 Performance Optimization
- Gzip compression
- HTTP/2 support
- Connection pooling and throughput analysis

---

## 📁 Tech Stack

| Layer              | Technology              |
|-------------------|--------------------------|
| Core Framework     | Spring Boot 3 + Spring WebFlux |
| Reactive Streams   | Project Reactor (Mono, Flux) |
| Reactive DB Access | Spring Data R2DBC |
| Database           | PostgreSQL / MySQL |
| Messaging (SSE)    | Server-Sent Events |
| API Client         | WebClient |
| Build Tool         | Maven |
| Testing            | WebTestClient, JUnit 5 |
| Packaging          | Docker (Optional) |

---

## 🧪 Sample Use Cases

- 📉 **Live Stock Price Feed:** Client subscribes to `/stocks/stream` for real-time updates.
- 📈 **Buy Stock:** POST `/trade/buy` with stock symbol and quantity.
- 📉 **Sell Stock:** POST `/trade/sell` if the user owns the stock.
- 💼 **Customer Portfolio:** GET `/customer/{id}/portfolio` to view holdings and balance.

---

## 🧪 Sample Screenshots / API Logs *(Optional)*

_Add Postman request examples or WebTestClient test logs here_

---

## 🧰 Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/SouradipG/trade-platofrm.git
   cd trade-platofrm
   ```

2. **Run each service individually**

   Each service has its own Spring Boot application class. Navigate to the respective folder and run:

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Configure your database**

   Update `application.yml` or `application.properties` in Customer Service with your PostgreSQL/MySQL R2DBC connection.

4. **Optional:** Use Docker Compose (if available) for running all services together.
