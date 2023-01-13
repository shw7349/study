package algorithmStudy;
/* 잘라서 배열로 저장하기/
/*
문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 */
class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];
        for(int i = 0; i < cnt; i++){
          int start = n * i;
          int end = 0;
          if(start + n >= my_str.length()){
              end = my_str.length();
          } else {
              end = start + n;
          }
          answer[i] = my_str.substring(start, end);
      }
        return answer;
    }
}