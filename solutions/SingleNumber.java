package solutions;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // my solution
        /*int i = 0;
        int j = i + 1;

        // sort the original array nums
        Arrays.sort(nums); // O (n * log n)

        while( i < nums.length) {

            if (i == nums.length -1 || nums[i] != nums[j]) {
                return nums[i]; // return single number
            } else {
                i+=2; j+=2;
            }
        }
        return -1; */

        // solution with XOR bit manipulation
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, -11, 1, 2};
        SingleNumber n = new SingleNumber();
        System.out.println(n.singleNumber(array));

    }
}
