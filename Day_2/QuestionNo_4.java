/* Write a Java function named findMax that takes two integers and returns
  the maximum of the two numbers. Then, prompt the user to enter two integers
  and display the maximum value. */

import java.util.Scanner;
public class QuestionNo_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionNo_4 obj = new QuestionNo_4();

        System.out.print("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int maximum = obj.findMax(a,b);
        System.out.println("Maximum number between " + a + " & " + b + " is " + maximum);
    }
    public int findMax(int a, int b){
        int max;
        if (a>b) {
            max = a;
        }
        else{
            max = b;
        }
        return max;
    }
}
