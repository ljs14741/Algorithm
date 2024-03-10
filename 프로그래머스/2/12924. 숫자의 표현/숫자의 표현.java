class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        int j = 0;
        int k = 0;
        
        while(true) {
            j = j + 1;
            k = j;
            if(j == n) {
                answer = answer+1;
                break;
            }
            while(true) {
                tmp = tmp + k;
                k = k + 1;
                if(tmp == n) {
                    answer = answer+1;
                    tmp = 0;
                    break;
                }
                if(tmp > n) {
                    tmp = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}