package com.personal.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class PermutationString {
    private StringBuffer mainString = new StringBuffer();
    private StringBuffer testString = new StringBuffer();
    HashMap<Integer,Integer> charCount = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private StringBuffer getMainString(){
        System.out.println("Please enter the main String");
        mainString.append(sc.nextLine());
        return mainString;
    }
    private StringBuffer getTestString(){
        System.out.println("Please Enter the second String");
        testString.append(sc.nextLine());
        return testString;
    }
    public boolean checkIfPermutation(){
        getMainString();
        getTestString();
        if(mainString.length() == testString.length()){
                int charAscii,count;
                for(int i = 0; i < mainString.length(); i++){
                    charAscii = (int) mainString.charAt(i);
                   if(charCount.containsKey(charAscii)){
                       count = charCount.get(charAscii);
                   }
                   else
                       count = 0;
                    charCount.put(charAscii,count + 1);
                }
                for(int i = 0; i< mainString.length(); i++){
                    charAscii = (int) testString.charAt(i);
                    if(charCount.containsKey(charAscii)){
                        count = charCount.get(charAscii);
                        charCount.put(charAscii,count - 1);
                    }
                    else
                        return false;
                }
                return true;
            }
        else
            return false;
    }

}
