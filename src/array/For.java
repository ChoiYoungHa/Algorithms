package array;

import java.io.*;
import java.util.StringTokenizer;

// 1번째 오류 write를 쓸 때 정수형 변수를 넣었다. 문자열로 바꿔주어야한다.
// 2번째 오류 for문이 한번 끝날 때, 버퍼라이터를 close했다. 두번째 포문이 돌때는 IO메서드를
// 종료했기 때문에 동작하지 않았다.
// 3번째 백준 시간초과
// 시간 초과가 난 이유 : 백준 문제를 이해하기를 하나를 입력받고 하나의 출력이 나오고 반복구조로
// 이해했지만 값을 한번에 쭉 넣으면 한번에 출력이 나와야하는 형식이었다. 그럴려면 단일 변수로
// 데이터를 저장하면 안되고 배열을 통해 저장하고 for를 이용하는 것이 목적이었다.

// 접근 방법
// 간단하게 순서도를 생각하였다.
// 데이터가 저장될 자료형 변수를 순서도에 따라 생각해보고 중간중간 결과값을 System.out으로 확인해봤다.
// 디버깅표를 작성해서 변수를 추적해봤다.
// 원하는 대로 흘러가는지 계속 체크했고 함수사용법이 맞는지 자료형이 맞는지 따져봤다.
// 해결했다.
// 코드복습
public class For {
    public static void main (String args []) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int a = 0;
            int b = 0;
            st = new StringTokenizer(bf.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            array[i] = a + b;
        }
            for(int value : array){
                bw.write(String.valueOf(value));
                bw.newLine();
            }
            bw.flush();
            bw.close();
    }
}
