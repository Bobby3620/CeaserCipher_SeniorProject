package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner kbInput = new Scanner(System.in);
        Scanner respones = new Scanner(System.in);
        Caeser c;

        String plainText = "";
        String YES  = "";
        String YES1 = "";
        int shift = 0;
        int EQUAL = 0;
        boolean encrypted = false;

        while(!encrypted){
            System.out.println("Please enter a word or sentence to encrypt");
            plainText = kbInput.nextLine();
            System.out.println("Please enter a number between 1-26");
            shift = kbInput.nextInt();

                while (shift <= 0 || shift > 26){
                    System.out.println("Please choose a number between 1-26");
                    shift = kbInput.nextInt();
                }

            c = new Caeser(plainText, shift);

            System.out.println("Your encrypted word is: " + c.Cipher());
            System.out.println("Would you like to decipher your word?");
            YES = respones.nextLine();
                while (YES.equalsIgnoreCase("YES"))
                {
                    System.out.println("Okay! What is your shift?");
                    EQUAL = respones.nextInt();
                    if (EQUAL == shift)
                    {
                        System.out.println("Your deciphered word is: " + c.Decipher());
                        break;
                    }else{
                        System.out.println("That's incorrect, try again.");
                    }
                }

            encrypted = true;

        }
    }
}
