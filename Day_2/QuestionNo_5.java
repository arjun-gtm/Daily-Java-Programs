/* Create a Java function called calculateFactorial that takes an integer 
  and returns its factorial. Prompt the user to enter a positive integer
  and display its factorial. */


import java.util.Scanner;  
public class QuestionNo_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionNo_5 obj = new QuestionNo_5();

        int number;
        System.out.print("Enter the number you want factorial of: ");
        number = sc.nextInt();
        sc.close();

        int factorial = obj.calculateFactorial(number);
        System.out.println(factorial);
    }

    public int calculateFactorial(int number){
        int factorial=1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
