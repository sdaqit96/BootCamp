package Day2;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        //Input object
        Scanner input = new Scanner(System.in);
        //Taking input from user
        System.out.println("Input: ");
        System.out.print("  Enter value a:");
        boolean b1 = input.nextBoolean();
        System.out.print("  Enter value b :");
        boolean b2 = input.nextBoolean();
        //condition
        boolean equal = (b1 == b2);
        //results output
        System.out.println("is b1 and b2 equal? -" + equal);

    }
}

