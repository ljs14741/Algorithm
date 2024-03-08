class Solution {
    public int solution(int n) {
        if(n == 0 || n ==1) {
            return n;
        }
        int answer = 1;
        answer = answer + n;
        
        for(int i=2; i<n; i++) {
            if(i > (n/i)) {
                return answer;
            }
            if(n%i == 0) {
                answer = answer + i;
                if(i != (n/i)) {
                    answer = answer + (n/i);
                }
            }   
            
        }
        
        return answer;
    }
}