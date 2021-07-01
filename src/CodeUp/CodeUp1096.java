package CodeUp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] [] array = new int [19] [19];

        for(int i = 0; i < num; i++){
            int xpoint = sc.nextInt();
            int ypoint = sc.nextInt();
            array[xpoint - 1] [ypoint -1] = 1;
        }

        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array.length ; j++){
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }
    }
}
