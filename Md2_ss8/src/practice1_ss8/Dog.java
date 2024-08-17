package practice1_ss8;

public class Dog extends Animal {
     private String color;
     public Dog() {

     }
     public Dog(String color, String name) {
//     gọi đến contructor của lớp Animal
    super(name);
     this.color=color;
}
public String getColor() {
         return color;
}
public void setColor(String color) {
         this.color = color;
}
public String makeSound(){
         return "gau gau";
}
}
