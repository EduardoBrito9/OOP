//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student student1 = new Student("Eduardo", "Brito", "Computer Science", 19, 19, "SWE at Google");

    student1.study();
    // overloaded constructors = Allow a class to have multiple constructors with different parameter lists.
    // Enable objects to be initialized in various ways.

    User user1 = new User("Patrick");
    User user2 = new User("Patrick", "pStar@outlook.com");
    User user3 = new User("Patrick", "pStar@outlook.com", 99);

    Car car1 = new Car("Ford", "Mustang", "black", 2016);
    Car car2 = new Car("Porsche", "911", "white", 2022);
    Car car3 = new Car("BYD", "king", "grey", 2025);

    Car[] cars = {car1, car2, car3};
    //you can pass in anonymous objects too.

    for(Car car : cars){
        System.out.println(car.model + " " + car.color + " " + car.year);
        car.velocityCar();
    }



    // static = Makes a variable or method belong to the class rather than to any specific object.
    // Commonly used for utility methods or shared resources

    // Inheritance = One class inherits the attributes and methods from another class.
    // Child <- Parent

    Dog dog1 = new Dog("Milly");

    dog1.callDog();

    // super = Refers to the parent class (subclass <- superclass)
    // Used in constructors and method overriding
    // Calls the parent constructor to initialize attributes


    Person person = new Person("Eduardo", "Brito");

    System.out.println(person.last);

    student1.study();

    Employee employee = new Employee("Eduardo", "Paulino", 80000);

    employee.showSalary();

    // Method overriding = When a subclass provides its own implementation off a method that is already defined.
    // Allows for code reusability and give specific implementations.

    Cats cats = new Cats("Garfield");

    cats.fazerSom();

    // toString() = Method inherited from the object class.
    // Used to return a string representation of an object.
    // By default, it returns a hash code as a unique identifier.
    // It can be overridden to provide meaningful details.

    // abstract = Used to define abstract classes and methods.
    //            Abstraction is the process of hiding implementation details
    //            and showing only the essential features;
    //            Abstract classes CAN´T be instantiated directly
    //            Can contain 'abstract' method (which must be implemented)
    //            Can contain 'concrete' methods (which are inherited)
    //            ex: every animal has a sound, but hasn't a generic sound from a generic animal, so class Animal - fazerSom() is abstract, and Dog extends Animal fazerSom() is concrete.


    Triangle triangle = new Triangle(2, 3);

    System.out.println(triangle.area());

    System.out.println(car1);

    // Interface = A blueprint for a class that specifies a set of abstract methods
    // that implementing classes must define.
    // Supports multiple inheritance-like behavior.


    Rabbit rabbit = new Rabbit();
    rabbit.flee();

    Hawk hawk = new Hawk();
    hawk.hunt();







}
