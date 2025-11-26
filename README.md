# Bank Management System - Java Case Study

## 📌 Overview

This project is a **Console-based Bank Management System** implemented in **Java** following the **MVC Architecture (Model–View–Controller)**.
It supports multiple account types, transaction history, overdraft logic, salary freeze system, and loan payment management.

---

## ✨ Key Features

* Create four types of bank accounts:

  * Savings Account
  * Salary Account
  * Current Account (with overdraft limit & freeze logic)
  * Loan Account (with EMI & interest)
* Deposit & Withdraw money
* Transfer funds between accounts
* Auto-generate account numbers
* Display single account details
* View all accounts
* View account-wise & bank-wide transaction history
* Remove an account
* Auto-freeze Salary & Current accounts based on rules

---

## 🧱 Project Architecture

```
Main
 └── BankController  ← Handles user input & operations
     ├── BankModel   ← Stores all accounts & transactions
     └── BankView    ← Displays UI output
```

### Class Structure

```
Account (abstract)
  ├── SavingAccount
  ├── SalaryAccount (Freezable)
  ├── CurrentAccount (Freezable)
  └── LoanAccount (InterestApplicable)
```

---

## 🏦 Main Menu Options

```
1. Create Account
2. Remove Account
3. Deposit
4. Withdraw
5. Transfer
6. Show Account Details
7. Show Transaction History
8. Show All Accounts
9. Show All Bank Transactions
10. Exit
```

---

## 🔑 Special Functionalities

| Feature         | Description                                                     |
| --------------- | --------------------------------------------------------------- |
| Overdraft       | Current account supports overdraft up to 50,000                 |
| Account Freeze  | Auto freeze if overdraft fully used or no salary txn in 60 days |
| Loan Payment    | Deposits reduce loan rather than increase balance               |
| Transaction Log | Maintains history with txn ID, type, amount & date              |

---

## ⚙ How to Run

1. Copy all Java files into a single package
2. Compile using:

```
javac Main.java
```

3. Run application:

```
java Main
```

---

## 📁 Folder Structure Example

```
bankcaseStudy/
 ├── Main.java
 ├── BankController.java
 ├── BankModel.java
 ├── BankView.java
 ├── Account.java
 ├── SavingAccount.java
 ├── SalaryAccount.java
 ├── CurrentAccount.java
 └── LoanAccount.java
```

---

## 🚀 Future Enhancements

* GUI using JavaFX or Swing
* Database connectivity (MySQL / JDBC)
* Authentication & login system
* File-based data persistence
* Autopay EMI scheduler

---

## 👨‍💻 Developer

**Shankar Ingle**

For improvements or queries, feel free to ask!

---

### ⭐ If this helped you, keep learning & building strong Java fundamentals!
