package benstaniforth.MiniProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RightBackAtYou {

    public static void main(String[] args) {

        System.out.println("Please enter as many numbers as you wish below.");
        System.out.println("Once you have finished, type \"Done\".");

        List<Integer> numbersChosen = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();

        do {
            numbersChosen.add(userInput);
            scanner.nextInt();
        } while (userInput != -1);

        System.out.println(numbersChosen);


    }





}
