package practice2_ss8;

public class Cat extends Vehicle{
    public Cat() {

    }

    public Cat(String brand,String color){
        super(brand,color);
    }

    public String toString(){
        return "Motorcycle{"+
                "brand='"+this.getBrand()+'\''+
                ",color='"+this.getColor()+'\''+
                '}';
    }

}
