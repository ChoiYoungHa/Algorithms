package sample;

import java.util.Arrays;

// 맵리듀스 한줄라인 정규식 테스트
public class Regular {
    public static void main(String[] args) {
        String test = "One,Two!Three";
        System.out.println("Origin string : " + test);
        String [] result = test.split("\\W+");
        System.out.print("Split at word boundaries : ");
        System.out.println(Arrays.toString(result));
    }
}
