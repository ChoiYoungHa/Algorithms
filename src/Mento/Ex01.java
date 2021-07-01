package Mento;


import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 변수를 선언하는 방법
        int num;    // 변수에 값을 넣는 행위(초기화) 초기화하지 않고 선언만 해둔 상태
        int number; //자바에서는 **초기화되지 않은 변수는 프로그램 안전성을 위해 사용할 수 없다.**
                    //초기화되지 않은 변수를 사용하려고 하면, 컴파일 에러가 발생한다.

        int num1 = 10; // 변수를 초기화한 상태.
        int num2 = 20, num3 = 10; // 같은 자료형을 사용하면, 동시에 2개의 변수를 선언할 수 있다.

        //num = 10, number = 20; 다만이렇게 선언된 변수들을 동시에 초기화 시키진 못한다.

        //자료형들
        //정수형
        int b = 65; // 정수가 들어가는 그릇 // 4byte
        long a = 2147483647; // 엄청 큰 정수가 들어갈 수 있는 그릇 //8byte

        //실수형
        float c = 1.111f; // 실수가 들어가는 그릇4byte
        double d = 1.123124123; //엄청 큰 실수가 들어가는 그릇//8byte

        //문자, 문자열
        char ch = 'A'; // 문자 1개가 저장될 수 있는 그릇 //1byte
        String st = "Hello!"; // 문자의 집합들이 저장될 수 있는 그릇 // 영어 숫자 특수기호는 1byte 한글은 3byte

        // 논리 자료형
        boolean bool = true;


        System.out.println(b);


        // 정수는 %d, 실수는 %f 문자, 문자열 %c, %s
        System.out.printf("%f",d);

        System.out.print(st);
    }
}
