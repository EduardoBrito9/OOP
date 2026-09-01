public class Car {
    String make;
    String model;
    String color;
    int year;

    Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void velocityCar(){
        System.out.println(this.model +  " is fast");
    }

    @Override
    public String toString(){
        return this.make + " " + this.model + " " + this.color + " " + this.year;
    }


}
