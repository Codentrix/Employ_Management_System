# Employee Management System

## Overview
The **Employee Management System** is a Java-based application that uses JDBC (Java Database Connectivity) to interact with an Oracle database. The system provides a user-friendly interface to perform basic CRUD (Create, Read, Update, Delete) operations on employee data.

## Features
1. **Add New Employee**: Insert employee records into the database.
2. **Update Employee Details**: Modify existing employee information.
3. **Delete Employee**: Remove employee records from the database.
4. **View All Employees**: Display a list of all employees stored in the database.

## Technology Stack
- **Programming Language**: Java
- **Database**: Oracle Database
- **Database Connectivity**: JDBC (Java Database Connectivity)

## Prerequisites
1. **Oracle Database**: Ensure you have Oracle Database installed and running. 
   - Username: `xe`
   - Password: `xe`
2. **Java Development Kit (JDK)**: Version 8 or above.
3. **JDBC Driver**: Oracle JDBC driver compatible with your Oracle Database version.
4. **IDE**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or a text editor with Java support.

## Database Setup
1. Create a table named `emp` in your Oracle database:

```sql
CREATE TABLE emp (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    emp_role VARCHAR2(50),
    emp_salary NUMBER
);
```

2. Ensure the database connection URL, username, and password in your Java code match your Oracle setup.
   ```java
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String username = "xe";
   String password = "xe";
   ```

## Installation
1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Open the project in your preferred IDE.
3. Add the Oracle JDBC driver (e.g., `ojdbc8.jar`) to your project's build path.
4. Compile and run the main class to launch the application.

## Usage
### Add New Employee
- Input details such as Employee ID, Name, Role, and Salary.

### Update Employee Details
- Provide the Employee ID and new details to update.

### Delete Employee
- Enter the Employee ID to delete the record.

### View All Employees
- Displays a tabular format of all employee records.

## Screenshots
Include screenshots or examples of the application in action (if applicable).

## Contributions
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Add feature"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request.


## Contact
If you have any questions, feel free to reach out:
- Email: [your-email@example.com](atulsingh81095@gmail.com)
- GitHub: [@your-github-handle]((https://github.com/Codentrix))

## Acknowledgments
- Oracle JDBC Documentation
- Java Tutorials for JDBC


