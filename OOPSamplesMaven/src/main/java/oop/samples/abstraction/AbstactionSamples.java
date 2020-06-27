package oop.samples.abstraction;

public class AbstactionSamples {

    // Ẩn các chi tiết trình triển khai, chỉ hiện thị tính năng đến người dùng
    public static void main(String args[]) { 
        Bike bike = new Honda();  
        bike.run();  

        Shape shape = new Circle();
        shape.draw(); 
        shape.nonAbstractMethod();
        shape = new Rectangle();
        shape.draw();
    }
}