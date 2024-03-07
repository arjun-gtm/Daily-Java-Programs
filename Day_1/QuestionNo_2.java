/*Write a program that takes an integer input from the user and determines whether
 it's an even or odd number. Use an if-else statement to check the number's parity. */

import java.util.Scanner;
public class QuestionNo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int a = sc.nextInt();
        sc.close();
        if (a%2==0) {
            System.out.println(a + " is even");
        }else{
            System.out.println(a + " is odd");
        }
    }
}
