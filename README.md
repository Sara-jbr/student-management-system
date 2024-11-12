# Student Management System

A simple, robust Student Management System built with Spring Boot, Thymeleaf, and MySQL. This project demonstrates the basic CRUD operations, pagination, and search functionality required for managing student data.

## Technologies Used

- **[Spring Boot](https://spring.io/projects/spring-boot)** - Backend framework for Java-based web applications.
- **[Thymeleaf](https://www.thymeleaf.org/)** - Templating engine for server-side rendering of HTML.
- **[MySQL](https://www.mysql.com/)** - Relational database to store and manage student data.
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** - ORM tool to simplify database interactions.

## Overview

This **Student Management System** provides an intuitive web interface to manage student records efficiently. Users can create, view, update, and delete student information. Additionally, the system includes search and pagination features to help users easily navigate large datasets.

## Features

- **CRUD Operations**: Create, Read, Update, and Delete student records.
- **Pagination**: Browse through student records page-by-page.
- **Search**: Easily search for specific student details.
- **Responsive UI**: Built with Thymeleaf templates for a responsive and user-friendly interface.

## Getting Started

Follow these steps to set up the project locally:

1. **Clone the Repository**
    ```bash
    git clone https://github.com/RameshMF/student-management-system-springboot.git
    cd student-management-system-springboot
    ```

2. **Set Up MySQL Database**
   - Ensure MySQL is installed and running.
   - Create a database named `student_management_system`.
   - Update `application.properties` with your database credentials:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/student_management_system
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     ```

3. **Run the Application**
    ```bash
    mvn spring-boot:run
    ```
