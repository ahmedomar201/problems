import java.util.Scanner;

public class BearAndBigBrother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limakweight = scanner.nextInt();
        int bobweight = scanner.nextInt();
        int result = 0;

        while (limakweight<=bobweight) {

            limakweight*=3;
            bobweight*=2;
            result++;
        }
        System.out.println(result);



    }
}
