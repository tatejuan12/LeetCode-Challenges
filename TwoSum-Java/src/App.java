import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        SolutionBrute solutionBrute = new SolutionBrute();
        System.out.println(Arrays.toString(solution.twoSum(new int[] { 1, 3, 5 }, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[] { 15, 2, 5 }, 7)));
        System.out.println(Arrays.toString(solution.twoSum(new int[] { 4, 7, 10 }, 11)));
        // System.out.println(Arrays.toString(solutionBrute.twoSum(new int[] { 3, 2, 4
        // }, 6)));
        // System.out.println(Arrays.toString(solutionBrute.twoSum(new int[] { 15, 2, 5
        // }, 7)));
        // System.out.println(Arrays.toString(solutionBrute.twoSum(new int[] { 4, 7, 10
        // }, 11)));
    }

    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                int toTarget = target - nums[i];
                if (hash.containsKey(nums[i]))
                    return new int[] { hash.get(nums[i]), i };
                else
                    hash.put(toTarget, i);

            }
            return new int[] {};
        }
    }

    public static class SolutionBrute {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i == j)
                        continue;
                    if (nums[i] + nums[j] == target)
                        return new int[] { i, j };
                }
            }
            return new int[] {};
        }
    }

}