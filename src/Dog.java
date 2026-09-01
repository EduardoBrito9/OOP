public class Dog extends Animal{
    String dogName;

    Dog(String dogName){
        this.dogName = dogName;
    }

    void callDog(){
        System.out.println("Hey " + dogName);
    }
}
