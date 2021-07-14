package Infrun.CodingTest.String;

import java.util.Scanner;

// 중복문자 삭제
public class DuplicateDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));

    }
    static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }


        return answer;
    }
}
