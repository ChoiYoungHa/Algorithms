package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 접근방법
// 1. 사진은 픽셀 너비, 높이, 비트의 곱은 총 사진의 bit수이다.
// 2. byte 단위로 나타내어야하기 때문에 1바이트 8비트이기에 8로 나눠준다.
// 3. 그리고 kb는 10진수로 1,000이지만 2진수로는 1024이다.
// 4. 마찬가지로 mb는 10진수로 1,000,000이지만 2진수로는 1048576이다.
// 5. 2진수의 kb mb의 단위를 이해했다면 쉽게 문제를 풀 수 있다.
public class CodeUp1086 {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] array = input.split(" ");
        int w = Integer.parseInt(array[0]);
        int h = Integer.parseInt(array[1]);
        int b = Integer.parseInt(array[2]);

        double result = ((w * h * b)/8) / Math.pow(2,20);
        System.out.format("%.2f MB", result);
    }
}
