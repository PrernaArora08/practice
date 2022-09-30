package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please Enter if you want to 1. Reverse a String 2. Find IF String is Unique");
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        if(choice == 1){
            ReverseString rs = new ReverseString();
            rs.reverseString();
        }
        else if(choice == 2) {
            AllUniqueString allUniqueString = new AllUniqueString();
            boolean result = allUniqueString.findIfAllUniqueString();
            if (result)
                System.out.println("Unique String");
            else
                System.out.println("Not Unique");
        }
        else
            System.out.println(("Please enter a valid choice"));
    }
}
