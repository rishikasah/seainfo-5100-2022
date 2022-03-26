package midterm;

public class Student {

    String name;
    int id;
    GPA gpa;


    public Student(String name, int id, GPA gpa, boolean isDeep) {
        this.name = name;
        this.id = id;
        if(isDeep){
            this.gpa = new GPA(gpa.gpa,gpa.grade,gpa.percent);
        } else {
            this.gpa = gpa;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GPA getGpa() {
        return gpa;
    }

}
