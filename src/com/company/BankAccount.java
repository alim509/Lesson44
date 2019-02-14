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
        int retValue;
        int length;

        if (name.length() < otherAccount.name.length())
        {
            length = otherAccount.name.length();
        }
        else
        {
            if(name.length() > otherAccount.name.length())
            {
                length = name.length();
            }
            else
            {
                length = name.length();
            }
        }

        for(int i = 0; i < length; i++) {
            char character = name.charAt(i);
            char otherCharacter = otherAccount.name.charAt(i);
            if ((int)character < otherCharacter) {
                retValue = -1;
            } else {
                if (balance > otherAccount.balance) {
                    retValue = 1;
                } else {
                    retValue = 0;
                }
            }
            return retValue;
        }
    }
    public String name;
    public double balance;
}