# 🏥 Hospital Management System

A **console-based Java application** for managing patients, doctors, and appointments in a hospital. This project uses **JDBC** to interact with a **MySQL** database and simulates basic hospital workflows through a simple CLI.

---

## 📌 Features

- 👤 Add and view patients  
- 🧑‍⚕️ View doctor details  
- 📅 Book appointments  
- ✅ Check doctor availability  
- 💾 Store all data in MySQL using JDBC

---

## 🛠️ Tech Stack

| Technology | Use |
|------------|-----|
| Java       | Core application logic |
| JDBC       | Database connectivity |
| MySQL      | Data storage |
| SQL        | Querying and data manipulation |
| OOP        | Clean code structure |
| Exception Handling | Robust and error-tolerant |
| Scanner API | Console input handling |

---

## 🧾 Database Tables

Make sure to create the following tables in your `hospital` database:

### `patients`
```sql
CREATE TABLE patients (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    gender VARCHAR(10)
);


### Doctors

CREATE TABLE doctors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    specialization VARCHAR(100)
);
### appointments
CREATE TABLE appointments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT,
    doctor_id INT,
    appointment_date DATE,
    FOREIGN KEY (patient_id) REFERENCES patients(id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);


🚀 How to Run
Clone this repository:

bash
Copy
Edit
git clone https://github.com/your-username/hospital-management-system.git
Open the project in your IDE (Eclipse, IntelliJ, etc.)

Set up the MySQL database using the tables above.

Update DB credentials in HospitalManagementSystem.java:

java
Copy
Edit
private static final String url = "jdbc:mysql://localhost:3306/hospital";
private static final String username = "your_username";
private static final String password = "your_password";
Run the HospitalManagementSystem main class.

📸 Screenshots
You can add screenshots of your application running here.

📄 License
This project is open source and free to use for educational purposes

