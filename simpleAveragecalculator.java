package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Student 1: 85");
        System.out.println("Student 2: 86");
        System.out.println("Student 3: 92");
        System.out.print("\nAverage: ");
        average();
    }

    public static void average() {

        int a = 85;
        int b = 86;
        int c = 92;

        double score;

        score = (a+b+c)/3.0;

        System.out.printf("%.4f", score);



    }
}
