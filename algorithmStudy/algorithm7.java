package algorithmStudy;
/* 배열 두배 만들기 */
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i] * 2;
            
        }
        
        return answer;
    }
}