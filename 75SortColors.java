import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
        int zeros =0,ones=0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == 0) zeros++;
            else if (nums[i] == 1) ones++;
        }

        int idx = 0;
        for(int i = 0; i < zeros;i++){
            nums[idx] = 0;
            idx++;
        }

        for(int i = 0; i < ones;i++){
            nums[idx] = 1;
            idx++;
        }

        for(int i = idx; i < nums.length;i++){
            nums[idx] = 2;
            idx++;
        }
    }
}
