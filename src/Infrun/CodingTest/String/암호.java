package Infrun.CodingTest.String;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String input = sc.next();
        System.out.println(solution(input, i));
    }


    // 정규식 이용
    static String solution(String str, int g){
        String answer = "";
        for (int i = 0; i < g; i++) {
            String temp = str.substring(0, 7).replace('#','1').replace('*','0');
            int d = Integer.parseInt(temp, 2);
            answer += (char) d;
            str = str.substring(7);
        }
        return answer;
    }


    // 정규식 이용안한 코드
//    static String solution(String str, int g){
//        String binary = "";
//        String temp = "";
//        String answer = "";
//        for (char x :str.toCharArray()) {
//            if(x == '#'){
//                binary += 1;
//            }
//            else{
//                binary += 0;
//            }
//        }
//        int start = 0;
//        int end = 7;
//        for (int i = 0; i < g; i++){
//            temp = binary.substring(start, end);
//            int decimal = Integer.parseInt(temp,2);
//            answer += (char) decimal;
//            start += 7;
//            end += 7;
//        }
//        return answer;
//    }
}
