package Infrun.CodingTest.String;

import java.util.Scanner;

public class 유효한_팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    static String solution(String str) {
        String answer = "NO";
        String s = str.toUpperCase();
        s = s.replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(s).reverse().toString();
        if(temp.equals(s)){
            return "YES";
        }
        return answer;
    }
}
