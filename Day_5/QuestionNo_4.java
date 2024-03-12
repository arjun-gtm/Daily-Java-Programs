/* Write a Java program that takes an array of integers as input and sorts
   it in ascending order. Then display the sorted array. */


   import java.util.Scanner;

   public class QuestionNo_4 {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           System.out.print("Enter the size of the array: ");
           int size = sc.nextInt();
   

           int[] array = new int[size];
           System.out.println("Enter the elements of the array:");
           for (int i = 0; i < size; i++) {
               System.out.print("Enter element " + (i + 1) + ": ");
               array[i] = sc.nextInt();
           }

           for (int i = 0; i < size - 1; i++) {
               for (int j = 0; j < size - i - 1; j++) {
                   if (array[j] > array[j + 1]) {
                       // Swap array[j] and array[j + 1]
                       int temp = array[j];
                       array[j] = array[j + 1];
                       array[j + 1] = temp;
                   }
               }
           }
   
           System.out.println("Sorted array in ascending order:");
           for (int i = 0; i < size; i++) {
               System.out.print(array[i] + " ");
           }
           System.out.println();
   
           sc.close();
       }
   }
   
