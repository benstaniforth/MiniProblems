package benstaniforth.MiniProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YouveBeenFramed {

    public static void main(String[] args) {

        System.out.println("Welcome to You've Been Framed");
        System.out.println("Enter a sentence below to have it framed by our creative Java elves");

        Scanner scanner = new Scanner(System.in);
        String sentenceInput = scanner.nextLine();

        String [] words = sentenceInput.split(" ");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));

        System.out.println(wordList);

    }

    public static String framedPrintOut () {



    }

}
