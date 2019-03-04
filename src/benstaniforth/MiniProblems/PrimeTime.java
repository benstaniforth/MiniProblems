package benstaniforth.MiniProblems;


import java.util.Scanner;

public class PrimeTime {

    public static void main(String[] args) {

        System.out.print("Enter a prime number > ");

        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();

        boolean isItPrime = true;
        for (int i = 2; i < numberInput; i++) {
            if (numberInput % i == 0) {
                isItPrime = false;
            } else {
                isItPrime = true;
            }
        }

        if (isItPrime = false) {
                System.out.println("Sorry, this is not a prime number");
        } else {
                System.out.println("Yes, this is a prime number");
        }


//        for (int i = 2; i < numberInput; i++){
//            if (numberInput % i == 0){
//            System.out.println("Sorry, this isn't a prime number");
//        } else {
//            System.out.println("Yes, this is a prime number");
//        }
//        }
//

    }
}
