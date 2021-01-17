package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//코드업 입출력 문제
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String [] array = st.split("\\.");
        int [] temp = new int [array.length];

        for(int i =0 ; i< array.length ; i++){
            temp[i] = Integer.parseInt(array[i]);
        }
        System.out.printf("%04d"+"."+"%02d"+"."+"%02d",temp[0],temp[1],temp[2]);

    }
}
