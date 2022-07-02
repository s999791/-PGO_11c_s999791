package com.company;

import java.util.Arrays;

public class Matrix {

    private int[][]  matrix;
    private static int[][] tempArray;

    private Matrix(int[][] data){
        this.matrix = new int[data.length][data[0].length];
        for(int i = 0; i < data.length; i++ ){
            System.arraycopy(data[i], 0, this.matrix[i], 0, data[i].length);
        }
    }

    public int[][] getMatrix(){
        return this.matrix;
    }

    public void print(){
        for (int[] ints : this.matrix) {
            System.out.print("| ");
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println("|");
        }
    }

    public Matrix add(Matrix m){
        for(int i = 0; i < this.matrix.length; i++ ){
            for (int j = 0; j < this.matrix[i].length; j++)
                this.matrix[i][j] += m.getMatrix()[i][j];
        }
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2){
        int[][] matrix1 = m1.getMatrix();
        int[][] matrix2 = m2.getMatrix();
        int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++)
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
        return new Matrix(newMatrix);
    }

    public Matrix subtract(Matrix m){
        for(int i = 0; i < this.matrix.length; i++ ){
            for (int j = 0; j < this.matrix[i].length; j++)
                this.matrix[i][j] -= m.getMatrix()[i][j];
        }
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2){
        int[][] matrix1 = m1.getMatrix();
        int[][] matrix2 = m2.getMatrix();
        int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++)
                newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
        }
        return new Matrix(newMatrix);
    }

    
    public static void setUpMatrix(int rowCount, int columnCount){
        tempArray = new int[rowCount][columnCount];
    }

    public static void insertRow(int[] row) {
        boolean isEmpty;
        for(int i = 0; i < tempArray.length; i++ ){
            isEmpty = true;
            for (int j = 0; j < tempArray[i].length; j++){
                if(tempArray[i][j] != 0) {
                    isEmpty = false;
                }
            }
            if (isEmpty) {
                System.arraycopy(row, 0, tempArray[i], 0, tempArray.length);
                break;
            }
        }
    }

    public static Matrix create() {
        return new Matrix(tempArray);
    }
}
