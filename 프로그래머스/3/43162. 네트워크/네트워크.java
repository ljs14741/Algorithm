class Solution {
    
    static boolean visit[];
    
    public int solution(int n, int[][] computers) {
        /* 인접리스트(배열) */
        /* 방문배열(visited) */
        /* dfs 깊이우선탐색 재귀함수구현(stack) */
        int answer = 0;
        visit = new boolean[n];
        
        for(int i=0; i<n; i++) {
            if(visit[i] == false) {
                answer++;
                DFS(i, computers, n);
            } 
        }       
        
        
        return answer;
    }
    
    static void DFS(int i, int computers[][], int n) {
        visit[i] = true;

        for(int j =0; j<n; j++) {
            if(visit[j] == false && computers[i][j] == 1) {
                DFS(j, computers, n);
            }
        }
    }
    
}