package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int correct_answer= 0;

        int wrong_answer = 0;

        Scanner console = new Scanner(System.in);

        Random number = new Random();

        while (wrong_answer < 3) {

            boolean counter = play(number, console);

            if (counter == false)
            {
                wrong_answer++;
            }

            else if (counter == true) {

                correct_answer++;
            }
c
        }

        System.out.println("You earned " + correct_answer + " total points");

    }

    public static boolean play (Random number, Scanner console) {

        int counter2 = number.nextInt(10) + 1;

        int add = number.nextInt(10) + 1;

        System.out.print(counter2);

        for (int i = 2; i <= number.nextInt(4)+2; i++)
        {
            counter2 += add;

            System.out.print(" + " + add);

        }

        System.out.print(" = ");

        int answer2 = console.nextInt();

        if (answer2 == counter2) {

            return true;
        }

        else
        {

            System.out.println("Wrong! The answer was " + counter2);

            return false;

        }

    }
}
