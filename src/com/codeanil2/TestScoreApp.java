package com.codeanil2;

import java.util.Scanner;

public class TestScoreApp {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Please enter a score betwenn 0 and 100.");
        System.out.println("To end enter 999.");
        System.out.println(); //print a blank line
        double scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

        while (testScore <= 100)
        {
            System.out.print("Enter Score: ");
            testScore = sc.nextInt();

            if (testScore <= 100)
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }

        }
        double averageScore = scoreTotal / scoreCount;

        String message = "\n" +
                "The Score Count:       " + scoreCount + "\n"
                + "The Score Total:     "  + scoreTotal + "\n"
                + "The Average Score:   "  + averageScore + "\n";
        System.out.println(message);


    }
}
