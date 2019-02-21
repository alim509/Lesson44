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

        if(sort.toUpperCase().equals("A")) {
            for(j = 0; j < ba.length; j++) {
                BankAccount.compareTo(ba[j]);
            }
        }
        else if(sort.toUpperCase().equals("N")) {
            Arrays.sort(ba);
        }

        for(j = 0; j < ba.length; j++)
            System.out.println(ba[j].name + " >>> $" + ba[j].balance + "\n");
    }

}
