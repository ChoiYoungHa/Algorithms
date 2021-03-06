package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 4344 문제
// 접근방법
// 1. 총 몇번 반복할지, 한줄 돌아갈 때 몇번 반복하는지 생각해봤다.
// 2. 2중 for문을 사용해야겠다고 생각했다.
// 3. 어차피 한줄입력하고 한줄 출력나오라는 조건이 있었기에 첫번째 for문에 배열과 필요한
// 데이터들을 정의하고 System 함수로 출력했다.
// 그외 알게된 것.
// 1. Tokenizer 클래스 사용방법, 클래스 내의 메서드의 기능들 tokencount, hasTokenMores, nextToken
// 을 알게 되었다.
public class MaybeAvg {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 먼저, 몇개 구할 것인지 받고,
        int n = Integer.parseInt(bf.readLine());
        // 구할 것 만큼 반복하고
        for(int i = 0; i < n; i++){
            //1 50 20 30 50 이런식으로 입력들올테니 " "로 토큰 구분
            st = new StringTokenizer(bf.readLine(), " ");

            //첫번째로 받은 값은 배열의 숫자이니, 그만큼 배열선언
            int num = Integer.parseInt(st.nextToken());
            int [] array = new int [num];
            double hap = 0;

            //받은 수 만큼 반복할거고 첫번째 토큰 다음인 두번째 토큰부터 array[k]에 저장
            //그리고 전체 점수 합산
            for(int k = 0; k < num; k++){
                array[k] = Integer.parseInt(st.nextToken());
                hap += array[k];
            }
            // 평균을 구하고
            double avg = hap/num;
            double count = 0;

            // 평균보다 점수가 높으면 count 1증가
            for(int j = 0; j < num ; j++){
                if(array[j] > avg){
                    count++;
                }
            }

            //평균보다 점수가 높은 학생의 비율을 구하는 문제이니,
            //평균이상인 학생 / 전체학생 * 100을하면 비율이 계산 됨.
            System.out.printf("%.3f%%\n", (count/num) * 100);
        }

    }
}

