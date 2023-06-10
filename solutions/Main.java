package solutions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int [] array1 = {1,1,2,2,5};
        int [] array2 = {1,1,1,2,3,3};

        Intersection inter = new Intersection();
        int [] intersection; // = new int [inter.intersect(array1,array2).length];

        intersection = inter.intersect(array1,array2);
        System.out.println(Arrays.toString(intersection));

        // Two Sums
        System.out.println("Solucion Two Sums");
        int [] nums = {8, 1, 9, 18};
        int target = 25;
        int [] indexOfTwoSums = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(indexOfTwoSums));

    }
}
