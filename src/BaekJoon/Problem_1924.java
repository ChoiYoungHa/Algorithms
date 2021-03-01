package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int months [] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int hap = 0;
        for (int i = 0; i < month; i++) {
            hap += months[i];
        }
        hap += day;

        System.out.println(week[hap % 7]);



    }
}
