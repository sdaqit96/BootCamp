package Day2;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //Input object
        Scanner input = new Scanner(System.in);
        //Taking input from user
        System.out.println("Input: ");
        System.out.print("  Enter boolean value :");
        boolean value = input.nextBoolean();
        System.out.println("Opposite of "+value+" is "+(!value));
    }
}
