package oop.samples.polymophism;

import oop.samples.inheritance.Animal;
import oop.samples.inheritance.BabyDog;
import oop.samples.inheritance.Dog;


// Một tác vụ được thực hiện theo nhiều cách khác nhau
// Có 2 kiểu đa hình: lúc compile và lúc runtime
// Khi việc gọi phương thức được quyết định bởi JVM chứ không phải Compiler, vì thế đó là đa hình lúc runtime.
// Đa hình tại runtime không thể có được bởi thuộc tính
// Có 2 cách thực hiện đa hình: override, overload
public class PolymorphismSamples {
    public static void main(String[] args) {
        
        System.out.println("1. Runtime polymorphism" +
        "\n Splender extend Bike, 2 bố con đều có phương thức run()"+
        "\n khi upcasting Bike tới Splender Bike b = new Splender(); thì gọi phương thức run() sẽ gọi của Splender");
        Bike b = new Splender(); // upcasting
        b.run();

        System.out.println("\nĐa hình tại runtime không thể có được bởi thuộc tính" +
        "\nKhi chúng ta truy cập thành viên dữ liệu mà không bị ghi đè, thì nó sẽ luôn luôn truy cập thành viên dữ liệu của lớp cha.");
        Bike obj = new Splender();  
        System.out.println("speedLimit: " + obj.speedLimit);//90  

        System.out.println("\nĐa hình với Multilevel Inheritance");
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();

    }
}