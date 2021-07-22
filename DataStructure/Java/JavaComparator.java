package hackerrank.DataStructure.Java;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class SortByScore implements Comparator<Player>{


    public int compare(Player p1, Player p2){

        if(p1.score == p2.score){
            return p1.name.compareTo(p2.name);
        }else{
            return p2.score - p1.score;
        }

    }

}


public class JavaComparator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Player player[] = new Player[n];

        for(int i=0; i<n;i++){

            player[i] = new Player(in.next(), in.nextInt());
        }

        Arrays.sort(player, new SortByScore());

        for(int i=0; i<n; i++){
            System.out.println(player[i].name+" "+player[i].score);
        }
    }
}

//Sample Input
/*

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150


 */
// Sample Output
/*

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50


 */