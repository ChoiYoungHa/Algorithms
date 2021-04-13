package Mento;

// 정보처리산업기사 피보나치수열 재귀
public class Fibo {

    public static int Fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.printf("%d\n", Fibonacci(i));
        }
    }

}
