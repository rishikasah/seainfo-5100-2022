package midterm;

public class Sad extends Moody{

    @Override
    String getMood() {
        return "sad";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob");
    }

    public String toString(){
        return "Subject cries a lot";
    }

    @Override
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!!");
    }

}
