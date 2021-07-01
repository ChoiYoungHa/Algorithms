package CodeUp;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        int input[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                input[i][k] = sc.nextInt();
            }
        }
        int count = 1; //다음줄로 넘어갈 때 1을 만났던 자릿수를 기억하는 역할
        boolean two = false;

        for (int i = 1; i < 9; i++) {
            for (int k = count; k < 10; k++) {

                if(input[i][k] == 0){
                    input[i][k] = 9;
                }
                else if(input[i][k] == 1){
                    count = k - 1;
                    input[i][count] = 9;
                    break;
                }
                else if(input[i][k] == 2){
                    two = true;
                    input[i][k] = 9;
                    break;
                }
                else if(input[1][1] == 2){
                    input[1][1] = 9;
                    two = true;
                    break;
                }
            }
            if (two) {
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.printf("%d ",input[i][k]);
            }
            System.out.println();
        }
        sc.close();
    }
}
