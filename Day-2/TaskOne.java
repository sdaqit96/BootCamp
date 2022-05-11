package Day2;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args){
        //Input object
        Scanner input = new Scanner(System.in);
        //Taking input from user
        System.out.println("Input: ");
        System.out.print("  Enter value a:");
        int a = input.nextInt();
        System.out.print("  Enter value b:");
        int b = input.nextInt();
        //conditions
        boolean equal = (a == b);
        boolean lessThan = (a < b);
        boolean greaterThan = (a > b);
        boolean lessThanEqualTo = (equal || lessThan);
        boolean greaterThanEqualTo = (equal || greaterThan);
        //results output
        System.out.println("is "+a+" equal to "+b+"? -" + equal);
        System.out.println("is "+a+" less than to "+b+"? -" + lessThan);
        System.out.println("is "+a+" less than or equal to "+b+"? -" + lessThanEqualTo);
        System.out.println("is "+a+" greater than to "+b+"? -" + greaterThan);
        System.out.println("is "+a+" greater than or equal to "+b+"? -" + greaterThanEqualTo);

    }
}
