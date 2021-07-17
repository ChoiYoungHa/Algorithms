package Infrun.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < num; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++){
            b[i] = sc.nextInt();
        }
        for (String x :solution(a,b,num)) {
            System.out.println(x);
        }
    }

    static ArrayList<String> solution(int [] a, int [] b, int n) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if(a[i] == b[i]){
                answer.add("D");
            }else if(a[i] == 1 && b[i] == 3){
                answer.add("A");
             }else if(a[i] == 2 && b[i] == 1){
                answer.add("A");
              }else if(a[i] == 3 && b[i] == 2){
                answer.add("A");
            }else {
                answer.add("B");
            }
        }
        return answer;
    }
}
