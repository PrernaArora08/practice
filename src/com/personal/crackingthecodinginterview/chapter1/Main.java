package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please Enter if you want to " +
                "1. Reverse a String" +
                " 2. Find IF String is Unique" +
                " 3.Find if strings are palindrome" +
                " 4. Urlify the String" +
                " 5. Is permutation palindrome"
        );
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
            PermutationString ps = new PermutationString();
            Boolean ifPermutation = ps.checkIfPermutation();
            System.out.println(ifPermutation ? "permutation" : "Not a permutation");
        }
        else if(choice == 4){
            URLify url = new URLify();
            StringBuffer urlString = url.urlify();
            System.out.println(urlString);
        }
        else if(choice == 5){
            Palindrome p = new Palindrome();
            Boolean isStringPalindrome = p.checkIfPalindrome();
            System.out.println(isStringPalindrome ? "palindrome" : "not palindrome");
        }
        else
            System.out.println(("Please enter a valid choice"));
    }
}
