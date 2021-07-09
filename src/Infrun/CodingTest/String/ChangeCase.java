package Infrun.CodingTest.String;


import java.util.Scanner;

// 대문자 소문자 변환
public class ChangeCase {
    // 다른방법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String ca = br.readLine();
//        String output = "";
//
//        for (int i = 0; i < ca.length(); i++) {
//            char temp = ca.charAt(i);
//            if((65 <= temp) && (temp <= 90)){ // 문자가 65 ~ 90 대문자인 경우 소문자로 변환한다.
//                output += String.valueOf(temp).toLowerCase();
//            }else if((97 <= temp) && (temp <= 122)){ // 97 ~ 122 소문자인 경우 대문자로 변환한다.
//                output += String.valueOf(temp).toUpperCase();
//            }
//        }
//        System.out.println(output);
//    }
}
