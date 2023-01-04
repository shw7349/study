//짝수의 합
/*
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 
solution 함수를 작성해주세요.
 */
class Solution {
    int answer = 0;
    public int solution(int n) {
        for(int i=0; i<=n; i++){
            if(i%2 == 0){
               answer += i;    
            }
        }
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