package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int a =3;
        int num = 0;
        Random rand = new Random();

        for (int i=1; i<=3; i++)


            System.out.println("Roll "+ i + ": " + (rand.nextInt(6)+1) + " and " + (rand.nextInt(6)+1));


    }
}
