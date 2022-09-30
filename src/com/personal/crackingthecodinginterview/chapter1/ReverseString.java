package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class ReverseString {
    StringBuffer sb = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    private StringBuffer getInput(){
        System.out.println("Please enter a string to reverse");
        sb.append(sc.nextLine());
        return  sb;
    }
    public void reverseString(){
        StringBuffer input = getInput();
        StringBuffer output = new StringBuffer();
        for(int i = input.length() - 1 ;i>=0; i--){
            output.append(input.charAt(i));
        }
        System.out.println("reversed String is "+ output);
    }
}
