# Spring Boot CRUD Application

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
 │   └── test/                        # Unit and integration tests <!-- No tests yet, placeholder for future coverage -->
 ├── pom.xml                          # Maven dependencies
 └── README.md                        # Project documentation

### Key Directories and Files:

*   **`src/main/java`**: Core application source code. Contains:
    *   **`com.crudspringboot.SpringbootCrud`**: The root package for the application.
    *   **`controller`**: Handle HTTP requests and responses.
    *   **`service`**: Classes containing the core business logic of the application.
    *   **`repository`**: Data access layer (JPA/Hibernate).
    *   **`model`**:  Domain models mapped to database tables.
    <!--*   **`config`**: Configuration classes for setting up various aspects of the Spring application.-->
*   **`src/main/resources`**: Contains application resources and configuration.
    *   **`application.properties`**: Configuration properties for the Spring Boot application.
    <!--*   **`static`**: For static web resources like HTML, CSS, JavaScript, and images.
    *   **`templates`**: For server-side templates (e.g., Thymeleaf, FreeMarker). -->
*   **`src/test/java`**: Contains unit and integration tests for the application.
*   **`pom.xml`**: Maven build file. Defines dependencies, plugins and project build lifecycle.
*   **`.gitignore`**: Specifies files and directories that Git should ignore.
*    **`swagger-ui/`** Auto-generated API documentation (available at `/swagger-ui.html` when running).
---

## ⚙️ Technologies Used
- ![Java](https://img.shields.io/badge/Java-17-blue.svg) +  
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)
- ![Maven](https://img.shields.io/badge/Maven-Build-orange.svg)  
- PostgreSQL (configurable)  
- RESTful APIs  
- Swagger  

---

## 📖 API Endpoints
| Method | Endpoint                        | Description          |
|--------|---------------------------------|----------------------|
| POST   | `/api/student/create`           | Create new student   |
| GET    | `/api/student/getAll`           | Get all students     |
| PUT    | `/api/student/updateById/{id}`  | Update student by ID |
| DELETE | `/api/student/deleteById/{id}`  | Delete student by ID |

---
