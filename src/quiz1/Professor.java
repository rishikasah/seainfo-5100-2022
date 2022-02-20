package quiz1;

public class Professor extends Person {

    public Professor(String name, int age, int id) {
        super(name, age, id);
    }

    public void giveQuiz(String quiz){
        System.out.println(quiz);
    }

}