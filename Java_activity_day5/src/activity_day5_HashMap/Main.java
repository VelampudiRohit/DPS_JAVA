package activity_day5_HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name");
        String playerName = sc.next();
        System.out.println("Enter wickets - seperated by \"|\" symbol");
        String wickets = sc.next();

        Map<String, List<Wicket>> hashMap = new HashMap<>();

        String addPlayer = "yes";
        while (addPlayer=="yes") {
            System.out.println("Enter the player name");
            playerName = sc.next();
            System.out.println("Enter wickets - seperated by \"|\" symbol");
            wickets = sc.next();
            String bowlersWickets[] = wickets.split("%|%");
            for (int i = 0; i < bowlersWickets.length; i++) {
                if (hashMap.containsKey(playerName)) {
//                    List<Wicket>
                }
            }
            System.out.println("Do you want to add another player (yes/no)");
            addPlayer = sc.next();
        }
        sc.close();
    }
}