package Infrun.CodingTest.String;

public class CodingTest {
    public static void main(String[] args) {
        int[] boat = {2,2,4,3};
        CodingTest ct = new CodingTest();
        System.out.println(ct.solution(boat, 8));
    }

    public int solution(int[] deposit, int m) {
        int temp = 1;
        int result = 0;
        int answer = 0;

        for (int x :deposit) {
            if(temp <= x){
                result += temp;
                temp = temp * 2;
            }else if(result >= m){
                break;
            }else if(temp > x){
                temp = 1;
            }
            answer += 1;
        }

        if(result < m){
            answer = -1;
        }

        return answer;
    }
}
