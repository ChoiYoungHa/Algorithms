package Infrun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightShift {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [8];
        for (int i = 0; i < 8; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        int temp = array[7];
        for(int i = 0; i < 7 ; i++){
            array[7-i] = array[6-i];
        }
        array[0] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
