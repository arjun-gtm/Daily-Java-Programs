//Project One- Day 4

import java.util.Scanner;;
public class FirstProject {
    private static boolean choiceExecuted = false;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FirstProject mainFunction = new FirstProject();

        int operator;
        do {
            if (!choiceExecuted) {
                displayMenu();
            }

            operator = scanner.nextInt();

            switch (operator) {
                case 1:
                    mainFunction.simpleCalculator();
                    break;
                case 2:
                    mainFunction.evenOddChecker();
                    break;
                case 3:
                    mainFunction.multiplicationTableGenerator();
                    break;
                case 4:
                    mainFunction.simpleInterestCalculator();
                    break;
                case 5:
                    mainFunction.celciusToFahrenheit();
                    break;
                case 6:
                    mainFunction.displayElementsOfArray();
                    break;
                case 7:
                    mainFunction.positiveIntegerChecker();
                    break;
                case 8:
                    mainFunction.maxOfTwoIntegers();
                    break;
                case 9:
                    mainFunction.factorialFinder();
                    break;
                case 10:
                    mainFunction.sumAndAverageOfArrayElements();
                    break;
                case 11:
                    mainFunction.vowelCharacterChecker();
                    break;
                case 12:
                    mainFunction.printStarPattern();
                    break;
                case 13:
                    mainFunction.reverseNumber();
                    break;
                case 14:
                    mainFunction.countVowelsInString();
                    break;
                case 15:
                    mainFunction.exitTheProgram();
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }

        } while (operator != 15);
        scanner.close();
    }

    // For choice executed displayMenu()

    public static void displayMenu() {
        System.out.println("Choose one !!");
        System.out.println("-------------------");

        System.out.println("1. Simple Calculator");
        System.out.println("2. Even Odd Checker");
        System.out.println("3. Multiplication Table Generator");
        System.out.println("4. Simple Interest Calculator");
        System.out.println("5. Celcius to Fahrenheit Converter");
        System.out.println("6. Display Elements of Array");
        System.out.println("7. Positive Integer Checker");
        System.out.println("8. Greater in two numbers");
        System.out.println("9. Factorial Finder");
        System.out.println("10. Sum & Average of Array Elements");
        System.out.println("11. Vowel Character Checker");
        System.out.println("12. Print Star Pattern");
        System.out.println("13. Reverse a Number");
        System.out.println("14. Count Vowels in a String");
        System.out.println("15. Exit The Program !!");
        System.out.println();
        System.out.print("Enter your choice: ");
    }

    // Choice no 1

    public void simpleCalculator() {

        choiceExecuted = true;

        Scanner calc = new Scanner(System.in);
        FirstProject calcObj = new FirstProject();

        int num1, num2, op, result = 0;
        System.out.print("Enter two numbers: ");
        num1 = calc.nextInt();
        num2 = calc.nextInt();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");

        op = calc.nextInt();
        calc.close();
        switch (op) {
            case 1:
                result = calcObj.Sum(num1, num2);
                System.out.println("The sum is: " + result);
                System.out.println("-------------------");
                break;

            case 2:
                result = calcObj.Sub(num1, num2);
                System.out.println("The sub is: " + result);
                System.out.println("-------------------");
                break;

            case 3:
                result = calcObj.Pro(num1, num2);
                System.out.println("The product is: " + result);
                System.out.println("-------------------");
                break;

            case 4:
                result = calcObj.Div(num1, num2);
                System.out.println("The division is: " + result);
                System.out.println("-------------------");
                break;

            default:
                System.out.println("Invalid Choice!");
                System.out.println("-------------------");
                break;
        }
    }

    // Sub function of choice no 1
    public int Sum(int num1, int num2) {
        return num1 + num2;
    }

    public int Sub(int num1, int num2) {
        return num1 - num2;
    }

    public int Pro(int num1, int num2) {
        return num1 * num2;
    }

    public int Div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Enter number other than zero for division!!");
            System.out.println("-------------------");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    // Choice no 2

    public int evenOddChecker() {

        choiceExecuted = true;

        Scanner eoc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = eoc.nextInt();
        eoc.close();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
            System.out.println("-------------------");
            return number;
        } else {
            System.out.println(number + " is odd");
            System.out.println("-------------------");
            return number;
        }
    }

    // Choice no 3

    public void multiplicationTableGenerator() {

        choiceExecuted = true;

        Scanner mtg = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = mtg.nextInt();
        mtg.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }

    // Choice no 4

    public int simpleInterestCalculator() {

        choiceExecuted = true;

        Scanner sic = new Scanner(System.in);
        int p, t, r, interest;
        System.out.print("Enter principal:");
        p = sic.nextInt();
        System.out.print("Enter time:");
        t = sic.nextInt();
        System.out.print("Enter rate:");
        r = sic.nextInt();
        sic.close();

        interest = (p * t * r) / 100;
        System.out.println("Simple Interest is: " + interest);
        return interest;
    }

    // Choice no 5

    public int celciusToFahrenheit() {

        choiceExecuted = true;

        Scanner ctf = new Scanner(System.in);
        int cel, fah;
        System.out.print("Enter temperature in celcius: ");
        cel = ctf.nextInt();
        ctf.close();

        fah = (cel * 9 / 5) + 32;
        System.out.println("Temperature in fahrenheit is: " + fah);
        return fah;
    }

    // Choice no 6

    public void displayElementsOfArray() {

        choiceExecuted = true;

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Elements is the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Choice no 7

    public void positiveIntegerChecker() {

        choiceExecuted = true;

        Scanner pic = new Scanner(System.in);
        int number = 0;
        boolean checker = false;

        while (!checker) {
            System.out.print("Enter your integer:");
            number = pic.nextInt();

            if (number > 0) {
                checker = true;
            } else {
                System.out.print("Enter the number again!");
            }
        }
        pic.close();
        System.out.println("You entered a positive integer: " + number);
    }

    // Choice no 8

    public int maxOfTwoIntegers() {

        choiceExecuted = true;

        Scanner mti = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = mti.nextInt();
        int num2 = mti.nextInt();
        mti.close();

        int max;
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
            max = num1;
        } else {
            System.out.println(num2 + " is greater");
            max = num2;
        }
        return max;
    }

    // Choice no 9

    public int factorialFinder() {

        choiceExecuted = true;

        Scanner ff = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter the number you want factorial of: ");
        num = ff.nextInt();
        ff.close();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("The factorial of " + num + " is: " + fact);
        return fact;
    }

    // Choice no 10

    public void sumAndAverageOfArrayElements() {

        choiceExecuted = true;

        Scanner savg = new Scanner(System.in);
        int nums, sum = 0, avg = 0;
        System.out.print("How many elements?: ");
        nums = savg.nextInt();

        int a[] = new int[nums];

        for (int i = 0; i < nums; i++) {
            System.out.print("Enter element no " + (i + 1) + ':');
            a[i] = savg.nextInt();
            sum += a[i];
            avg = sum / nums;
        }
        savg.close();
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }

    // Choice no 11

    public void vowelCharacterChecker() {

        choiceExecuted = true;

        Scanner vcc = new Scanner(System.in);
        System.out.print("Enter your character: ");
        char ch = vcc.next().charAt(0);
        vcc.close();

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel character");
        } else {
            System.out.println(ch + " is not a vowel character");
        }
    }

    // Choice no 12

    public void printStarPattern() {

        choiceExecuted = true;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Choice no 13

    public int reverseNumber() {

        choiceExecuted = true;

        Scanner rn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = rn.nextInt();
        rn.close();

        int rev = 0, temp;
        while (num != 0) {
            temp = num % 10;
            rev = (rev * 10) + temp;
            num /= 10;
        }
        System.out.println("Reversed number is: " + rev);
        return rev;
    }

    // Choice no 14

    public int countVowelsInString() {
        choiceExecuted = true;

        Scanner cvs = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = cvs.next();
        cvs.close();

        str = str.toLowerCase();
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("The numbers of vowels in your string is: " + vowels);
        return vowels;
    }

    // Choice no 15
    
    public void exitTheProgram() {
        System.out.println("Exiting the java program !!!!");
        System.out.println("-----------------------------");
    }
}
