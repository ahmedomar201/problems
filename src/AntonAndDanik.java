
//link problem
//https://codeforces.com/contest/734/problem/Aoble


import java.util.Scanner;

public class AntonAndDanik {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersOFGames = scanner.nextInt();
        String matchScore = scanner.next();
        int anton = 0;
        int danik = 0;

        for (int i = 0; i < numbersOFGames; i++) {

            if (matchScore.charAt(i) == 'A') {

                anton++;
            } else {
                danik++;
            }
        }


        if (anton > danik) {
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        } else {

            System.out.println("Friendship");
        }


    }
}
