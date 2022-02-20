package quiz1;

public class Student extends Person {


    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    public void takeQuiz(String quiz){
        System.out.println(quiz);;
    }
}