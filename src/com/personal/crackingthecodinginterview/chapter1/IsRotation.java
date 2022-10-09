package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class IsRotation {
    private StringBuffer inputString = new StringBuffer();
    private StringBuffer rotationString = new StringBuffer();
    Scanner sc = new Scanner(System.in);

    private void getInputString() {
        System.out.println("Enter first STring");
        inputString.append(sc.nextLine());

    }

    private void getRotationString() {
        System.out.println("Enter string to check for rotation");
        rotationString.append(sc.nextLine());
        rotationString.append(rotationString);
        System.out.println(rotationString);
    }

    private Boolean ifIsSubString(StringBuffer s1, StringBuffer s2) {
        int i = 0, j = 0, count = 0;

        while (i < s1.length()) {
            if (count == s2.length()) {
                return true;
            }
            while (j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    i++;
                    j++;
                }
                else if (s1.charAt(i) != s2.charAt(j)) {
                    count = 0;
                    j = 0;
                    i++;
                }
            }

        }
        return false;

    }

    public Boolean ifRotation() {
        getInputString();
        getRotationString();
        Boolean isSubstring = ifIsSubString(rotationString, inputString);
        return isSubstring;
    }


}
