package sample;

// 정보처리산업기사 코드문제 기출
public class Recur2 {
    public static void main(String[] args) {
        recur(5);
    }

    public static int recur(int i) {
        int n;
        if(i < 1){
            return 2;
        }
        n =  2 * recur(i - 1) + 1;
        System.out.println(n);
        return n;
    }
}
