
//link problem
//https://codeforces.com/contest/677/problem/A

import java.util.Scanner;
public class VanyaAndFrance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfFriends=scanner.nextInt();
        int heightOfWall=scanner.nextInt();
        int y=0;
        int z=0;
        int n=0;


        for(int i=0;i<numberOfFriends;i++){
            int x=scanner.nextInt();
            if(x>heightOfWall){
          z+=2;
            }
            else if (x<heightOfWall){
                y++;
            }else {
                n++;
            }
        }
        System.out.println(z+y+n);
    }
}












