import com.leetcode.base.Solution;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {2, 3, 5, 6};
        int target = 1;
        int[] result = solution.twoSum(nums, target);

        if(result != null && result.length > 0){
            System.out.println(result[0]);
            System.out.println(result[1]);
        }

    }
}
