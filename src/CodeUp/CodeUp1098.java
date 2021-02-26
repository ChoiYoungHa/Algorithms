package CodeUp;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();

        int n = sc.nextByte();

        int array [] [] = new int [height] [width];

        for(int i = 0; i < n ; i++){
            int stick_length = sc.nextInt();
            int direction = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int k = 0; k < stick_length; k++){
                if(direction == 1){
                    array [x-1+k] [y-1] = 1;
                }
                else{
                    array [x-1] [y-1+k] = 1;
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++) {
                System.out.printf("%d ",array[i] [k]);
            }
            System.out.println();
        }
    }
}
