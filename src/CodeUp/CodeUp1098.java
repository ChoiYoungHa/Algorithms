package CodeUp;

import java.util.Scanner;

//25번째줄부터 다시 디버깅
public class CodeUp1098 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열 생성할 값
        int codex = sc.nextInt();
        int codey = sc.nextInt();

        int[][] array = new int[codex][codey];
        int count = sc.nextInt(); // 사탕 몇개 만들건지

        // 입력한것만큼 반복
        for (int i = 0; i < count; i++) {
            int l = sc.nextInt(); //길이
            int d = sc.nextInt(); //방향 0세로 1가로
            int x = sc.nextInt();
            int y = sc.nextInt();

            //길이만큼 반복
            for(int k = 0; k < l ; k++){
                //가로인지 세로인지 판별
                if(d == 1){
                    array [x] [y+k] = 1;
                }
                else
                array [x+k] [y] = 1;
            }
        }
        for (int i = 0; i < codex; i++) {
            for (int k = 0; k < codey; k++) {
                System.out.printf("%d ",array[i][k]);
            }
            System.out.println();
        }
    }
}
