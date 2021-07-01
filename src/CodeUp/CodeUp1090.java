package CodeUp;

import java.util.Scanner;

// 63의 최소공배수를 구해볼려던 참임.
public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 1;
        while(day%a != 0 || day%b != 0|| day%c != 0){
            day++;
        }
        System.out.println(day);
    }
}
