package Day2;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        //Input object
        Scanner input = new Scanner(System.in);
        //Taking input from user
        System.out.println("Input: ");
        System.out.print("  Enter value whole number:");
        int number = input.nextInt();
        //we can do like in different ways
        String result = (number % 2 == 0 && number!=0) ? "false" : "true";
        System.out.println(result);
        //second way to do this
        boolean even = (number%2!=0);
        System.out.println(even);


    }
}
