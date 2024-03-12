/* Write a Java program that prompts the user to enter the size of an 
   array. Then, ask the user to input the elements of the array one by 
   one. After receiving the array elements, prompt the user to enter an 
   index. Finally, display the element at the specified index. */

   import java.util.Scanner;

   public class QuestionNo_3 {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
   
           System.out.print("Enter the size of the array: ");
           int size = sc.nextInt();
   
           int[] array = new int[size];
   
           for (int i = 0; i < size; i++) {
               System.out.print("Enter element at index " + i + ": ");
               array[i] = sc.nextInt();
           }
   
           System.out.print("Enter the index of the element you want to get: ");
           int index = sc.nextInt();

           if (index >= 0 && index < size) {
               System.out.println("Element at index " + index + " is: " + array[index]);
           } else {
               System.out.println("Invalid index. Please enter a valid index.");
           }
   
           sc.close();
       }
   }
   
