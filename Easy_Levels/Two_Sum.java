package Easy_Levels;

class Solution{
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}

public class Two_Sum {
  public static void main(String[] args) {
    Solution s = new Solution();
        int[] num = {5, 6, 8, 2, 1};
        int target = 3;

        int[] result = s.twoSum(num, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}