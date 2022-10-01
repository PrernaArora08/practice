package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class URLify {
    private StringBuffer inputString = new StringBuffer();
    private StringBuffer urlString = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    private StringBuffer getString(){
        System.out.println("Please Enter the String to be urlified");
        inputString.append(sc.nextLine());
        return inputString;
    }
    public StringBuffer urlify(){
        StringBuffer stringToUrlify = getString();
        for(int i = 0; i < stringToUrlify.length(); i++){
            if (stringToUrlify.charAt(i) == ' '){
                urlString.append("%20");
            }
            else
                urlString.append(stringToUrlify.charAt(i));

        }
        return  urlString;
    }
}
