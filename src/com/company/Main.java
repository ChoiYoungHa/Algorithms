package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//코드업 삼항 연산자 문제 최소값 구하기
//코드업 1065번 문제
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int [] array = new int [3];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0){
                System.out.println("even");
            }
            else if(array[i] % 2 == 1){
                System.out.println("odd");
            }
        }


        }
    }
