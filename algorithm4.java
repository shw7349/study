//배열의 평균값
/*
정수 배열 numbers가 매개변수로 주어집니다. 
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length ;
        return answer;
    }
}
/*
입출력 예 설명 #1

num1이 2이고 num2가 3이므로 다릅니다. 따라서 -1을 return합니다.
입출력 예 설명 #2

num1이 11이고 num2가 11이므로 같습니다. 따라서 1을 return합니다.
입출력 예 설명 #3

num1이 7이고 num2가 99이므로 다릅니다. 따라서 -1을 return합니다.
 */