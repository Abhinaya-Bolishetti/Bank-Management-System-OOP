# Bank Management System using Core Java OOP

A console-based **Bank Management System** built using **Core Java** to understand Object-Oriented Programming concepts through a real-world application.

## Features

* Create Savings Account
* Create Current Account
* Deposit Money
* Withdraw Money
* Transfer Money
* View All Accounts
* Menu-driven console application using `Scanner`

## OOP Concepts Used

| Concept           | Implementation                                                |
| ----------------- | ------------------------------------------------------------- |
| Classes & Objects | `Customer`, `BankAccount`, `SavingsAccount`, `CurrentAccount` |
| Encapsulation     | Private fields with getters and setters                       |
| Constructors      | Initialize customer and account details                       |
| Inheritance       | `SavingsAccount` and `CurrentAccount` extend `BankAccount`    |
| Polymorphism      | Different `withdraw()` behavior using method overriding       |
| Abstraction       | `BankAccount` is an abstract class with abstract `withdraw()` |
| Interface         | `Transferable` interface for money transfer                   |
| Collections       | `ArrayList<BankAccount>` stores multiple accounts             |

## Technologies Used

* Java (Core Java)
* OOP
* Collections (`ArrayList`)
* Scanner for user input

## Project Structure

src/

* Main.java
* Customer.java
* BankAccount.java
* SavingsAccount.java
* CurrentAccount.java
* Transferable.java
* BankManagement.java

## Sample Menu

===== BANK MANAGEMENT SYSTEM =====

1. Create Savings Account
2. Create Current Account
3. Deposit Money
4. Withdraw Money
5. Transfer Money
6. View All Accounts
7. Exit

## Learning Outcome

This project was created to practice the core principles of Object-Oriented Programming in Java through a simple banking application.
