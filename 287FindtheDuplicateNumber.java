class Solution {
    public int findDuplicate(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int[] freq = new int[max+1];
        for(int i = 0; i < nums.length;i++){
            freq[nums[i]]++;
        }

        int ans = 0;
        for(int i = 0 ; i < freq.length;i++){
            if(freq[i] > 1){
                ans = i;
            }
        }
        return ans;
    }
}
