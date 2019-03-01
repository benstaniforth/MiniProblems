package benstaniforth.MiniProblems;

import java.time.Year;
import java.util.Scanner;

public class LeapingForJoy {

    public static void main(String[] args) {

      System.out.println("Hi. I'm the leap year guru.");
      System.out.print("Enter a number to display the next \"number\" of leap years > ");

        Scanner scanner = new Scanner(System.in);
        Integer numberInput = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int numberOfYearsOutput = 0;


        for (int year = currentYear; numberOfYearsOutput<numberInput; year++){
            if ((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0))){
                numberOfYearsOutput++;
                System.out.println(year);
            }
        }



    }


}
