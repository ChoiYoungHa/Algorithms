package Infrun.CodingTest.String;

import java.util.Scanner;

public class FindText {

    public int solution(String str, char a) {
        int answer = 0;
        String text = str.toUpperCase();
        char b = Character.toUpperCase(a);
//        System.out.println("text : " + text + " " + "b = " +b);

        // 1번째 문자의 길이로 접근하는 방법
//        for (int i = 0; i < text.length(); i++){
//            if(text.charAt(i) == b){
//                answer += 1;
//            }
//        }

        // 2번째 forEach를 사용하는 방법
        for (char x : text.toCharArray()) {
            if (x == b) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindText t = new FindText();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);

        System.out.println(t.solution(str, a));
    }
}
