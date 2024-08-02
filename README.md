# Student Management System

## Overview
The Student Management System is a robust application developed using Spring Boot. It features comprehensive functionalities for managing student information, course enrollment, and academic performance tracking. The application follows best practices in software development, ensuring a scalable and maintainable codebase. This project supports all CRUD operations and utilizes various HTTP methods (GET, POST, PUT, DELETE) with multiple routes.

## Features
- **Student Management**: Add, update, and delete student information.
- **Course Enrollment**: Manage student enrollments in various courses.
- **Grade Tracking**: Record and track student grades and academic performance.
- **User Interface**: Intuitive and user-friendly interface for seamless navigation and interaction.

## Technologies Used
- **Spring Boot**: Main framework for the application.
- **Thymeleaf**: Template engine for rendering views.
- **Spring Security**: Handles authentication and authorization.
- **Hibernate/JPA**: ORM for database operations.
- **PostgreSQL**: Database for storing persistent data.
- **Maven**: Dependency management and build tool.

## Getting Started

### Prerequisites
- **Java 8 or higher**
- **Maven**
- **Git**

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/Abd-pathan/student-management-system.git
   cd student-management-system
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```

### Running the Application
1. Run the application:
   ```sh
   mvn spring-boot:run
   ```
2. Access the application:
   Open your web browser and go to [http://localhost:8080](http://localhost:8080)

## Usage

### Routes and Functionality
- **GET /home**: Returns the home page.
- **GET /students**: Fetches and displays all students.
- **GET /students/new**: Displays the form to create a new student.
- **POST /students**: Saves a new student.
- **GET /students/edit/{id}**: Displays the form to edit a student.
- **POST /students/edit/{id}**: Updates an existing student.
- **GET /students/{id}**: Deletes a student by ID.

### Running Tests
To run tests, use the following command:
```sh
mvn test
```

## Contributing
Contributions are welcome! Please read the contributing guidelines before submitting a pull request.

## Contact
For any inquiries or feedback, please reach out to:

**Name**: Abd Pathan  
**Email**: abd.pathan812@gmail.com]

Feel free to customize this template to better fit the specifics of your project, such as adding more details about the features, instructions, or other relevant information.
