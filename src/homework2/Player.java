package homework2;

import java.util.Comparator;

public class Player implements Comparable<Player> {

    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {

        int  res =  Integer.compare(score, o.score);
        return  ( res == 0) ? name.compareTo(o.name) : res;
    }
}
