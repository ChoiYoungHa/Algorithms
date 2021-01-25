package Mento;

public class Ex03 {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 1;

        if(a == b && a != c){ // and 연산자 두개 다 참일 때만 실행
            System.out.println("실행o");
        }

        if(a == b || a == c){ // or 연산자 둘 중 하나라도 참이면 실행
            System.out.println("실행  o");
        }


    }
}
