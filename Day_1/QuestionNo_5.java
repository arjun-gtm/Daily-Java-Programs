/*Create a program that takes a temperature in Celsius from the user and converts it
 to Fahrenheit using the function.
Formula: Fahrenheit = (Celsius * 9/5) + 32. */

import java.util.Scanner;
public class QuestionNo_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float temp,fh;
        System.out.print("Enter the temperature in celcius:");
        temp = sc.nextFloat();
        sc.close();

        fh = (temp * 9/5)+32;

        System.out.print("The temperature in fahrenheit is " + fh);
    }
}
