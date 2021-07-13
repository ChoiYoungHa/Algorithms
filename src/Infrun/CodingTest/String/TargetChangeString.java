package Infrun.CodingTest.String;

import java.util.Scanner;

// 문자열 중 특정 문자만 뒤집기
public class TargetChangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }

    static String solution(String str) {
        String answer = "";
        char[] list = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if(!Character.isAlphabetic(list[lt])){
                lt++;
            }else if(!Character.isAlphabetic(list[rt])){
                rt--;
             }else {
                char temp = list[lt];
                list[lt] = list[rt];
                list[rt] = temp;
                lt++;
                rt--;
             }
        }

        answer = String.valueOf(list);

        return answer;
    }
}
