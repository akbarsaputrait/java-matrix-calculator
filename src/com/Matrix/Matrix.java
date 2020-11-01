package com.Matrix;

import java.util.Scanner;

public class Matrix {

  public static void inputElement(double[][] matrix, int row, int col) {
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix[i][j] = scan.nextDouble();
      }
    }
  }

  public static double[][] addition(double[][] matrixA, double[][] matrixB) {
    double[][] result = new double[matrixA.length][matrixA.length];
    for (int i = 0; i < matrixA.length; i++) {
      for (int j = 0; j < matrixA.length; j++) {
        result[i][j] = matrixA[i][j] + matrixB[i][j];
      }
    }
    return result;
  }

  public static double[][] subtraction(double[][] matrixA, double[][] matrixB) {
    double[][] result = new double[matrixA.length][matrixA.length];
    for (int i = 0; i < matrixA.length; i++) {
      for (int j = 0; j < matrixA.length; j++) {
        result[i][j] = matrixA[i][j] - matrixB[i][j];
      }
    }
    return result;
  }

  public static double[][] multiply(double[][] matrixA, double[][] matrixB, int rowA, int colA, int colB) {
    double[][] result = new double[rowA][colB];
    for (int i = 0; i < rowA; i++) {
      for (int j = 0; j < colB; j++) {
        for (int k = 0; k < colA; k++) {
          result[i][j] += matrixA[i][k] * matrixB[k][j];
        }
      }
    }

    return result;
  }

  public static void display(double[][] matrix) {
    for(double[] row : matrix) {
      for (double column : row) {
        System.out.print(column + "    ");
      }
      System.out.println();
    }
  }
}
