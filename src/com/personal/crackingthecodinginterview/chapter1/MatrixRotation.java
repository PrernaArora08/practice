package com.personal.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class MatrixRotation {
    int n,temp,temp2;

    Scanner sc = new Scanner(System.in);
    private Integer[][] inputArray(){
        System.out.println("Please enter the size of array");
        n = sc.nextInt();
        Integer [][] matrix = new Integer[n][n];
        System.out.println("Please enter the 2D matrix : " + n * n + "elements");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return  matrix;
    }
    public Integer[][] rotationArray(){
        Integer[][] inputMatrix = inputArray();
        Integer[][] outputMatrix = new Integer[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
               outputMatrix[j][n-i-1]= inputMatrix[i][j];
            }
        }
        return outputMatrix;
    }

    //ToDo :Implement in-place for this 2 ways - transpose and shift columns or consider 2 extra variable and try
    public Integer[][] rotationArrayInPlace() {
        Integer[][] inputMatrix = inputArray();
        return inputMatrix;
    }
}
