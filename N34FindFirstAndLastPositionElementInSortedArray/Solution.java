package leetcode;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        int[] ret = new int[2];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (target < nums[mid] || target == nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (left >= nums.length || nums[left] != target) {
            ret[0] = -1;
            ret[1] = -1;
            return ret;
        }

        ret[0] = left;

        left = 0;
        right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (target < nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        ret[1] = left - 1;

        return ret;        
    }
}