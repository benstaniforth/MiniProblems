package benstaniforth.MiniProblems;

import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {

        System.out.println("Welcome to \"Summing up\"");
        System.out.print("Please enter a number > ");

        Scanner scanner = new Scanner(System.in);
        int numberSelection = scanner.nextInt();


        int sum = 0;
        for (int i = 0; i <= numberSelection; i++) {


            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }

        }

        System.out.println("The sum of all numbers is: " + sum);


    }
}