package BaekJoon;

import java.util.Scanner;

public class Problem_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = n * 2 - i;k > 0;k--) {
                if(k>i){
                    System.out.printf(" ");
                }
                else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("*");
            }
            for (int k = 1; k < i * 2 - 1; k++) {
                System.out.printf(" ");
            }
            for (int h = n; h >= i; h--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
