package benstaniforth.MiniProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HowManyRabbits {

    public static void main(String[] args) {

        System.out.println("The Fibonacci sequencer will generate a list of Fibonacci numbers up to the point you choose");
        System.out.print("Enter a number to choose how long that list will be > ");

        List<Integer> fibonacciNumbersUpToInput = new ArrayList<>();

        fibonacciNumbersUpToInput.add(0, 0);
        fibonacciNumbersUpToInput.add(1, 1);

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        for (int i = 2; i <= userInput; i++){
            fibonacciNumbersUpToInput.add(fibonacciNumbersUpToInput.get(i-1)+fibonacciNumbersUpToInput.get(i-2));
        }

        System.out.println(fibonacciNumbersUpToInput);

    }


}
