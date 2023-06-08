package solutions;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        // third solution
        // reverse the array
        // reverse again from the position 1 of reversed array
        int middle, tmp;


        middle = (nums.length / 2) - 1;

        for (int j = 0; j < k; j++) {
            // reversiog nums
            for (int i = 0; i <= middle; i++) {
                tmp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = tmp;
            }

            // rotate reversed nums
            for (int i = 1; i <= middle + 1; i++) {
                tmp = nums[i];
                nums[i] = nums[nums.length - 1 - i + 1];
                nums[nums.length - 1 - i + 1] = tmp;
            }
        }

        // second solutions :(
        // set the length of array tmp equal to array nums
        /*int [] tmp = new int [nums.length];

        for(int i = 0; i < k; i++) {
           for (int j = 0; j < nums.length; j++) {
               if (j == nums.length-1) {
                   tmp[0] = nums[j];
               } else {
                   tmp[j + 1] = nums[j];
               }
           }
            // copy the elements of nums for tmp elements
            System.arraycopy(tmp, 0, nums, 0, nums.length);
        }*


        // first solution .... :(
        // if nums have 2 elements needs only a simple swap in every step
        /*if (nums.length == 2) {
            for (int i = 0; i < k; i++) {
                tmp = nums[0];
                nums[0] = nums[1];
                nums[1] = tmp;
            }
            for (int num : nums) System.out.print(num + " ");
            return;
        }

        // rotate the array nums k-times
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length-2; j++) {
                // rotate the first and the last element of array nums
                if (j == 0) {
                    tmp = nums[j];
                    nums[j] = nums[nums.length-1];
                    nums[nums.length-1] = nums[nums.length - 2];
                    nums[nums.length - 2]= tmp;
                }
                else {
                    nums[nums.length-2] = nums[j];
                    nums[j] = tmp;
                    tmp = nums[nums.length-2];
                }
            }
        } */

        for (int num : nums) System.out.print(num + " ");
    }

    public static void main (String [] args) {
        RotateArray rotateArray = new RotateArray();
        int [] numbers = {-1,-100,3,99};
        for(int num : numbers) System.out.print(num + " ");
        System.out.println();
        rotateArray.rotate(numbers, 2);
    }
}
