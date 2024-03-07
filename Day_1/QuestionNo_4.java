/*Create a program that calculates the simple interest based on the principal amount,
 rate of interest, and time period entered by the user. Use a function to perform the
 interest calculation. */

import java.util.Scanner;
public class QuestionNo_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionNo_4 interest = new QuestionNo_4();

        int si,principal,rate,time;
        System.out.print("Enter the principle amount:");
        principal = sc.nextInt();
        System.out.print("Enter the rate:");
        rate = sc.nextInt();
        System.out.print("Enter the time:");
        time = sc.nextInt();
        sc.close();

        si = interest.simpleInterest(principal,rate,time);
        System.out.print("Simple Interest = " + si);
    }

    public int simpleInterest(int principal, int rate, int time)
    {
        return (principal*time*rate)/100;
    }
}
