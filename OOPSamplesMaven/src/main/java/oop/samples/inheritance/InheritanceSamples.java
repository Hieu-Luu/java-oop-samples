package oop.samples.inheritance;

public class InheritanceSamples {

    // Kế thừa có 4 loại
    // 1. Đơn kế thừa (Single Inheritance)
    // 2. Kế thừa nhiều tầng (Multilevel Inheritance)
    // 3. Kế thừa phân cấp (Hierarchical Inheritance)
    // 4. Đa kế thừa (Multiple Inheritance)
    // Chú ý: Java hỗ trợ đa kế thừa dùng interface
    public static void main(String[] args) {
        // Single Inheritance
        System.out.println("1. Single Inheritance" +
                           "lớp Developer có thể truy cập thuộc tính và phương thức lớp cha Employee");
        Developer developer = new Developer();
        developer.setSalary(1000);
        developer.setBonus(500);
        developer.setJobDescription("code app");
        developer.devPositionInfo();

         // Multilevel Inheritance
         System.out.println("2. Multilevel Inheritance" +
                            "lớp BabyDog có thể truy cập thuộc tính và phương thức các lớp cha và ông Dog, Animal");
         BabyDog babyDog = new BabyDog();
         babyDog.eat();
         babyDog.bark();
         babyDog.weep();

         // Hierarchical Inheritance
         System.out.println("2. Hierarchical Inheritance" +
         "lớp Dog và Cat cùng kế thừa Animal và có thể truy cập thuộc tính và phương thức của lớp cha");
         Dog dog = new Dog();
         dog.eat();
         dog.bark();
         Cat cat = new Cat();
         cat.eat();
         cat.meow();
         
    }    
}