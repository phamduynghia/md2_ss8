package practice2_ss8;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, String color) {
        super(brand, color);
    }

    public String toString(){
        return "Car{"+
                "brand='"+this.getBrand()+'\''+
                ",color='"+this.getColor()+'\''+
                '}';
    }
}
