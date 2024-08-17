package practice1_ss8;

public class practice1_ss8 {
    public static void main(String[] args) {
//        tạo các đối tượng từ các lớp
        Animal animal = new Animal("pig");
        Dog dog1 = new Dog("becgie", "black");
        Dog dog2 = new Dog("pug", "white");
        Cat cat = new Cat("Dora");
//        dùng các phương thức get/set truy cập vào thay đổi thuộc tính
        System.out.println("animal's name is " + animal.getName());
        animal.setName("Bird");
        System.out.println("animal's name is " + animal.getName());
//         truy cập phương thức kế thừa từ lớp cha
        dog1.setName("Corgi");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Sound: " + dog1.makeSound());
        System.out.println("Color: " + dog2.getColor());
        System.out.println("Sound: " + dog2.makeSound());
        System.out.println("Name: " + cat.getName());
        System.out.println("Sound: " + cat.makeSound());
    }
}
