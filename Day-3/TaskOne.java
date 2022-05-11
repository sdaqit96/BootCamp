package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args){
        final byte rows = 10;
        final byte columns = 10;
        int[][] talbeArray = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                talbeArray[i][j] = (i+1) * (j+1);
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println((i+1)+" * "+(j+1)+" = "+talbeArray[i][j]);;
            }
            System.out.println();
        }
        //or we can simply print the whole array like this in one line
        System.out.println(Arrays.deepToString(talbeArray));
    }
}
