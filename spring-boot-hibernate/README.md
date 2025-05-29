# 🧑‍💻 Student Management System (Spring Boot + Hibernate)

A beginner-friendly, full-stack RESTful Student Management Application using Spring Boot, Hibernate (JPA), and MySQL.

---

##  Concepts Covered (With Notes)

### 1. Spring Boot

- Simplifies Java backend development.
- Uses embedded servers like **Tomcat**.
- Has `@SpringBootApplication` to bootstrap the app.
- Provides `application.properties` for configuration.

---

### 2. Hibernate / JPA

- Hibernate is a JPA implementation.
- Used for ORM (Object-Relational Mapping).
- Auto-generates tables using Java classes.
- Annotations used:
  - `@Entity`, `@Table`, `@Id`, `@GeneratedValue`

---

### 3. MySQL Database

- JDBC URL: `jdbc:mysql://localhost:3306/student_db`
- Configuration set in `application.properties`

---

## Project Structure

src/main/java/com/sachin/
│
├── controller # Handles HTTP requests (REST)
├── service # Business logic layer
├── repository # Interface for data operations (JPA)
├── model # Entity classes (Student.java)
├── exception # Custom exception handling
└── StudentApp.java # Main application class
---

##  Setup Instructions (Step-by-Step)

### Step 1: Create a Spring Boot Project
- Use [Spring Initializr](https://start.spring.io/)
- Select:
  - Maven Project
  - Java 17+
  - Dependencies: Spring Web, Spring Data JPA, MySQL Driver, Lombok

---

### Step 2: Add Properties (`src/main/resources/application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
