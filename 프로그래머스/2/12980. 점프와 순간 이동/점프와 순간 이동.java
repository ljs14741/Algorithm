import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int cnt = 0;
        while(true) {
            if(n%2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
                ans = ans + 1;
            }

            if(n == 0) {
                break;
            }    
        }
        

        return ans;
    }
}