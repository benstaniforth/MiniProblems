package benstaniforth.MiniProblems;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeTime {

    public static void main(String[] args) {

        System.out.print("Enter a prime number > ");

        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();

        List<Integer> primeNumbersUpToInput = new ArrayList<>();

        for (int i = 2; i <= numberInput; i++)
            if (checkIfPrime(i)){
                primeNumbersUpToInput.add(i);
            }

        System.out.println(primeNumbersUpToInput);

    }

    private static boolean checkIfPrime (Integer numberInput) {

        for (int i = 2; i < numberInput; i++){
            if (numberInput % i == 0) {
                return false;
            }
        }

        return true;

    }

}
