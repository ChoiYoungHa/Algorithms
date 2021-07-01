package Mento;

public class Ex02 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = x++; // y값 1 x값 2 // 후치연산
        System.out.println("y : " + y + " x : " + x);

                // 값 다시 초기화
        x = 1;
        y = 0;

        y = ++x; // y값 2 x값 2 // 전치연산
        System.out.println("y : " + y + " x : " + x);

       int a = (10 + 5) * 2;

    }
}
