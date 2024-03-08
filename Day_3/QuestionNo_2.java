/* Write a Java program that asks user to enter any character and check
  if the entered character is vowel letter or not. */


import java.util.Scanner;
public class QuestionNo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a= sc.next().charAt(0);
        
        a = Character.toLowerCase(a);// Uppercase lai lowercase ma convert garxa

        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
            System.out.println(a + " is vowel");
        }
        else{
            System.out.println(a + " is not vowel");
        }
        sc.close();
    }
}
