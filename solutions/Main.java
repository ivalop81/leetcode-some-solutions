package solutions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int [] array1 = {1,1,2,2,5};
        int [] array2 = {1,1,1,2,3,3};

        Intersection inter = new Intersection();
        int [] intersection;

        intersection = inter.intersect(array1,array2);
        System.out.println(Arrays.toString(intersection));

        // Two Sums
        System.out.println("Solucion Two Sums");
        int [] nums = {8, 1, 9, 18};
        int target = 25;
        int [] indexOfTwoSums = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(indexOfTwoSums));

        // Reverse a string
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
        System.out.println("Solucion reverseString");
        char [] s1 = {'h','e','l','l','o'};
        char [] s2 = {'H','a','n','n','a', 'h'};
        solution.reverseString((s1));
        System.out.println(s1);
        solution.reverseString((s2));
        System.out.println(s2);

        // firstUniqChar
        System.out.println("Solucion firstUniqChar");
        String s3 = "leetcode";
        String s4 = "loveleetcode";
        String s5 = "aabb";
        System.out.println(solution.firstUniqChar(s3));
        System.out.println(solution.firstUniqChar(s4));
        System.out.println(solution.firstUniqChar(s5));
    }
}
