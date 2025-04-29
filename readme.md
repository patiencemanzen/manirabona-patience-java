# Project Overview

This repository contains three systems implemented in Java:

1. **Motor Insurance System**: Manages insurance policies, claims, and vehicles.
2. **Online Shopping System**: Handles shopping items, carts, and payments.
3. **Stock Management System**: Tracks inventory, suppliers, and warehouses.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Docker installed on your system

## Setup Instructions

### Running the Project with Docker

#### Option 1: Build and Run Locally

1. **Build the Docker Image**:

   ```bash
   docker build -t 26685-manirabona-patience-java .
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it 26685-manirabona-patience-java
   ```

3. **Navigate and Execute**:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd motor-insurance-system
   javac Main.java
   java Main
   ```

#### Option 2: Use Docker Registry

1. **Pull the Prebuilt Docker Image**:

   ```bash
   docker pull patienceman/26685-manirabona-patience-java
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it patienceman/26685-manirabona-patience-java
   ```

3. **Navigate and Execute**:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd motor-insurance-system
   javac Main.java
   java Main
   ```

### Running Locally

1. Clone the repository:

   ```bash
   git clone https://github.com/patiencemanzen/manirabona-patience-java.git 
   ```

2. Navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd motor-insurance-system
   javac Main.java
   java Main
   ```

## Project Structure

```
Dockerfile
Makefile
readme.md

motor-insurance-system/
    ├── Claim.java
    ├── CollisionPolicy.java
    ├── ComprehensivePolicy.java
    ├── InsurancePolicy.java
    ├── LiabilityPolicy.java
    ├── Main.java
    ├── Person.java
    ├── RoadsideAssistancePolicy.java
    ├── ThirdPartyPolicy.java
    └── Vehicle.java

online-shopping-system/
    ├── AccessoriesItem.java
    ├── BooksItem.java
    ├── ClothingItem.java
    ├── Customer.java
    ├── ElectronicsItem.java
    ├── GroceriesItem.java
    ├── Main.java
    ├── Payment.java
    ├── ShoppingCart.java
    └── ShoppingItem.java

stock-management/
    ├── ClothingItem.java
    ├── ElectronicsItem.java
    ├── FurnitureItem.java
    ├── GroceryItem.java
    ├── Main.java
    ├── PerishableItem.java
    ├── Product.java
    ├── StockItem.java
    ├── Supplier.java
    └── Warehouse.java
```

## License

This project is licensed under the MIT License.
