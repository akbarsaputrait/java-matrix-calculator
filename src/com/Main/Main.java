package com.Main;

import java.util.Scanner;

import static com.Matrix.Matrix.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("\u001B[33m" + "===== Matrix Calculation Operations =====" + "\u001B[0m");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiply");
    System.out.println("0. Cancel");
    System.out.println("Choose:");

    int operator = scan.nextInt();
    int row = 0;
    int col = 0;
    double[][] matrixA;
    double[][] matrixB;
    double[][] result = new double[row][col];

    if (operator == 1 || operator == 2) {
      System.out.println("\u001B[33m" + "===== Enter the matrix row length =====" + "\u001B[0m");
      row = scan.nextInt();
      System.out.println("\u001B[33m" + "===== Enter the matrix column length =====" + "\u001B[0m");
      col = scan.nextInt();

      matrixA = new double[row][col];
      matrixB = new double[row][col];

      System.out.println("\u001B[33m" + "===== Enter elements of Matrix A =====" + "\u001B[0m");
      inputElement(matrixA, row, col);

      System.out.println("\u001B[33m" + "===== Enter elements of Matrix B =====" + "\u001B[0m");
      inputElement(matrixB, row, col);

      if (operator == 1) {
        result = addition(matrixA, matrixB);
      } else {
        result = subtraction(matrixA, matrixB);
      }
    } else if (operator == 3) {
      System.out.println("\u001B[33m" + "===== Enter the row length of Matrix A =====" + "\u001B[0m");
      int rowA = scan.nextInt();
      System.out.println("\u001B[33m" + "===== Enter the column length of Matrix A =====" + "\u001B[0m");
      int colA = scan.nextInt();

      System.out.println("\u001B[34m" + "The row of Matrix B is equal with the column of Matrix A" + "\u001B[0m");
      System.out.println("\u001B[33m" + "===== Enter the column length of Matrix B =====" + "\u001B[0m");
      int colB = scan.nextInt();

      matrixA = new double[rowA][colA];
      matrixB = new double[colA][colB];

      System.out.println("\u001B[33m" + "===== Masukan nilai matriks A =====" + "\u001B[0m");
      inputElement(matrixA, rowA, colA);

      System.out.println("\u001B[33m" + "===== Masukan nilai matriks B =====" + "\u001B[0m");
      inputElement(matrixB, colA, colB);

      result = multiply(matrixA, matrixB, rowA, colA, colB);
    } else if (operator == 0) {
      System.exit(0);
    } else {
      callMain();
    }

    System.out.println("\n" + "\u001B[32m" + "===== RESULT =====" + "\u001B[0m");
    display(result);
    callMain();
  }

  public static void callMain() {
    String[] arg = {};
    main(arg);
  }
}
