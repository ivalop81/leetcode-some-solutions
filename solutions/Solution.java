package solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        List <Integer> arrayList = new ArrayList<>();
        /*                lenght -2     lenght -1
          c          0  1    2             3
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
}
