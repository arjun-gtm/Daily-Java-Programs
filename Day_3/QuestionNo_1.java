/* Write a Java program that takes an array of integers as input from the
  user and calculates the sum and average of all the elements in the 
  array. Display both the sum and average. */


  import java.util.Scanner;
  public class QuestionNo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,average=0;
        System.out.print("How many numbers ?:");
        int numbers = sc.nextInt();
        int a[] = new int[numbers];

        for (int i=0; i<numbers; i++) {
            System.out.print("Enter element no "+ (i+1) + ":");
            a[i]= sc.nextInt();
            sum += a[i];
            average = sum/numbers;
        }
        System.out.println("The sum of entered numbers is: " + sum);
        System.out.println("The average of entered numbers is: " + average);
        sc.close();
    }
  }