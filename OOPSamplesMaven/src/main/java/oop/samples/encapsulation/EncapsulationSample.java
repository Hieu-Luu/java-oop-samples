package oop.samples.encapsulation;

public class EncapsulationSample {

    // Đóng gói sử dụng để giấu thông tin, chỉ hiện ra các thông tin cần thiết
    // để các class không chia sẻ dữ liệu với nhau được 
    // Bảo vệ trạng thái bên trong đối tượng. Việc thay đổi đối tượng chỉ thực hiện
    // thông qua các phương thức public
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguyen Quang Hai");
        student.getName();
        student.printSutentInfo();
    }    
}