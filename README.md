🎓 Student Management System
A RESTful CRUD application built with Spring Boot to manage student records efficiently. This project demonstrates core backend development skills including REST API design, database integration, and layered architecture.

📋 Table of Contents

About the Project
Features
Tech Stack
Project Structure
Getting Started
Configuration
Sample Request & Response
Future Enhancements
Author


📖 About the Project
The Student Management System is a backend REST API application that allows users to perform Create, Read, Update, and Delete (CRUD) operations on student data. It follows a standard layered architecture (Controller → Service → Repository) and is built using Spring Boot with a relational database.

✨ Features

➕ Add a new student
📄 Retrieve all students
🔍 Get a student by ID
✏️ Update student details
❌ Delete a student
✅ Input validation using Bean Validation
⚠️ Global exception handling with meaningful error responses


🛠️ Tech Stack
LayerTechnologyLanguageJava 17+FrameworkSpring Boot 3.xBuild ToolMavenDatabaseMySQL / H2 (dev)ORMSpring Data JPA (Hibernate)API StyleRESTTesting ToolPostman / Swagger UI

📁 Project Structure
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
│       │   │   └── studentRepository.java        (interface)
│       │   ├── service/
│       │   │   ├── imp/
│       │   │   │   └── StudentServiceImp.java
│       │   │   └── studentservice.java           (interface)
│       │   └── RestApiApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md

🚀 Getting Started
Prerequisites
Make sure you have the following installed:

Java JDK 17+
Maven 3.6+
MySQL (or use the built-in H2 for development)
Git

Installation

Clone the repository

bash   git clone https://github.com/your-username/RestApi.git
   cd RestApi

Configure the database (see Configuration)
Build the project

bash   mvn clean install

Run the application

bash   mvn spring-boot:run

Access the API

   http://localhost:8080/api/students

⚙️ Configuration
Update src/main/resources/application.properties with your database credentials:
properties# Application
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

💡 Tip: For quick local testing without MySQL, switch to H2 in-memory database by changing the datasource config to H2.

📦 Sample Request & Response

➕ Create Student — POST /api/students
Request Body:
json{
  "name": "Rahul Sharma",
  "email": "rahul.sharma@example.com",
  "department": "Computer Science",
  "age": 21
}
Response — 201 Created:
json{
  "id": 1,
  "name": "Rahul Sharma",
  "email": "rahul.sharma@example.com",
  "department": "Computer Science",
  "age": 21
}

❌ Student Not Found — GET /api/students/99
Response — 404 Not Found:
json{
  "timestamp": "2025-04-24T10:30:00",
  "status": 404,
  "error": "Student not found with id: 99"
}

🔮 Future Enhancements

 Add pagination and sorting for GET /api/students
 Integrate Spring Security with JWT-based authentication
 Add Swagger / OpenAPI documentation
 Write Unit and Integration tests using JUnit 5 & Mockito
 Dockerize the application
 Deploy to AWS / Render / Railway


👤 Author
Shivansh Kumar
📧 shivanshsingh806@gmail.com
🔗 [LinkedIn ](https://www.linkedin.com/in/shivansh806/)
