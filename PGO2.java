package com.company;

import java.util.Scanner;

public class PGO2 {

    public static void main(String args[]) {
        while(true){
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();


            if (n < 5 || n % 2 == 0) {
                System.out.println("Wrong input data, try again. Please enter odd number, higher than 5.");
            } else {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1) {
                            System.out.print("*");
                        } else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                return;
            }
        }
    }
}

