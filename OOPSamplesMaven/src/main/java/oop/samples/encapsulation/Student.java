package oop.samples.encapsulation;

public class Student {

    /*
    * Thuộc tính name là private được đóng gói trong class Student.
    * Thuộc tính được bảo vệ, class không thể truy cập trực tiếp
    */ 
    private String name;


    /*
    * Class khác chỉ có thể lấy giá trị của thuộc tính name thông qua phương thức public này
    * từ instance của Student
    * Class khác không thể biết logic code trong class Student để lấy giá trị của thuộc tính name   
    */
    public String getName() {
        return name;
    }

    /*
    * Class khác chỉ có thể gán giá trị vào thuộc tính name thông qua lời gọi phương thức public này
    * từ một instance của Student
    * Class khác không thể biết logic code trong class Student để gán giá trị cho thuộc tính name   
    */
    public void setName(String name) {
        this.name = name;
    }

     /*
    * Class khác chỉ có thể in thông tin học sinh thông qua phương thức public này
    * từ instance của Student
    * Class khác không thể biết logic code trong class Student để in thông tin học sinh   
    */
    public void printSutentInfo(){
        System.out.println(getStudentInfo());
    }


    /*
    * phương thức private, chỉ đối tượng Student có thể gọi phương thức này
    * Đối tượng khác ko thể truy cập và biết logic  
    */
    private String getStudentInfo(){
        return "Student: " + name;
    }
    
}