import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int currLen = 1;
        int maxLen = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue; 
            } 
            else if (nums[i]  == nums[i + 1]-1) {
                currLen++;
            } 
            else {
                currLen = 1;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
