package Infrun.CodingTest.String;

import java.util.Scanner;

public class Palindrome_회문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));

    }

    // StringBuilder 를 사용하는 방법
    static String solution(String str) {
        String answer = "NO";
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(temp)){
            return "YES";
        }
        return answer;
    }

}


    // 문자열을 나눠 비교하는 방법
//    static String solution(String str) {
//        String answer = "YES";
//        str = str.toUpperCase();
//        for (int i = 0; i < str.length()/2; i++){
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                return "NO";
//            }
//        }
//        return answer;
//    }

