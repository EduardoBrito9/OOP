public class Car {
    String model;
    String color;
    int year;

    Car(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void velocityCar(){
        System.out.println(this.model +  " is fast");
    }

}
