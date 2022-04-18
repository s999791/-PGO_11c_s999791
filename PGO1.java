package com.company;
import java.util.Random;
import java.util.Arrays;
public class PGO1 {
   public static void main(String[] args) {
         int length = 10;
         int[] arr = new int[length];
         Random rand = new Random();

         int min = 100;
         int max = 1000;
         for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(max - min) + min;
         }
         System.out.print("Generated array: " );
         printArray(arr);
         System.out.println();
         int[] sorted=sort(arr);
         System.out.print("Sorted array: ");
         printArray(sorted);
      }

   public static int[] sort(int[] elements){
       int[] copy= elements.clone();
       Arrays.sort(copy);
      return copy;
   }
   public static void printArray(int[] elements){
       System.out.print( Arrays.toString(elements));
   }
}