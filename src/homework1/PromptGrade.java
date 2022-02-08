package homework1;

public class PromptGrade {

    public String promptGrade(char c){

        if(c >= 97 && c<= 122)
            c = Character.toUpperCase(c);

        String grade="";

        switch(c){
            case 'A' :  grade="Excellent";
            break;
            case 'B' : grade="Good";
            break;
            case 'C' : grade = "Average";
            break;
            case 'D' : grade = "Deficient";
            break;
            case 'F' : grade = "Fail";
            break;
            default: grade= "Not a valid Input";
            break;
        }

        return grade;

    }
}