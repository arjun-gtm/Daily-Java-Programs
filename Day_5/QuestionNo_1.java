/* Write a Java program that finds the maximum and minimum elements in an
   array of integers entered by the user. Display both the maximum and
   minimum values. */

import java.util.Scanner;   
public class QuestionNo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums;
        System.out.print("How many elements?: ");
        nums = sc.nextInt();
        int arr[]= new int[nums];

        for (int i=0; i<nums; i++) {
            System.out.print("Enter element no "+ (i+1) + ":");
            arr[i]= sc.nextInt();
        }
        sc.close();
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < nums; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];   
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
    }    
}