package array;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int a,b,c = 0;
        int count = 0;
        int result = 0;
        int [] array = new int[10];
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        result = a * b * c;

        //BufferReader 사용법, ChatAt에 -'0'을 해야하는 이유에 대해서 구글링

        for(int i = 0; i<=9; i++){
            for(int j = 0; j<=9; j++){
                if(array[i] == j){
                    count++;
                }
            }
        }


    }
}
