

//link Problem

//https://codeforces.com/contest/231/problem/A

import java.util.Scanner;


public class Team {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = scanner.nextInt();
        int problemsSolved = 0;
        int Petya;
        int vasya;
        int Tonya;


        for (int i = 0; i < numberOfProblems; i++) {

            Petya = scanner.nextInt();
            vasya = scanner.nextInt();
            Tonya = scanner.nextInt();

            if (Petya + vasya + Tonya >= 2) {
                problemsSolved++;

            }

        }
        System.out.println(problemsSolved);

    }


}


