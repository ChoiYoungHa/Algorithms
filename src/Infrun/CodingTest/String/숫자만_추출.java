package Infrun.CodingTest.String;

import java.util.Scanner;

public class 숫자만_추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    // Character 클래스 이용
    static int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)){
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

//    // 아스키 코드 이용
//    static int solution(String str) {
//        int answer = 0;
//        for (char x : str.toCharArray()) {
//            if(x >= 48 && x <= 57){
//                answer = answer * 10 + (x - 48);
//            }
//        }
//        return answer;
//    }
}
