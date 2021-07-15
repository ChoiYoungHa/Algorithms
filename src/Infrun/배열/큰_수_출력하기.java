package Infrun.배열;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a + 1];
        for (int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }
        for (int x : solution(array, a)) {
            System.out.printf(x + " ");
        }
    }

    static ArrayList<Integer> solution(int [] array, int b) {

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for (int i = 1; i < array.length; i++){
            if(array[i] > array[i-1]){
                answer.add(array[i]);
            }
        }

        return answer;
    }


}
