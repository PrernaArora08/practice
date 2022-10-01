package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please Enter if you want to " +
                "1. Reverse a String" +
                " 2. Find IF String is Unique" +
                " 3.Find if strings are palindrome" +
                " 4. Urlify the String");
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
        else if(choice == 3){
            PalindromeString ps = new PalindromeString();
            Boolean isStringPalindrome = ps.checkIfPalindrome();
            System.out.println(isStringPalindrome ? "Palindrome" : "Not a palindrome");
        }
        else if(choice == 4){
            URLify url = new URLify();
            StringBuffer urlString = url.urlify();
            System.out.println(urlString);
        }
        else
            System.out.println(("Please enter a valid choice"));
    }
}
