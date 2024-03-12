/* Write a Java program that takes two arrays of integers as input from 
   the user and finds and displays the common elements between them. */


   import java.util.Scanner;

   public class QuestionNo_2 {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
   
           System.out.print("Enter the number of elements in the first array: ");
           int n1 = sc.nextInt();
           int[] array1 = new int[n1];
           System.out.println("Enter the elements of the first array:");
           for (int i = 0; i < n1; i++) {
               array1[i] = sc.nextInt();
           }
  
           System.out.print("Enter the number of elements in the second array: ");
           int n2 = sc.nextInt();
           int[] array2 = new int[n2];
           System.out.println("Enter the elements of the second array:");
           for (int i = 0; i < n2; i++) {
               array2[i] = sc.nextInt();
           }
   
   
           System.out.println("Common elements between the two arrays are:");
           findCommonElements(array1, array2);
   
           sc.close();
       }

       public static void findCommonElements(int[] arr1, int[] arr2) {
           for (int i = 0; i < arr1.length; i++) {
               for (int j = 0; j < arr2.length; j++) {
                   if (arr1[i] == arr2[j]) {
                       System.out.print(arr1[i] + " ");
                       break;
                   }
               }
           }
           System.out.println();
       }
   }
   