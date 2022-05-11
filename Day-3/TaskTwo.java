package Day3;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args){
        int[] wholeNumberArray = {3,5,6,9};
        //copy Array
        int[] copyArray = new int[wholeNumberArray.length];
        //Coping wholeNumberArray by Iterating one by one till the length of Array
        for(int i = 0; i< wholeNumberArray.length; i++) {
            copyArray[i] = wholeNumberArray[i];
        }
        //pring copied array.
        System.out.println(Arrays.toString(copyArray));
    }

}
