import java.util.*;
import java.io.*;

public class CoreJavaComplete {

    // Static variable
    static String college = "PSIT Kanpur";

    // Final variable
    final int MAX_MARKS = 100;

    // 1. Class and Object
    static class Student {
        String name;
        int age;

        // Constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // 2. Encapsulation
    static class Employee {
        private double salary;

        public void setSalary(double salary) {
            if (salary > 0) {
                this.salary = salary;
            }
        }

        public double getSalary() {
            return salary;
        }
    }

    // 3. Inheritance
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // 4. Polymorphism - Overriding
    static class Parent {
        void show() {
            System.out.println("Parent class");
        }
    }

    static class Child extends Parent {
        @Override
        void show() {
            System.out.println("Child class");
        }
    }

    // 5. Abstraction
    abstract static class Shape {
        abstract void area();
    }

    static class Circle extends Shape {
        void area() {
            System.out.println("Area of circle = " + (3.14 * 5 * 5));
        }
    }

    // 6. Interface
    interface Payment {
        void pay();
    }

    static class UPI implements Payment {
        public void pay() {
            System.out.println("Payment through UPI");
        }
    }

    // 7. Method Overloading
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 8. Exception Handling
    static void exceptionDemo() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    // 9. Multithreading
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {

        // VARIABLES AND DATA TYPES
        int age = 21;
        double percentage = 89.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Khushi";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // TYPE CASTING
        double num = 10.5;
        int converted = (int) num;
        System.out.println("Type Casting: " + converted);

        // OPERATORS
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Comparison: " + (a > b));

        // IF ELSE
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        // SWITCH
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // LOOPS
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop: " + i);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("While loop: " + i);
            i++;
        }

        // ARRAY
        int[] numbers = {10, 20, 30, 40};

        for (int n : numbers) {
            System.out.println("Array: " + n);
        }

        // STRINGS
        String text = "Java Programming";

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.substring(0, 4));
        System.out.println(text.contains("Java"));

        // STRING BUILDER
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb);

        // METHODS
        System.out.println("Addition: " + add(10, 20));
        System.out.println("Overloading: " + add(10, 20, 30));

        // CLASS AND OBJECT
        Student s = new Student("Khushi", 21);
        s.display();

        // STATIC VARIABLE
        System.out.println("College: " + college);

        // ENCAPSULATION
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Salary: " + emp.getSalary());

        // INHERITANCE
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // POLYMORPHISM
        Parent obj = new Child();
        obj.show();

        // ABSTRACTION
        Shape shape = new Circle();
        shape.area();

        // INTERFACE
        Payment payment = new UPI();
        payment.pay();

        // COLLECTIONS - ARRAYLIST
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("ArrayList: " + list);

        // HASHSET
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("HashSet: " + set);

        // HASHMAP
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        System.out.println("HashMap: " + map);

        // ITERATOR
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // EXCEPTION HANDLING
        exceptionDemo();

        // MULTITHREADING
        MyThread thread = new MyThread();
        thread.start();

        // LAMBDA EXPRESSION
        Runnable task = () ->
            System.out.println("Lambda expression executed");

        task.run();

        // STREAM API
        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

        nums.stream()
            .filter(n -> n > 20)
            .forEach(System.out::println);

        // OPTIONAL
        Optional<String> optional = Optional.of("Java 8");

        System.out.println(optional.orElse("Default"));

        // FILE HANDLING
        try {
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Learning Core Java");
            writer.close();

            System.out.println("File created successfully");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("Core Java Complete!");

    }
}
