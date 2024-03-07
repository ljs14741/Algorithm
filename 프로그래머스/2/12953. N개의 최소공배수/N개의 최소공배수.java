import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int i = 2;
        
        while(i<100) {
            int cnt = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[j]%i == 0) {
                    cnt = cnt+1;
                }
            }
            
            if(cnt > 1) {
                answer = answer * i;
                for(int k=0; k<arr.length; k++) {
                    if(arr[k]%i ==0) {
                        arr[k] = arr[k]/i;
                    }
                }
            } 
            if(i == 99) {
                for(int z=0; z<arr.length; z++) {
                    answer = answer * arr[z];
                }
            }
            
            if(cnt < 2) {
                i++;
                continue;
            }
        }
            
        
        return answer;
    }
}