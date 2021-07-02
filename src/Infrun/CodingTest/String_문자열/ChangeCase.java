package Infrun.CodingTest.String_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ca = br.readLine();
        String output = "";

        for (int i = 0; i < ca.length(); i++) {
            char temp = ca.charAt(i);
            if((65 <= temp) && (temp <=90)){ // 문자가 65 ~ 90 대문자인 경우 소문자로 변환한다.
                output += String.valueOf(temp).toLowerCase();
            }else if((97 <= temp) && (temp <= 122)){ // 97 ~ 122 소문자인 경우 대문자로 변환한다.
                output += String.valueOf(temp).toUpperCase();
            }
        }
        System.out.println(output);
    }
}
