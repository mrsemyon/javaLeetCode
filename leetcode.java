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

// Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            while (nums[i] != 0) {
                nums[i] /= 10;
                count++;
            }
            if (count % 2 == 0) max++;
            count = 0;
        }
        return max;
    }
}