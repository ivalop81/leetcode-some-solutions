package solutions;

import java.util.Scanner;

public class ReduceToZero {
    int steps = 0;

    int reduce (int n) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Insert value for n between [1-1000000]: ");
            n = scanner.nextInt();
            System.out.println();
        }
        while (n < 0 || n > 1000000);

        while(n != 0) {
            // redundancy step
            if (n == 0)
                break;
            // even
            if(n % 2 == 0) {
                // letCode solution #2 if (n & 1 == 0)
                n = n / 2;
                // letCode solution #2 n >>= 1;
                // or n /= 2;
                steps++;
            } // odd
            else {
                n = n - 1;
                // or n -= 1; or n--;
                steps++;
            }

            // better is steps++ is putting here
        }
        return steps;
    }

    public static void main(String[] args) {
        ReduceToZero reduceToZero = new ReduceToZero();
        System.out.println(reduceToZero.reduce(8));

    }

    // Time complexity: O(logn) because we have a "halving step" and "substracting 1 step"
                        // so O(2logsn) = O(logn)
    // Space complexity: consstant Q(1) as we do not create a data structure, proporcionally
    //                    in size to the value of our input
}
