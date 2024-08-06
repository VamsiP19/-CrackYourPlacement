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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int count=0;
        int n=nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int x=0;x<n;x++)
            map.put(nums[x],x);
        Arrays.sort(nums);
        
        for(int x=0; x<n; x++)
        {
            if(x == map.get(nums[x]))
                continue;
            else
            {
                count++;
                swap(nums,x,map.get(nums[x]));
                x--;
            }
        }
        return count;
    }
    public void swap(int[] arr, int x, int y)
    {
        int t= arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }
}
