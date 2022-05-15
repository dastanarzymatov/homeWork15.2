package com.company;

public class Animal {
    public Animal() {
    }

    public void eat(){
        System.out.println("com.company.Animal is eating.");
    }

    @Override
    public String toString() {
        return "com.company.Animal{}";
    }
}
