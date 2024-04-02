import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int tmp = 0;
        int tmp2 = 0;
        int arr[] = new int [triangle.length];
        
                
        for(int i=0; i<triangle.length; i++) {
            for(int j=0; j<triangle[i].length; j++) {
                if(i==0 && j==0) {
                    continue;
                }
                
                // 젤 왼쪽 
                if(j==0) { 
                    triangle[i][j] = triangle[i-1][j] + triangle[i][j];
                } // 젤 오른쪽인경우
                else if(j==triangle[i].length-1) {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i][j];
                } 
                // 중간에 있는경우
                else {
                    tmp = triangle[i-1][j-1] + triangle[i][j];
                    tmp2 = triangle[i-1][j] + triangle[i][j];
                    if(tmp > tmp2) {
                        triangle[i][j] = tmp;
                    } else {
                        triangle[i][j] = tmp2;
                    }
                }
            }
        }
            
        
        for(int i=0; i<triangle.length; i++) {
            arr[i] = triangle[triangle.length-1][i];
        }
            
        Arrays.sort(arr);
        
        return arr[triangle.length-1];
    }
}