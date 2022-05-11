package Day2;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Input object
        Scanner input = new Scanner(System.in);
        //Taking input from user
        System.out.println("Input: ");
        System.out.print("  Enter value a:");
        int a = input.nextInt();
        System.out.print("  Enter value b:");
        int b = input.nextInt();
        //conditions
        boolean result = ((a == b) || (a<0 && b>0) || (a > 100 && b >100));
        System.out.println(result);

        //or we can do like this
        String value = ((a == b) || (a<0 && b>0) || (a > 100 && b >100))? "true":"false";
        System.out.println(value);

        //or we can do like this
        if((a == b || a<0 && b>0 || a > 100 && b >100)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
