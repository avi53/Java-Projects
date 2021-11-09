package com.company;

import java.lang.Math;

public class Main {

    public static void bmiCalculation (double a, double b) {

        double number = 703;

        double combo = b/(Math.pow(a,2));

        double bmi_calculation= combo*number;


        if (bmi_calculation < 18.5)

        {

            System.out.println("underweight");

        }

        else if (bmi_calculation >= 18.5 && bmi_calculation <= 24.9)

        {

            System.out.println("normal");

        }

        else if (bmi_calculation >= 25 && bmi_calculation <= 29.9)

        {

            System.out.println("overweight");
        }
        else if (bmi_calculation >= 30)

        {

            System.out.println("obese");

        }

    }


    public static void main (String [] args) {
        bmiCalculation (70, 194.25);
        bmiCalculation (62.5, 130.5);
        bmiCalculation (50, 190);
    }
}
