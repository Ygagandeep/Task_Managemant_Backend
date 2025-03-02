# Task_Managemant_Backend

 **Project Overview**

The Task Management System is a Spring Boot application that provides authentication and CRUD operations for managing tasks. The application uses JWT authentication to secure endpoints and MySQL as the database.

🚀 Setup and Running Instructions

1️⃣ Prerequisites

Ensure you have the following installed:

Java 17+

Maven

MySQL

Postman (for API testing, optional)

2️⃣ Database Setup

Create a MySQL database:

CREATE DATABASE task_db;

Update the database credentials in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/task_db
spring.datasource.username=root
spring.datasource.password=root@123

3️⃣ Running the Application

Navigate to the project root directory.

Build and run the application:

mvn clean install
mvn spring-boot:run

The server will start at: http://localhost:8081

4️⃣ API Endpoints

🔹 Authentication

Signup: POST /api/auth/signup

Login: POST /api/auth/login

🔹 Task Management (Requires JWT Token)

Get Tasks: GET /api/task

Create Task: POST /api/task

Update Task: PUT /api/task/{id}

Delete Task: DELETE /api/task/{id}

5️⃣ Testing with Postman

Login to Get JWT Token

Use the POST /api/auth/login endpoint.

Copy the returned JWT token.

Use JWT Token for Protected APIs

In Postman, go to Authorization and select Bearer Token.

Paste the token and send requests to protected endpoints.

📝 Assumptions

An initial admin account is created automatically when the application starts.

Tasks are assigned by email, ensuring only registered users can be assigned.

JWT expiration time is set, requiring users to re-authenticate after expiry.

🛠️ Technologies & Libraries Used

Spring Boot 3+ (Framework)

Spring Security (Authentication & Authorization)

JWT (JSON Web Token) (Token-based security)

MySQL (Database)

Hibernate & JPA (ORM for database operations)

Maven (Dependency management)

Lombok (Reducing boilerplate code)

⚡ Challenges & Solutions

1️⃣ Handling 403 Forbidden Errors

Issue: Requests to secured endpoints were blocked.

Solution: Ensured JWT token was properly extracted and validated in the Authorization header.

2️⃣ Managing User Roles & Permissions

Issue: Restricting access based on roles (Admin vs Employee).

Solution: Configured Spring Security to allow role-based access control (RBAC).

3️⃣ Password Encryption

Issue: Storing plain-text passwords posed a security risk.

Solution: Used BCryptPasswordEncoder to hash passwords before saving them in the database.
