package oop.samples.polymophism;

public class Splender extends Bike{
    int speedLimit = 100; 
    
    @Override
    void run() {
        System.out.println("running safely with 60km");
    }
}