# Hospital Management System (CLI-Based Java Project)

## Overview
This is a Java-based command-line application that simulates core hospital operations including:
- Patient Management
- Appointment Scheduling
- Medical Record Management
- Prescription Issuance
- Billing and Payment Tracking

Built using Java 17, Maven, JPA (Hibernate), and MySQL.

## Features
- Register and View Patients
- Book and View Appointments
- Add and View Medical Records
- Issue and View Prescriptions
- Generate and View Bills

## Technologies Used
- Java 17
- Maven
- Hibernate (JPA)
- MySQL
- CLI (Text-based interaction)

## Setup Instructions
1. **Create MySQL Database**
   ```sql
   CREATE DATABASE hms_db;
   ```

2. **Configure `persistence.xml`**
   Edit `src/resources/META-INF/persistence.xml` and update:
   ```xml
   <property name="javax.persistence.jdbc.user" value="your_mysql_user"/>
   <property name="javax.persistence.jdbc.password" value="your_mysql_password"/>
   ```

3. **Build and Run**
   ```bash
   mvn clean install
   java -cp target/hospital-management-system-1.0-SNAPSHOT.jar com.hms.Main
   ```

## Contributors
- Aastha Kaushik
- Manpreet Singh
- Simranjeet Kaur
- Rupinder

## License
This project is for academic use.
