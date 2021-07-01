package sample;

public class Ex_Factorial {
    public static void main(String[] args) {
        System.out.println("factorial(1) = " + factorial(1));
        System.out.println("factorial(2) = " + factorial(2));
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("factorial(4) = " + factorial(4));
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(6) = " + factorial(6));
        System.out.println("factorial(7) = " + factorial(7));

    }

    public static int factorial(int i) {
        if(i == 1){
            return 1;
        }
        else {
            return i * factorial(i - 1);
        }
    }
}
