package midterm;

public class Happy extends Moody{

    @Override
    String getMood() {
        return "happy";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!!");
    }
}
