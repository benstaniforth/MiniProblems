package benstaniforth.MiniProblems;


import java.util.Scanner;

public class PrimeTime {

    public static void main(String[] args) {

        System.out.print("Enter a prime number > ");

        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();

        int isItPrime = 1;

        for (int i = 2; i < numberInput; i++){
            if (numberInput % i == 0){
            isItPrime++; }
            else {
                 }
        }

        if (isItPrime == 1){
            System.out.println("Yes, this is a prime");
        }
        else {
            System.out.println("No, this is not a prime");
        }


    }



}
