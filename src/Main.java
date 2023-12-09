import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]!=nums[i]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}


public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(nums.length);

        System.out.println(Solution.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}