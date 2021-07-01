package sample;

public class ArrayResult {

    // 정보처리산업기사 기출코드
    public static void main(String[] args) {
        int a[] = new int[8];
        int d = 11, n = 0;

        do {
            a[n++] = d % 2;
            d /= 2;
        } while (d > 0);

        for (int i = 7; i >= 0; i--) {
            System.out.printf("%d", a[i]);
        }
    }
}
