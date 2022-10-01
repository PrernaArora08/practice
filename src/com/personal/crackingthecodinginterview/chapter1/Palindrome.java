package com.personal.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class Palindrome {
    private StringBuffer inputString = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    private void  getInputString(){
        System.out.println("Enter the string");
        inputString.append(sc.nextLine());
    }
    public boolean checkIfPalindrome(){
        getInputString();
        int odd = 0;
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(int i = 0; i < inputString.length(); i++){
            char charati = inputString.charAt(i);
            if(charCount.containsKey(charati)){
                charCount.put(charati, charCount.get(charati) + 1);
            }
            else
                charCount.put(charati,1);
        }
        for(char c : charCount.keySet()){
            if(odd > 1)
                return false;
            if(charCount.get(c)% 2 != 0){
                odd++;
            }
        }
        return true;
    }
}
