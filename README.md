# Spring Boot CRUD Application

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-Build-orange.svg)

A simple **Spring Boot CRUD (Create, Read, Update, Delete)** application demonstrating RESTful API development with Java, Spring Boot, and Maven.  
This project is designed as a learning resource and starter template for building scalable backend services.

---

## 🚀 Features
- **CRUD Operations**: Create, Read, Update, Delete student via REST endpoints  
- **Spring Boot**: Lightweight and production-ready framework  
- **Maven**: Dependency management and build automation  
- **REST API**: JSON-based communication with clear endpoint design  
- **Swagger/OpenAPI**: Interactive API documentation and testing UI  

---

## 📂 Project Structure

SpringbootCrud/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/example/crud/   # Application source code
 │   │   └── resources/               # Configuration files
 │   └── test/                        # Unit and integration tests #No tests yet
 ├── pom.xml                          # Maven dependencies
 └── README.md                        # Project documentation

---

## ⚙️ Technologies Used
- Java 17+  
- Spring Boot 3.x  
- Maven  
- H2 / MySQL (configurable)  
- RESTful APIs  
- Swagger / OpenAPI  

---

## 📖 API Endpoints
| Method | Endpoint                        | Description          |
|--------|---------------------------------|----------------------|
| POST   | `/api/student/create`           | Create new student   |
| GET    | `/api/student/getAll`           | Get all students     |
| PUT    | `/api/student/updateById/{id}`  | Update student by ID |
| DELETE | `/api/student/deleteById/{id}`  | Delete student by ID |

---
