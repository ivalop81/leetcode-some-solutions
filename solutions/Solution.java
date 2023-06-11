package solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        List <Integer> arrayList = new ArrayList<>();
        /*                lenght -2     lenght -1
                    0  1    2             3
            nums = {8, 1,   9,           18} , target = 27
                   if nums[i] + nums[j] == target

           i = 0
           j = 1
         */
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    arrayList.add(i);
                    arrayList.add(j);
                    System.out.println(arrayList);
                    return arrayList.stream().mapToInt(k->k).toArray();
                }
            }
        }
        return arrayList.stream().mapToInt(k->k).toArray();
    }


    /*
        Example 1:
                         i = init        j = end
                         0   1   2   3   4
            Input: s = ["h","e","l","l","o"]     length = 5     stop condition i == j
            Output:    ["o","l","l","e","h"]

        Example 2:
                         i  i+1 i+2 j-2 j-1  j
                         0   1   2   3   4   5   length = 6     stop condition (i > j)
            Input: s = ["H","a","n","n","a","h"]
            Output:    ["h","a","n","n","a","H"]
     */
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        char tmp;

        while((i < s.length/2) ) {
            // swap values
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++; j--;
        }
    }
}
