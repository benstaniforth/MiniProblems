package benstaniforth.MiniProblems;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hi there, please enter your name");


        Scanner scanner = new Scanner(System.in);
        String personsName = scanner.nextLine();


        if (personsName.equals("Alice")){
            System.out.println("Hi there Alice");
        }
        else if (personsName.equals("Bob")){
            System.out.println("Howdy Bob");
        }
        else {
            System.out.println("Sorry, I don't know you");
        }




    }



}
