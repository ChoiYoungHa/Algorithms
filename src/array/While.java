package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백준 1101번

// 오류
// 1. count를 if전에 사용해서 1개씩 카운트가 안됐다.
// count를 if밑으로써서 해결

//접근방법
//1. 10의자리는 n수의 몫 1의 자리는 n수의 나머지인 것을 응용했다.
//2. 받는 수를 n 옮겨진 수를 t라고 했을 때 n이 68이면 t는 84로 변한다.
//3. 규칙을 찾아보면 n의 1의자리 수가 t의 10의 자리 수로 변한다.
//4. n의 10의자리 숫자와 1의자리 숫자 즉, 6과 8이 더해진 수가 t의 1의자리 수다.
//5. 정리하면 n의 68의 8은 t의 80이고,
//6. n의 68은 6 + 8 = 14 1의자리 4가 t의 4이다.
//7. 위의 알고리즘을 이해하고, 반복문에 첫번째 입력한 n과 계속 변했던 n이 서로 일치하면
// 종료되는 식으로 코드를 구성했다.
// 중간중간 변수를 추적하며 디버깅을 했다.
public class While {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(br.readLine());
        int eq = temp;
        int count = 0;

        while(true) {
            temp = ((temp % 10) * 10) + (((temp / 10) +
                    (temp % 10)) % 10);
            count++;
            if(temp == eq){
                break;
            }
        }
        System.out.println(count);
    }
}
