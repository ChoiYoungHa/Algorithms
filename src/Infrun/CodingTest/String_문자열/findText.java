package Infrun.CodingTest.String_문자열;

import java.util.Scanner;

public class findText {

    public int solution(String str, char a) {
        int answer = 0;
        String text = str.toUpperCase();
        char b = Character.toUpperCase(a);
//        System.out.println("text : " + text + " " + "b = " +b);

        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == b){
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        findText t = new findText();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);

        System.out.println(t.solution(str, a));
    }


}
