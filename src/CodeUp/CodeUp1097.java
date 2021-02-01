package CodeUp;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int [] [] array = new int [19] [19];

        for (int i = 0; i < 19; i++) {
            for (int k = 0; k < 19; k++) {
                array [i] [k] = sc.nextInt();
            }
        }
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int k = 0; k < 19; k++) {
                if (array[x-1][k] == 0) {
                    array[x-1][k] = 1;
                } else {
                    array[x-1][k] = 0;
                }
            }
            for (int j = 0; j < 19; j++) {
                if (array[j][y-1] == 0) {
                    array[j][y-1] = 1;
                } else {
                    array[j][y-1] = 0;
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for(int j = 0; j < 19 ; j++){
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }
    }
}
