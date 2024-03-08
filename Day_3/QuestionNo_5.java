/* Write a Java program that prompts the user to enter a string and 
   counts the number of vowels (a, e, i, o, u) in the string. 
   Display the count of vowels at the end. */


import java.util.Scanner;
public class QuestionNo_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String st = sc.next();

        st = st.toLowerCase(); //String lai lower case ma convert garxa

        int vowels = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i); //String ko eauta eauta character read garxa
            
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowels++;
            }
        }

        System.out.println("The numbers of voewls in your string is: "+vowels);
        sc.close();
    }
}
