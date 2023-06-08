package solutions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array1 = {1,1,2,2,5};
        int [] array2 = {1,1,1,2,3,3};

        Intersection inter = new Intersection();
        int [] intersection; // = new int [inter.intersect(array1,array2).length];

        intersection = inter.intersect(array1,array2);
        System.out.println(Arrays.toString(intersection));
    }
}
