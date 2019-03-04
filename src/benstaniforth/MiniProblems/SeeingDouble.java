package benstaniforth.MiniProblems;


import java.util.Scanner;

public class SeeingDouble {

    public static void main(String[] args) {

        System.out.println("A palindrome is a word that is the same written forwards as it is backwards");
        System.out.println("Enter a word below to check if it is a palindrome");

        Scanner scanner = new Scanner(System.in);
        String inputScanner = scanner.nextLine();

        StringBuilder wordForward = new StringBuilder(inputScanner);
        String stringReverse = new StringBuilder(wordForward).reverse().toString();

        if (wordForward.toString().equals(stringReverse)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }


    }
}
