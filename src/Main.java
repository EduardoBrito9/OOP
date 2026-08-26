//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student student1 = new Student("Eduardo", "ComputerScience", 19, 4.0, "SWE at Google");

    student1.study();

    // overloaded constructors = Allow a class to have multiple constructors with different parameter lists.
    // Enable objects to be initialized in various ways.

    User user1 = new User("Patrick");
    User user2 = new User("Patrick", "pStar@outlook.com");
    User user3 = new User("Patrick", "pStar@outlook.com", 99);

    Car car1 = new Car("Mustang", "black", 2016);
    Car car2 = new Car("Porsche", "white", 2022);
    Car car3 = new Car("BYD king", "grey", 2025);

    Car[] cars = {car1, car2, car3};
    //you can pass in anonymous objects too.

    for(Car car : cars){
        System.out.println(car.model + " " + car.color + " " + car.year);
        car.velocityCar();
    }
}
