public class Student {
    String name;
    String deegreCourse;
    int age;
    double gpa;
    String dream;

    Student(String name, String deegreCourse, int age, double gpa, String dream){
        this.name = name;
        this.deegreCourse = deegreCourse;
        this.age = age;
        this.dream = dream;
        this.gpa = gpa;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

}
