class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        int[] freq = new int[max+1];
        for(int i = 0 ; i < nums.length;i++){
            freq[nums[i]]++;
        }

        for(int i = 0 ; i < freq.length;i++){
            if(freq[i] > 1){
                ans.add(i);
            }
        }
        return ans;
    }
}
