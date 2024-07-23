class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numIdx = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(numIdx.containsKey(target-nums[i])){
                return new int[] {numIdx.get(target-nums[i]),i};
            }
            numIdx.put(nums[i],i);
        }
        return new int[] {};
    }
}
