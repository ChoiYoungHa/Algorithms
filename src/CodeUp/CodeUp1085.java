package CodeUp;

import com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배운 것
// 1. Math.pow는 제곱을 구하는 함수이다.
// 2. 아는것도 확실하지 않으면 다시 확인해보자.
public class CodeUp1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] array = input.split(" ");
        double a = Integer.parseInt(array[0]);
        double b = Integer.parseInt(array[1]);
        double c = Integer.parseInt(array[2]);
        double d = Integer.parseInt(array[3]);

        double result = ((a * b * c * d) / 8) / Math.pow(2, 10)/ Math.pow(2, 10);

        System.out.format("%.1f MB",result);
    }
}
