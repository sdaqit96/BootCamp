package Day4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskOne {
    public static void main(String[] args){
        // 1. declare and initialize String array with 7 arbitrary colors.
        String[] colors = {"White", "Black", "Red", "Blue","Yellow","Green","Brown"};

        // 2. Create new list "colors" (ArrayList) of type String
        List<String> listColos = new ArrayList<String>();

        // 3. Copy/add all elements from String array to colors list
        Collections.addAll(listColos, colors);

        //for(String e:colors){
        //    listColos.add(e);
        //}

        // 4. Remove 3rd element from colors list
        listColos.remove(2);

        // 5. Add new color at the end of the colors list
        listColos.add("Purple");

        // 6. Add new color at the beginning of the colors list
        listColos.add(0, "Red");

        // 7. Loop through colors list and output all values (use for each loop)
        System.out.print("Colors List is for each loop: ");
        for(String e: listColos){
            System.out.print(e+" ");
        }
        System.out.println();

        // 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
        // index 2 to index 5)
        List<String> colorsSubList = listColos.subList(2, 5);

        // 9. Use for loop to output each element of colorsSublist list
        System.out.print("Sublist of Colors: ");
        for(String e: colorsSubList){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Both Lists:");
        System.out.println(listColos);
        System.out.println(colorsSubList);


    }
}
