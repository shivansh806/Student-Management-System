# 🎓 Student Management System

A RESTful CRUD application built with Spring Boot to manage student records efficiently. This project demonstrates core backend development skills including REST API design, database integration, and clean code architecture.

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Sample Requests & Responses](#sample-requests--responses)
- [Future Enhancements](#future-enhancements)
- [Author](#author)

## 📖 About the Project

The Student Management System is a backend REST API application that allows users to perform Create, Read, Update, and Delete (CRUD) operations on student data. It follows a standard layered architecture with separation of concerns across controllers, services, repositories, and entities. The application implements input validation and global exception handling for robust error management.

## ✨ Features

- ➕ Add a new student
- 📄 Retrieve all students
- 🔍 Get a student by ID
- ✏️ Update student details
- ❌ Delete a student
- ✅ Input validation using Bean Validation
- ⚠️ Global exception handling with meaningful error responses

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| **Language** | Java 17+ |
| **Framework** | Spring Boot 3.x |
| **Build Tool** | Maven |
| **Database** | MySQL / H2 (dev) |
| **ORM** | Spring Data JPA (Hibernate) |
| **API Style** | REST |
| **Testing Tool** | Postman / Swagger UI |

## 📁 Project Structure

```
student-management-system/
├── src/
│   └── main/
│       ├── java/com/rest/RestApi/
│       │   ├── controller/
│       │   │   └── StudentController.java
│       │   ├── dto/
│       │   │   ├── ActualStudentData.java
│       │   │   └── StudentDto.java
│       │   ├── entity/
│       │   │   └── Student.java
│       │   ├── repository/
│       │   │   └── StudentRepository.java (interface)
│       │   ├── service/
│       │   │   ├── imp/
│       │   │   │   └── StudentServiceImp.java
│       │   │   └── StudentService.java (interface)
│       │   └── RestApiApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- Java JDK 17+
- Maven 3.6+
- MySQL (or use the built-in H2 for development)
- Git

### Installation

1. **Clone the repository**

```bash
git clone https://github.com/shivansh806/Student-Management-System.git
cd Student-Management-System
```

2. **Configure the database** (see [Configuration](#configuration) section)

3. **Build the project**

```bash
mvn clean install
```

4. **Run the application**

```bash
mvn spring-boot:run
```

5. **Access the API**

```
http://localhost:8080/api/students
```

## ⚙️ Configuration

Update `src/main/resources/application.properties` with your database credentials:

```properties
# Application
spring.application.name=RestApi
server.port=8080

# MySQL Database
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

**💡 Tip:** For quick local testing without MySQL, switch to H2 in-memory database by changing the datasource config to H2.

## 📦 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| POST | `/api/students` | Create a new student |
| PUT | `/api/students/{id}` | Update student details |
| DELETE | `/api/students/{id}` | Delete a student |

## 📦 Sample Requests & Responses

### ➕ Create Student — POST `/api/students`

**Request Body:**

```json
{
  "name": "Rahul Sharma",
  "email": "rahul.sharma@example.com",
  "department": "Computer Science",
  "age": 21
}
```

**Response — 201 Created:**

```json
{
  "id": 1,
  "name": "Rahul Sharma",
  "email": "rahul.sharma@example.com",
  "department": "Computer Science",
  "age": 21
}
```

### ❌ Student Not Found — GET `/api/students/99`

**Response — 404 Not Found:**

```json
{
  "timestamp": "2025-04-24T10:30:00",
  "status": 404,
  "error": "Student not found with id: 99"
}
```

## 🔮 Future Enhancements

- Add pagination and sorting for `GET /api/students`
- Integrate Spring Security with JWT-based authentication
- Add Swagger / OpenAPI documentation
- Write Unit and Integration tests using JUnit 5 & Mockito
- Dockerize the application
- Deploy to AWS / Render / Railway
- Add student course enrollment functionality
- Implement role-based access control (RBAC)

## 👤 Author

**Shivansh Kumar**

- 📧 [Email](mailto:shivanshsingh806@gmail.com)
- 🔗 [LinkedIn](https://www.linkedin.com/in/shivansh806/)
- 🐙 [GitHub](https://github.com/shivansh806)

---

**Happy coding! If you found this project helpful, please consider giving it a ⭐**
