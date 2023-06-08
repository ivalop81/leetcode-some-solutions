package solutions;


import java.util.Scanner;

public class RichestCustomerWealth {

    // letCode solution
    public int calculateMaxWealth (int [][] accounts) {
        int maxCustomerWealth = 0;

        for (int [] customers : accounts) {
            int currentCustomerWealth = 0;
            for (int bank : customers) {
                currentCustomerWealth += bank;
            }
            maxCustomerWealth = Math.max(maxCustomerWealth, currentCustomerWealth);
        }
        return maxCustomerWealth;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  m, n, tmp, customWealth = 0, maxWealth = 0;
        System.out.println("The values must be between0 m >= 1 and n <= 50");

        do {
            System.out.print("Please insert m: ");
            m = scanner.nextInt();
            System.out.print("Please insert n: ");
            n = scanner.nextInt();
            System.out.println();
        }
        while (m < 1 || n < 1 || n > 50);

        int[][] accounts = new int[m][n];

        // charge the grip and calculate customer wealth
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.print("Please put in the grid an integer in the range 1-100 " + i + " " + j + ": ");
                    tmp = scanner.nextInt();
                    System.out.println();
                }
                while (tmp <= 0 || tmp > 100);

                accounts[i][j] = tmp;
                customWealth = customWealth + accounts[i][j];
            }
            maxWealth = Math.max(customWealth, maxWealth);
            customWealth = 0;
        }
        // printing the accounts grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(accounts[i][j]  + " ");
            }
            System.out.println();
        }

        System.out.println("The maximum customer wealth is: " + maxWealth);

        //accounts = new int[][]{{7, 1, 3}, {2, 8, 7}, {1, 9, 5}};

        // time complexity O (n x m)
        // space complexity O (1) it's constant, because we do not create  size it's proportional to our input.


    }
}



