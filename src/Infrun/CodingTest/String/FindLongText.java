package Infrun.CodingTest.String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 문장 중 가장 길이가 긴 단어 찾기
public class FindLongText {

    public static String solution(String str){
        String temp[] = str.split(" ");
        int max = Integer.MIN_VALUE;
        String best = "";
        for (String x : temp) {
            if(max < x.length()){
                max = x.length();
                best = x;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
