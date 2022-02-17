package homework2;

import java.util.Arrays;

public class PlayerRunner {

    public static void main(String[] args) {

        Player pl1 = new Player("Rohit Sharma", 200);
        Player pl2 = new Player("Rajat Sen", 200);
        Player pl3 = new Player("Hardik Pandya", 26);
        Player pl4 = new Player("Kunal Pandya", 44);
        Player pl5 = new Player("Jaspreet Bhumra", 29);
        Player pl6 = new Player("Kieron Pollard", 65);
        Player pl7 = new Player("Karan Kulkarni", 65);
        Player pl8 = new Player("Ishan Kishan", 75);

        Player [] players = {pl1, pl2, pl3, pl4, pl5, pl6, pl7, pl8};
        System.out.println(" -----------INPUT DATA-------------- ");
        displayPlayers(players);
        Arrays.sort(players);
        System.out.println(" -----------SORTED DATA-------------- ");
        displayPlayers(players);
    }

    public static void displayPlayers(Player [] players){

        for(Player play : players) {
            System.out.println(play.getName() + " => "  + play.getScore());
        }
    }
}
