package benstaniforth.MiniProblems;

import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {

        int numberSelection = promptForInput();

        int sum = 0;
        for (int i = 0; i <= numberSelection; i++) {

            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }

        }

        System.out.println("The sum of all numbers is: " + sum);

    }



    public static Integer promptForInput () {

        System.out.println("Welcome to \"Summing up\"");
        System.out.print("Please enter a number greater than 0 > ");

        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextInt()) {
            int numberSelection = userInput.nextInt();
            if (numberSelection < 0){
                return promptForInput();
            }
            else {
                return numberSelection;
            }
        } else {
            return promptForInput();
        }

    }
}