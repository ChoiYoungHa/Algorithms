package Infrun.CodingTest.String;

import java.util.Scanner;

public class 가장_짧은_문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);
        for (int x : solution(a,b)) {
            System.out.print(x+" ");
        }
    }

    static int [] solution(String s, char c){
        int p = 1000;
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                p = 0;
            }else {
                p++;
            }
            answer[i] = p;
        }

        for (int i = s.length() - 1; i >= 0 ; i--){
            if(s.charAt(i) == c){
                p = 0;
            }else {
                p++;
                answer[i] = Math.min(answer[i], p);
//                if(answer[i] > p){
//                    answer[i] = p;
//                }
            }
        }
        return answer;
    }
}
