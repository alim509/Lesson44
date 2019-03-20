package com.company;

/**
 * Created by dpennebacker on 2/1/17.
 */
public class BankAccount implements Comparable
{
    public BankAccount(String nm, double bal) //Constructor
    {
        name = nm;
        balance = bal;
    }

    public int compareTo(Object otherObject)
    {
        //otherObject is passed in as an Object type so let’s convert it into
        //a BankAccount type object.
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue = 0;
        int length;

        if (name.length() < otherAccount.name.length())
        {
            length = name.length();
        }
        else
        {
            if(name.length() > otherAccount.name.length())
            {
                length = otherAccount.name.length();
            }
            else
            {
                length = name.length();
            }
        }

        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; i++) {
                char character = name.charAt(i);
                char otherCharacter = otherAccount.name.charAt(i);
                if ((int) character < (int) otherCharacter) {
                    retValue = -1;
                } else {
                    if ((int) character > (int) otherCharacter) {
                        retValue = 1;
                    } else {
                        retValue = 0;
                    }
                }
            }
        }
        return retValue;
    }

    public String getName() {
        return name;
    }

    public String name;
    public double balance;
}