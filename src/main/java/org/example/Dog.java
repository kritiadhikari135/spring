package org.example;

public class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void feature() {
        System.out.println("has short fur");

    }
}
