/* Create a Java program that repeatedly asks the user to enter a positive
   integer. Use a while loop to keep asking until the user enters a 
   positive integer. */


import java.util.Scanner;
public class QuestionNo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter your number:");
            num = sc.nextInt();

            if (num>0) {
                validInput = true;
            }
            else {
                System.out.println("Enter the number again!!");
            }
        }
        sc.close();
        System.out.println("You entered the positive integer: " + num);
    }
}