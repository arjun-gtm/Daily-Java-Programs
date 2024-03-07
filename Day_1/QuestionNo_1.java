/*Write a program that takes two numbers and an operator (+, -, *, /) as input 
from the user and performs the corresponding arithmetic operation. Use functions 
to perform each operation and display the result.*/

import java.util.Scanner;
public class QuestionNo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,operator,result;
        System.out.print("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your choice:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        operator = sc.nextInt();
        sc.close();

        QuestionNo_1 obj = new QuestionNo_1();

        switch (operator) {
            case 1:
                result = obj.Add(a,b);
                System.out.println(result);
                break;

                case 2:
                result = obj.Sub(a,b);
                System.out.println(result);
                break;

                case 3:
                result = obj.Mul(a,b);
                System.out.println(result);
                break;

                case 4:
                result = obj.Div(a,b);
                System.out.println("Result = " + result);
                break;
        
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
    }

    public int Add(int a, int b){
        return a+b;
    }
    public int Sub(int a, int b){
        return a-b;
    }
    public int Mul(int a, int b){
        return a*b;
    }
    public int Div(int a, int b){
        if (b==0){
            System.out.println("Enter number other than zero for division!!");
            return 0;
        }
        else{
            return a/b;
        }
    }
}