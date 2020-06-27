package oop.samples.abstraction;

abstract class Shape {
    abstract void draw();

    void nonAbstractMethod(){
        System.out.println("This is non abstract method");
    }
}