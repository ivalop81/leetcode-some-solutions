package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public List <String> getAnswers (int n) {
        List<String> answers = new ArrayList <>();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Insert value for n between [1-10000]: ");
            n = scanner.nextInt();
            System.out.println();
        }
        while (n < 1 || n > 10000);

        for (int i = 1; i <= n; i++ ) {
            /*LetCode Solution 1*/
            // boolean dividedBy3 = i % 3 == 0;
            // boolean dividedBy5 = i % 5 == 0;
            // if (dividedBy3 && dividedBy5)
            //      answers.add( "FizzBuzz");
            // else if (dividedBy3)
            //      answers.add( "Fizz");
            // else if (dividedBy5)
            //      answers.add( "Buzz");
            // else
            //      answers.add(String.valueOf(i));

            /*LetCode Solution 2*/
            // String currString = "";
            // boolean dividedBy3 = i % 3 == 0;
            // boolean dividedBy5 = i % 5 == 0;
            // if (dividedBy3)
            //      currString += "Fizz";
            // if (dividedBy5)
            //      currString += "Buzz";
            // if (currString.isEmpty())
            //      currString += String.valueOf(i);

            if ((i % 3) == 0 && (i % 5) == 0) answers.add( "FizzBuzz");
            else if ((i % 3) == 0) answers.add( "Fizz");
            else if ((i % 5) == 0) answers.add( "Buzz");
            else answers.add( String.valueOf(i));

        }
        return answers;
    }

    public static void main(String[] args) {
       List <String> result;
        FizzBuzz fizzBuzz = new FizzBuzz();
        result = fizzBuzz.getAnswers(5);

        for (int i = 0; i < result.size(); i++)
            System.out.print(result.get(i) + " ");

    }
}
// Time complexity: O(n) big O of n, because we iterate n times on the array, for each element
// Space complexity: O(1) is constant, because we do not create other data structures proportionaly in size to our input