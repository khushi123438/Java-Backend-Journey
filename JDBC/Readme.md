# ☕ JDBC – Java Database Connectivity

This folder contains my practical learning and implementation of **JDBC (Java Database Connectivity)** using **Java and MySQL**.

JDBC is a Java API that allows Java applications to connect with databases, execute SQL queries, and perform database operations.

---

## 📚 Topics Covered

### 1. JDBC Introduction
- What is JDBC?
- JDBC Architecture
- JDBC Drivers
- Connecting Java with MySQL

### 2. Database Connection
- `DriverManager`
- `Connection`
- Database URL
- MySQL connection setup

### 3. Statement
Used to execute simple SQL queries.

```java
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM students");
```

---

### 4. PreparedStatement
Used to execute parameterized SQL queries safely.

```java
PreparedStatement ps =
    con.prepareStatement(
        "SELECT * FROM students WHERE course = ?"
    );

ps.setString(1, "Computer Science");
```

---

### 5. CRUD Operations

Implemented database operations using JDBC:

- ➕ Create – Insert data
- 📖 Read – Fetch data
- ✏️ Update – Modify data
- 🗑️ Delete – Remove data

---

### 6. CallableStatement
Used to call stored procedures from Java.

```java
CallableStatement cs =
    con.prepareCall("{CALL getStudentsByCourse(?)}");
```

---

### 7. ResultSet
Used to store and process data returned by SQL queries.

Common methods:

- `next()`
- `previous()`
- `first()`
- `last()`
- `absolute()`

---

### 8. ResultSet Types

- `TYPE_FORWARD_ONLY`
- `TYPE_SCROLL_INSENSITIVE`
- `TYPE_SCROLL_SENSITIVE`

---

### 9. Transaction Management

Transactions ensure that multiple database operations are executed safely.

Important methods:

```java
con.setAutoCommit(false);
con.commit();
con.rollback();
```

Example use case: **Bank money transfer**, where both debit and credit operations should succeed together.

---

### 10. Batch Processing

Used to execute multiple SQL operations together for better performance.

```java
ps.addBatch();
ps.executeBatch();
```

---

### 11. DAO Pattern

DAO stands for **Data Access Object**.

It separates:

- Database logic
- Business logic
- Application logic

Typical structure:

```text
Model Class
    ↓
DAO Class
    ↓
Database
```

---

## 🛠️ Technologies Used

- ☕ Java
- 🐬 MySQL
- 🔗 JDBC
- 💻 IntelliJ IDEA / VS Code
- 🗄️ MySQL Workbench

---

## 🔑 Important JDBC Components

| Component | Purpose |
|---|---|
| `DriverManager` | Establishes database connection |
| `Connection` | Represents database connection |
| `Statement` | Executes simple SQL queries |
| `PreparedStatement` | Executes parameterized queries |
| `CallableStatement` | Calls stored procedures |
| `ResultSet` | Stores query results |

---

## 🔄 JDBC Workflow

```text
Java Application
      ↓
JDBC API
      ↓
JDBC Driver
      ↓
MySQL Database
```

---

## 🎯 Learning Outcome

Through this JDBC module, I learned how to:

- Connect Java applications with MySQL
- Execute SQL queries using JDBC
- Perform CRUD operations
- Use Statement and PreparedStatement
- Call stored procedures using CallableStatement
- Handle ResultSet and its different types
- Manage database transactions
- Perform batch operations
- Implement the DAO design pattern

---

⭐ This repository is part of my **Java Backend Development Journey**, where I am learning and implementing backend development concepts step by step.
