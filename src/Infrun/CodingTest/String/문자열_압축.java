package Infrun.CodingTest.String;

import java.awt.*;
import java.util.Scanner;

public class 문자열_압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input += ' ';
        System.out.println(solution(input));
    }

    static String solution(String str) {
        String answer = "";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                answer += str.charAt(i);
                if(cnt >= 2){
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }
}
