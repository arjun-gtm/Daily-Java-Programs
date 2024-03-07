/*Create a program that generates the multiplication table of a given number entered
 by the user. Use loops to generate the table. */

import java.util.Scanner;
public class QuestionNo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the multiplication table of:");
        int num = sc.nextInt();
        sc.close();

        for (int i=1; i<=10; i++) {
                // System.out.printf("%d X %d = %d\n", num, i, num*i);
                System.out.println(num + " X " + i + " = " + (num*i));
            }
        }
    }
