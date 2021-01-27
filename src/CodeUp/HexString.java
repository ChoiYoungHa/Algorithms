package CodeUp;

import java.util.Scanner;

// 코드업 16진수 15단 출력 A ~ F 문제
// 배운 것. toHexString, toUppercase, valueof 사용법
public class HexString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int num = Integer.valueOf(input, 16); //입력의 16진수가 저장
        String second, result;
        for (int i = 1; i < 16; i++) {
            second = Integer.toHexString(i).toUpperCase();
            result = Integer.toHexString(num * i).toUpperCase();
            System.out.println(input + "*" + second + "=" + result);
            sc.close();
        }
    }
}
