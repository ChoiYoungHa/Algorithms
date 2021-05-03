package sample;

//산업기사 재귀함수
public class Recur {
    public static void main(String[] args) {
        int n;
        n = recur(7);
        System.out.println();
        System.out.printf("%d",n);
    }

    public static int recur(int n) {
        System.out.println(n);
        if (n < 1) {
            return 2;
        }
        else {
            return 3 * recur(n - 1) + 1;
        }
    }
}
