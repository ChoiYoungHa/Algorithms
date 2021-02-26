package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Replay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[][] = new int[19][19];

        ArrayList<String> list = new ArrayList();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            String[] st = list.get(i).split(" ");
            array[Integer.parseInt(st[0]) - 1][Integer.parseInt(st[1]) - 1] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                System.out.printf("%d ",array[i][k]);
            }
            System.out.println();
        }
    }
}
