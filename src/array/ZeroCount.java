package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class ZeroCount {
    public static void main(String[] args) throws IOException {
        //백준 8958번 문제 내일은 다른 방법으로
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());
        String [] arry = new String[num];

        for(int i = 0; i < num; i++){
            arry[i] = bf.readLine();
        }

        for(int i = 0; i < num; i++){
            int count = 0; // 'O'의 개수 카운트
            int hap = 0; // 누적 합산

            for(int k = 0; k < arry[i].length(); k++){ //각 인덱스의 길이가 다름
                if(arry[i].charAt(k) == 'O'){ //한 인덱스에 여러문자열을 분리시켜서 'O' 비교시킴.
                    count++;
                    hap += count;
                }
                else{
                    count = 0;
                }
            }
            sb.append(hap).append('\n');
        }
        System.out.println(sb);*/

        //배열을 쓰지 않고 하는방법
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < num ; i++){ // 입력된 값만큼 반복
            int sum = 0;
            int count = 0;
            for(byte value : bf.readLine().getBytes(StandardCharsets.UTF_8)){
                //문자열을 바이트코드로 인코딩 후 vlaue에 저장하고 for-each로 출력
                if(value == 'O'){
                    count++;
                    sum += count;
                }
                else{
                    count = 0;
                }
            }
            sb.append(sum).append('\n');//sb객체에 sum을 \n을 포함시켜서 저장장        }
        System.out.println(sb);
    }
}
