//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        int time = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

       
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            time++; 

            for (int i = 0; i < size; i++) {
                int[] rotten = queue.poll();
                int x = rotten[0], y = rotten[1];


                for (int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    
                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; 
                        queue.offer(new int[]{newX, newY}); 
                        freshOranges--; 
                    }
                }
            }
        }

        // If there are still fresh oranges left, return -1
        return freshOranges == 0 ? time : -1;
    }
}
