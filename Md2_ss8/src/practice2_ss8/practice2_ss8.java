package practice2_ss8;

public class practice2_ss8 {
    public static void main(String[] args) {
//        khởi tạo đối tượng từ các lớp con
        Car car1 = new Car("toyota","black");
        Car car2 = new Car("ford","white");
//        truy cập các phương của lớp cha như set/get
        System.out.println("car 1's brand is"+car1.getBrand());
        car1.getColor();// thiết lập giá trị cho thuộc tính color
//        hiển thị thông tin của xe ô tô
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Cat cat1=new Cat("honda","red-white");
        Cat cat2=new Cat("vinfast","blue");
//        hiển thị thông tin của xe máy
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
    }
}
