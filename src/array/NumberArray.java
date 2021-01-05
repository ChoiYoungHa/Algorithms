package array;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int a,b,c = 0;
        int count = 0;
        int result = 0;

        // 내일은 버퍼리더 이용해서 돌려보기
        Scanner sc = new Scanner(System.in);
        result = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(result);
        sc.close();

        for(int i = 0; i<10; i++){
            count = 0;
            for(int j = 0 ; j < str.length() ;j++){
                if((str.charAt(j) - '0') == i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
