package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//코드업  a ~ 입력받은 알파뱃까지 순서대로 출력하기
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char ask = sc.next().charAt(0);
        int i_ask = ask;
        int num = 97;

        do{
            System.out.printf("%c\n",num);
            num++;
        }
        while(num <= i_ask);

    }
}
