package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class offer03 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber1(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (j+1 == nums.length) {
                    break;
                }
                if (nums[i] == nums[j+1]) {
                    //System.out.println(nums[i]);
                    return nums[i];
                }
            }
        }
        return 0;
    }

    //2, 3, 1, 0, 2, 5, 3
    public static int findRepeatNumber1(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num : nums) {
            if(dic.contains(num))
                return num;
            dic.add(num);
        }
        return -1;
    }

}
