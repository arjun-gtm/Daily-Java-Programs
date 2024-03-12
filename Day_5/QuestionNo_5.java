/* Write a Java program that defines a function isPalindrome() that takes
   a string as input and display if the entered string is a palindrome or
   not. 
   --A palindrome is a string that reads the same forwards and backwards,
     ignoring spaces, punctuation, and capitalization. */

import java.util.Scanner;
public class QuestionNo_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        sc.close();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove spaces and punctuation
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters mismatch, not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }
}
