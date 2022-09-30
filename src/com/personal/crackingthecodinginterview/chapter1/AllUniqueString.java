package com.personal.crackingthecodinginterview.chapter1;


import java.util.HashMap;
import java.util.Scanner;

public class AllUniqueString {

    StringBuffer sb = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    private StringBuffer takeInput(){
        System.out.println("Please enter a string");
        sb.append(sc.nextLine());
        return sb;
    }
    public boolean findIfAllUniqueString(){
        StringBuffer input =  takeInput();


        HashMap<Integer,Boolean> asciiToValueMapping = new HashMap<>();
        Integer length = sb.length();
        if(length > 126){
            return false;
        }
        for(int i =0; i <length; i++){
            int asciiValue = (int) input.charAt(i);
            if(asciiToValueMapping.containsKey(asciiValue))
                return false;
            asciiToValueMapping.put(asciiValue,true);
        }
        return true;
    }

}
