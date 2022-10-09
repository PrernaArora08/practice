package com.personal.crackingthecodinginterview.chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroMatrix {
    int n;

    Scanner sc = new Scanner(System.in);
    private Integer[][] inputArray(){
        System.out.println("Please enter the size of array");
        n = sc.nextInt();
        Integer [][] matrix = new Integer[n][n];
        System.out.println("Please enter the 2D matrix : " + n * n + " elements");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return  matrix;
    }

    public Integer[][] zeroMatrix(){
        Integer[][] inputMatrix = inputArray();
        ArrayList rowsToZero = new ArrayList<Integer>();
        ArrayList columnsToZero = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(inputMatrix[i][j] == 0){
                    rowsToZero.add(i);
                    columnsToZero.add(j);
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(rowsToZero.contains(i)){
                    inputMatrix[i][j] = 0;
                }
                if(columnsToZero.contains(j)){
                    inputMatrix[i][j] = 0;
                }
            }
        }
        return inputMatrix;
    }
}
