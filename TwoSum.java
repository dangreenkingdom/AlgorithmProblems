/* 
Description:
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && (map.get(x) != i)) {
                ret[0] = i;
                ret[1] = map.get(x);
            }
        }
        return ret;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                ret[0] = i;
                ret[1] = map.get(x);
            }
            map.put(nums[i], i);
        }
        return ret;
    }
}

// 关键在想到HashMap
