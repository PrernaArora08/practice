package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please Enter if you want to \n" +
                " 1. Reverse a String\n" +
                " 2. Find IF String is Unique\n" +
                " 3. Find if strings are palindrome\n" +
                " 4. Urlify the String\n" +
                " 5. Is permutation palindrome\n" +
                " 6. one way edit\n" +
                " 7. Compress String\n" +
                " 8. Matrix rotation by 90\n" +
                " 9. Zero Matrix\n" +
                " 10. Is Rotation"
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
        else if(choice == 6){
            OneWayEditString o = new OneWayEditString();
            Boolean ans = o.checkIfStringIsOneEditAway();
            System.out.println(ans);
        }
        else if(choice == 7){
            StringCompression stringCompression = new StringCompression();
            StringBuffer output = stringCompression.compress();
            System.out.println(output);
        }
        else if(choice == 8){
            MatrixRotation mr = new MatrixRotation();
            Integer[][] matrixRotated = mr.rotationArray();
            for(int i = 0; i< matrixRotated.length; i++){
                for (int j = 0; j < matrixRotated.length; j++){
                    System.out.print(matrixRotated[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
        else if (choice ==9){
            ZeroMatrix zm = new ZeroMatrix();
            Integer[][] zeroMatrixOp = zm.zeroMatrix();
            for(int i = 0; i< zeroMatrixOp.length; i++){
                for (int j = 0; j < zeroMatrixOp.length; j++){
                    System.out.print(zeroMatrixOp[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
        else if(choice == 10){
            IsRotation ir = new IsRotation();
            Boolean isRot = ir.ifRotation();
            System.out.println(isRot);
        }
        else
            System.out.println(("Please enter a valid choice"));
    }
}
