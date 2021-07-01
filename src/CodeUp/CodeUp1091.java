package CodeUp;

import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//접근방법
//자바는 모든 배열을 가비지값없이 0으로 초기화해줌
//그래서 1 ~ 23을 사용할거라 24개의 배열을 선언함.
//입력받은것만큼 배열을 생성해야하나 싶었지만 받은 것 만큼 for문에 사용하면 됨.
//그러면 5개의 점수를 입력받는다 할 때 0 ~ 4까지 반복되는 구조가 만들어짐.
//그리고 차근차근 i를 내가 비교하고 싶은 값으로 고정시키고
//입력된 배열[i] == 1 ~ 23 내가 입력한 것 중 첫번째값이 1 ~ 23이 해당되는지 체크
//해당된다면 count 배열에 해당되는 값의 index에 1증가
//이렇게되면 내가 입력한 값이 들어가있는 배열[i] == 20이랑 같다면 카운터배열 index[20]에 1증가
//그리고 count 배열 인덱스 1 ~ 23을 전부 출력하면 해당되는 값이있을 때 1씩 증가되어 있음.
public class CodeUp1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count[] = new int[24];

        String score = br.readLine();
        String [] spScore = score.split(" ");

        for(int i = 0; i < num ; i++){
            for(int k = 1; k < count.length ; k++){
                if(Integer.valueOf(spScore[i]) == k ){
                    count[k]++;
                }
            }
        }
        for(int i = 1; i < count.length; i++){
            System.out.printf("%d ",count[i]);
        }

    }
}
