package homework2;/*
 Implement given program using copy constructor by creating a class Student with two parameter
1.	int rollNumber;
2.	String name

Class Main {
           public static void main(String[] args) {

Student student1 = new Student(101, "ABC");

system.out.println(" Roll number of the first student: "+ student1.printRoll());

system.out.println(" Name of the first student: "+ student1.printName());

Student student2 = new Student(student1);

system.out.println(" Roll number of the second student: "+     student2.printRoll());

system.out.println(" Name of the second student: "+ student2.printName());
 */

class Student{

    private int rollNumber;
    private String  name;


    public Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }


    public Student(Student student){
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    public int printRoll(){
        return rollNumber;
    }

    public String printName(){
        return name;
    }
}