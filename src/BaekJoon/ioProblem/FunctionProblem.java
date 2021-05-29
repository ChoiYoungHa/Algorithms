package BaekJoon.ioProblem;

public class FunctionProblem {
    public static void main(String[] args) {
        int[] parameter = {1, 2, 3, 400};
        long result = test(parameter);

        System.out.println("result = " + result);
    }

    // SQLD 시험대비
    public static long test(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
