package com.company;

public class Caeser {

    private String word = " ";
    private String cipherText = "";
    private int key = 0;

    public Caeser(String plainText, int shift)
    {
        word = plainText;
        key = shift;
    }

    public String Cipher()
    {

        int len = word.length();

        for (int i = 0; i < len; i++)
        {

          char ch = word.charAt(i);

            if (Character.isLetter(ch))
            {

                if (Character.isLowerCase(ch))
                {

                    char c = (char)(ch + key);
                    if (c > 'z'){
                        cipherText += (char)(ch - (26 - key));
                    }else{
                        cipherText += c;
                    }

                }

                else if (Character.isUpperCase(ch))
                {

                    char d = (char)(ch + key);
                    if (d > 'Z'){
                        cipherText += (char)(ch - (26 - key));
                    }else{
                        cipherText += d;
                    }

                }

            }else{
                cipherText += ch;
            }

        }

        return cipherText;

    }

    public String Decipher()
    {

        return this.word;

    }



}
