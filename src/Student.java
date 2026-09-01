public class Student extends Person {
    String deegreCourse;
    int age;
    double gpa;
    String dream;

    Student(String first, String last, String deegreCourse, int age, double gpa, String dream){
        super(first, last);
        this.deegreCourse = deegreCourse;
        this.age = age;
        this.dream = dream;
        this.gpa = gpa;
    }

    void study(){
        super.showName();
        System.out.println("is studying");
    }



}
