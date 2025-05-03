# Library Management - Spring Boot Web Application

## 📘 Project Overview

This is a simple web application built with **Spring Boot** that allows users to manage **authors** and their **books**. It was developed as a homework assignment to demonstrate CRUD functionality, MVC architecture, form validation, and basic data persistence.

---

## 🚀 How to Run

1. Make sure you have **Java 17** and **Maven** installed.
2. Open your terminal and navigate to the project folder.
3. Run the app using:

```bash
mvn spring-boot:run
```

4. Open your browser and visit: [http://localhost:9090](http://localhost:9090)

---

## ✅ Features

| Feature | Description |
|--------|-------------|
| Add Authors | Fill a form to create new authors |
| Add Books | Add a book and assign an existing author |
| View All Authors | See a list of all authors |
| View All Books | See a list of all books with their authors |
| Author Details | View author info and their books |
| Book Details | View book info and its author |
| Edit/Delete Authors | Modify or remove existing authors |
| Edit/Delete Books | Modify or remove existing books |
| Persistent Storage | Data is saved using H2 file-based database |
| Port 9090 | Runs on custom port 9090 instead of default 8080 |

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (file-based)
- Thymeleaf
- Maven

---

## 📂 Application Structure

```
src
├── main
│   ├── java
│   │   └── com.example.library
│   │       ├── controller     # Web controllers
│   │       ├── model          # JPA entity classes
│   │       └── repository     # Spring Data repositories
│   └── resources
│       ├── templates          # Thymeleaf views (books & authors)
│       └── application.properties
└── test                       # (empty for now)
```

---

## 👤 Author

Raymond Padya  


---
