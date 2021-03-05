package BaekJoon;

import java.util.Scanner;

public class Problem_2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.printf(" ");
            }

        }

    }
}
