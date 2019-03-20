package com.company;

import java.io.*;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String args[]) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        String sort;
        int j;
        int m = 0;
        Scanner kbReader = new Scanner(System.in);

        BankAccount ba[] = new BankAccount[5];

        for (j = 0; j < ba.length; j++) {
            kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine();
            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble();
            System.out.println(" "); //gives a blank line between accounts

            ba[j] = new BankAccount(name, amount);
        }

        System.out.println("\nSort alphabetical or numerically? A/N?");
        sort = kbReader.next();

        BankAccount temp;

        if(sort.toUpperCase().equals("A")) {
            while(m != 4) {
                for (j = 0; j < ba.length - 1; j++) {
                    if ((int) (ba[j].getName().charAt(0)) > (int) (ba[j + 1].getName().charAt(0))) {
                        temp = ba[j];
                        ba[j] = ba[j + 1];
                        ba[j + 1] = temp;
                    }
                }
                m++;
            }
        }
        else if(sort.toUpperCase().equals("N")) {
            Arrays.sort(ba);
        }

        for(j = 0; j < ba.length; j++)
            System.out.println(ba[j].name + " >>> $" + ba[j].balance + "\n");
    }

}
