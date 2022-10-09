package com.personal.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class OneWayEditString {
    private StringBuffer input = new StringBuffer();
    private StringBuffer testString = new StringBuffer();
    Scanner sc = new Scanner(System.in);

    private StringBuffer getInputString() {
        System.out.println("Please enter the first string");
        input.append(sc.nextLine());
        return input;
    }

    private StringBuffer getTestString() {
        System.out.println("Please enter second String");
        testString.append(sc.nextLine());
        return testString;
    }

    public boolean checkIfStringIsOneEditAway() {
        StringBuffer inputString = getInputString();
        StringBuffer test = getTestString();
        HashMap<Character, Integer> listOfChars = new HashMap<>();
        Integer removeCount = 0, addCount = 0, count = 1;
        for (int i = 0; i < inputString.length(); i++) {
            if (listOfChars.containsKey(inputString.charAt(i))) {
                count = listOfChars.get(inputString.charAt(i));
                listOfChars.put(inputString.charAt(i), count + 1);
                count = 1;
            } else
                listOfChars.put(inputString.charAt(i), count);
        }
        for (int i = 0; i < testString.length(); i++) {
            if (listOfChars.containsKey(testString.charAt(i))) {
                count = listOfChars.get(testString.charAt(i));
                listOfChars.put(testString.charAt(i), count - 1);
            } else {
                listOfChars.put(testString.charAt(i), -1);
            }
        }
        for (char c : listOfChars.keySet()) {
            if (listOfChars.get(c) < 0) {
                removeCount++;
            }
            if (listOfChars.get(c) > 0) {
                addCount++;
            }
        }
        if (removeCount == 1 && addCount == 0)
            return true;
        if (addCount == 1 && removeCount == 0)
            return true;
        if (removeCount == 1 && addCount == 1) {
            return true;
        } else
            return false;
    }


}
