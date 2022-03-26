package midterm;

public class GPA {

    float gpa;
    String grade;
    float percent;

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    GPA(float gpa, String grade, float percent){
        this.gpa=gpa;
        this.grade = grade;
        this.percent=percent;
    }

    public void display(){
        System.out.println( gpa + " " + grade + " " + percent);
    }

}
