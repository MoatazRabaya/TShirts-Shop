# T-shirt Shop Project

This is my Java project for a T-shirt shop system.  
It shows how to use four design patterns:  
**Factory**, **Decorator**, **Observer**, and **Singleton**.

---

## 🧩 Project Idea

The shop sells T-shirts of different **sizes** and **regions**:
- Sizes: Small, Medium, Large  
- Regions: China, Middle East, Asia  

Each T-shirt has a **name**, **description**, and a **formSize()** method that prints the size information.

Customers can also **customize** their T-shirt by adding features:
- Red color  
- Blue color  
- Bird logo  
- Text “Nice Day!”

The shop owner wants to know how many shirts have been sold for each size.

---

## 🏗️ Design Patterns Used

1. **Factory Pattern**  
   Used to create different T-shirts based on region and size.  
   Example: `TshirtFactoryChinaStandard` creates T-shirts for Chinese customers.

2. **Decorator Pattern**  
   Used to add extra features (like logo, text, color) to the T-shirts without changing the main class.

3. **Observer Pattern**  
   Used so the shop owner gets notified whenever a new T-shirt is sold.

4. **Singleton Pattern**  
   Used for the `SalesManagement` class to make sure there is only one object managing sales.

---


 TshirtShopProject/
  ├── Main.java
  │
  ├── tshirt/
  │   ├── Tshirt.java
  │   ├── TshirtDecorator.java
  │   ├── TshirtRedDecorator.java
  │   ├── TshirtBlueDecorator.java
  │   ├── TshirtLogoDecorator.java
  │   ├── TshirtTextDecorator.java
  │
  ├── factory/
  │   ├── TshirtFactory.java
  │   ├── TshirtFactoryChinaStandard.java
  │   ├── TshirtFactoryAsiaStandard.java
  │   ├── TshirtFactoryMiddleEastStandard.java
  │
  ├── products/
  │   ├── TshirtChinaSmall.java
  │   ├── TshirtChinaMedium.java
  │   ├── TshirtChinaLarge.java
  │   ├── TshirtAsiaSmall.java
  │   ├── TshirtAsiaMedium.java
  │   ├── TshirtAsiaLarge.java
  │   ├── TshirtMiddleEastSmall.java
  │   ├── TshirtMiddleEastMedium.java
  │   ├── TshirtMiddleEastLarge.java
  │
  ├── observer/
  │   ├── Observer.java
  │   ├── Subject.java
  │   ├── SalesManagement.java
  │   ├── ShopOwner.java

  └── README.md
