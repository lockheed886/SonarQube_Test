package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        Person person = new Person("John", 30);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
    }

    public int add(int a, int b) {
        return a + b;
    }
}