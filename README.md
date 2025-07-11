
# Detailed Java 🧠☕  
A beginner-friendly, educational Java programming repository — designed to explain **OOP concepts**, strengthen fundamentals, and prepare for interviews & academic courses.

> 👩‍💻 Created by **Sakiba Belal**  
> 🎓 Department of Software Engineering, NSTU

---

## 📚 About This Repository

This repository contains **detailed Java programs and class-based examples** with clear explanations. It's designed for:

- 🧒 **Beginners** just starting with Java  
- 👩‍🎓 **University students** (e.g. NSTU) following a structured course  
- 🧠 **Self-learners** revising Object-Oriented Programming  
- 💼 **Interview preparation** for Java-based roles

---

## 💡 Topics Covered

Each topic is implemented inside the `src/` directory with clean code and helpful comments. Topics include:

- ✅ Java syntax & basic programs  
- ✅ Object-Oriented Programming (OOP)  
  - Classes & Objects  
  - Inheritance  
  - Polymorphism  
  - Abstraction & Interfaces  
  - Encapsulation  
- ✅ Arrays and collections  
- ✅ File I/O basics  
- ✅ Recursion and algorithm examples  
- ✅ Real-world Java examples

---

## 🗂️ Example Folder Structure

```

DetailedJava/
├── src/
│   ├── basics/
│   ├── oop/
│   │   ├── inheritance/
│   │   ├── polymorphism/
│   ├── recursion/
│   └── fileio/
├── README.md
└── ...

````

> 💡 You can explore or organize files by topic inside the `src/` directory.

---

## 💻 How to Run

You can open this project using **any Java IDE** such as **Eclipse**, **IntelliJ IDEA**, or **NetBeans**.

### 👉 Option 1: Using IntelliJ or Eclipse

1. Clone this repo
2. Import as Java project
3. Browse to `/src` folder
4. Run individual files containing `public static void main(String[] args)`

### 👉 Option 2: Using Terminal (JDK Installed)

```bash
cd src
javac oop/inheritance/Animal.java
java oop.inheritance.Animal
````

---

## 🧠 Sample Code (OOP - Inheritance)

```java
// Animal.java
public class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog.java
public class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Output: Dog barks
    }
}
```

---

## 🎯 Learning Objectives

* Build a strong foundation in Java
* Understand core **OOP principles** and how Java implements them
* Prepare for university courses and practical lab exams
* Get ready for technical interviews with hands-on examples

---


---

## 💬 Feedback

This project is made with ❤️ to help fellow learners.
Feel free to open an issue or connect with me if you find it helpful or have suggestions.

---

```
