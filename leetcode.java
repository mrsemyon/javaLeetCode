// Max Consecutive Ones
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) current++;
            else current = 0;
            if (max < current) max = current; 
        }
        return max;
    }
}