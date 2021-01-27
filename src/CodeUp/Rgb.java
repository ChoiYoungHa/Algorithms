package CodeUp;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Rgb {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String [] st = a.split(" ");
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));



        int count = 0;

        for(int i = 0; i < Integer.parseInt(st[0]) ; i++){
            for (int j = 0; j < Integer.parseInt(st[1]); j++) {
                for (int k = 0; k < Integer.parseInt(st[2]); k++) {
                    wr.write(i+" "+ j +" "+ k+"\n");
                    count++;
                }
            }
        }
        wr.write(String.valueOf(count));
        wr.flush();
    }
}
