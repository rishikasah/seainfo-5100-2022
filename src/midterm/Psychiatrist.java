package midterm;

import java.util.ArrayList;

public class Psychiatrist {

    ArrayList<Moody> subjects;

    public Psychiatrist(){
        subjects = new ArrayList<>();
    }

    public void examine(Moody moodyObject){
        subjects.add(moodyObject);
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
        moodyObject.ExpressFeelings();
    }

    public void observe(Moody moodyObject){
        System.out.println("Observation : " + moodyObject.toString());
    }
}
