package algorithmStudy;
//나머지 구하기
/*정수 num1, num2가 매개변수로 주어질 때,
 num1를 num2로 나눈 나머지를 return 하도록 
 solution 함수를 완성해주세요.
 */
public class algorithm2 {
    class Solution { 
        public int solution(int num1, int num2) {
            int answer = num1 % num2;
            return answer;
        }
    }
}

/*
입출력 예 #1
num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.

입출력 예 #2
num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
 */