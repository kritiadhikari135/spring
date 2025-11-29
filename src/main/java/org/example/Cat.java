package org.example;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("mew");
    }

    @Override
    public void feature() {
        System.out.println("has long fur");

    }
}
