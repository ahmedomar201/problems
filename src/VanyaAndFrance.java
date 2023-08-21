
//link problem
//https://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class VanyaAndFrance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personNumbers = scanner.nextInt();
        int wallHeight = scanner.nextInt();
        int result = 0;

        while (personNumbers != 0) {
            int tallPerson = scanner.nextInt();
            result++;
//
            if (tallPerson > wallHeight) {
                result++;
            }
            personNumbers--;
        }
        System.out.println(result);

    }
}
