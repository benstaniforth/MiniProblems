package benstaniforth.MiniProblems;

import java.util.Scanner;

public class PrimeTime {

    public static void main(String[] args) {

        System.out.print("Enter a prime number > ");

        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();

        if ((numberInput % numberInput == 0) && (numberInput % 1 == 0)){
            System.out.println("Yes, this is a prime number");
        } else {
            System.out.println("Sorry, this isn't a prime number");
        }

    }

}
