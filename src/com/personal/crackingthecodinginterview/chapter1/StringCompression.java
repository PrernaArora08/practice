package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class StringCompression {
    private StringBuffer inputString = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    private StringBuffer outputString = new StringBuffer();

    private void getInput(){
        System.out.println("Enter the Input String");
        inputString.append(sc.nextLine());
    }
    public StringBuffer compress(){
        getInput();
        char c = inputString.charAt(0);
        int count =0;
        for(int i =0; i < inputString.length();i++){
            if (c == inputString.charAt(i)){
                count++;
            }
            else{
                outputString.append(c);
                outputString.append(count);
                count = 0;
                c = inputString.charAt(i);
                count++;
            }
        }
        outputString.append(c);
        outputString.append(count);
        if(inputString.length() >outputString.length())
            return outputString;
        else
            return inputString;
    }
}
