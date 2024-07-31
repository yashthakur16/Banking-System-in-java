
---

# Banking System in Java

## Project Overview
This project is a simple banking system implemented in Java. It allows users to manage bank accounts, including savings and checking accounts, with basic operations such as deposit, withdrawal, and balance inquiry.

## Features
- **Bank Account Management**: Supports both savings and checking accounts.
- **Deposit and Withdrawal**: Users can deposit and withdraw money from their accounts.
- **Balance Inquiry**: Users can check the balance of their accounts.

## Tech Stack
- **Java**: Core programming language.
- **Java Development Kit (JDK)**: Used for compiling and running the Java code.
- **Integrated Development Environment (IDE)**: Recommended for editing and running the project, such as IntelliJ IDEA or Eclipse.

## Project Structure
The project is organized into several Java classes, each responsible for different aspects of the banking system:

```
Banking-System-in-java/
├── BankAccount.java            # Interface defining basic account operations
├── BankCustomer.java           # Class for managing customer accounts
├── CheckingAccount.java        # Implementation of BankAccount for checking accounts
├── SavingsAccount.java         # Implementation of BankAccount for savings accounts
├── Main.java                   # Entry point of the application
```

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yashthakur16/Banking-System-in-java
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd Banking-System-in-java
   ```
3. **Compile the Java Files**:
   ```bash
   javac Main.java
   ```
4. **Run the Application**:
   ```bash
   java Main
   ```

## How It Works
- **Main Class**: The entry point of the application, which interacts with the user.
- **BankAccount Interface**: Defines the basic operations for a bank account (deposit, withdraw, getBalance).
- **SavingsAccount & CheckingAccount Classes**: Implement the BankAccount interface for savings and checking accounts.
- **BankCustomer Class**: Manages a customer's accounts and handles operations based on user input.

---
