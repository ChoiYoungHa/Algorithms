package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] num = new int[10];
        int min = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<10 ; i++){
            num[i] = sc.nextInt();
            if(min < num[i]){
                min = num[i];
                count = i;
            }
        }
        System.out.println(min);
        System.out.println(count);
    }
}
