class Solution {
    public int solution(int n) {
        int answer = 0;
        int first = 0;
        int second = 1;
        int fib = 0;
        
        for(int i=2; i<n+2; i++) {
            fib = first + second;
            
            if(i == n) {
                answer = fib%1234567;
                return answer;
            }
            
            first = second%1234567;
            second = fib%1234567;
        }
        
        return answer;
    }
}