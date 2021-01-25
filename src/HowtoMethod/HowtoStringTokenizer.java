package HowtoMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HowtoStringTokenizer {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer를 사용할 땐 생성자라서 객체를 넣고 어떤식으로 분리할지 정해주어야한다.
        StringTokenizer st = new StringTokenizer(bf.readLine()," ",true);
        //" " 공백으로 분리하고 returnDelims는 출력할 때 " "을 포함해서 출력할거냐 물어보는건데 트루니
        //데이터 + " " + " " 가 출력됨;

        // 토큰이 몇개인지 모를때 있을땐 true로 지정하고 출력
        while(st.hasMoreTokens()){
            String data = st.nextToken();
            if(data.equals(" ")){
                System.out.println("!");
            }
            else{
                System.out.println(data);
            }
        }

        // 토큰수를 세어 for문으로 출력
        /*int count = st.countTokens();
        for(int i = 0; i < count; i++){
            System.out.println(st.nextToken());
        }*/


    }
}
