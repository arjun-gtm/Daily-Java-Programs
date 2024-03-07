/* Write a Java program that presents a simple menu to the user with options
  like "1. Print Hello", "2. Print Goodbye", and "3. Exit". Use a do-while 
  loop to repeatedly display the menu and execute the chosen option 
  "using function"until the user selects to exit. */

import java.util.Scanner;

public class QuestionNo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionNo_3 obj = new QuestionNo_3();

        int op;

        do {
            System.out.println("Choose one !!");
            System.out.println("-------------------");
            System.out.println("1. Print Hello");
            System.out.println("2. Print Goodbye");
            System.out.println("3. Exit");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    obj.printHello();
                    break;
                case 2:
                    obj.printGoodbye();
                    break;
                case 3:
                    obj.exit();
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }
        } while (op != 3);
        sc.close();
    }
    public void printHello() {
        System.out.println("Hello!!");
        System.out.println("-------------------");
        System.out.println("-------------------");
    }
    public void printGoodbye() {
        System.out.println("Goodbye!!");
        System.out.println("-------------------");
        System.out.println("-------------------");
    }
    public void exit() {
        System.out.println("Exiting Program !!");
        System.out.println("-------------------");
        System.out.println("-------------------");
    }
}
