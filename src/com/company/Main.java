package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

//코드업  a ~ 입력받은 알파뱃까지 순서대로 출력하기
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i<= num; i++){
            if(i%3 == 0){
                System.out.print(" X");
            }
            else{
                if(i == 1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" "+i);
                }
            }
        }
    }
}
