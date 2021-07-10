package Infrun.CodingTest.String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String temp [] = new String[a];
        for (int i = 0; i < a; i++){
            temp[i] = sc.next();
        }
        for (String x:solution(temp)) {
            System.out.println(x);
        }
    }

    // 2번째 방법 직접 뒤집기
    static ArrayList<String> solution(String [] temp){
        ArrayList<String> list = new ArrayList<>();

        for(String x : temp){
            char tmp[] = x.toCharArray();

            int lt = 0;
            int rt = x.length() - 1;

            while(lt < rt){
                char that = tmp[lt];
                tmp[lt] = tmp[rt];
                tmp[rt] = that;
                lt++;
                rt--;
            }

            String answer = String.valueOf(tmp);
            list.add(answer);
        }
        return list;
    }
//    1번째 방법 StringBuilder 이용
//    static ArrayList<String> solution(String[] temp){
//        ArrayList<String> list = new ArrayList<>();
//
//        for (String x: temp) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            list.add(tmp);
//        }
//
//        return list;
//    }
}
