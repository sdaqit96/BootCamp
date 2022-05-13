package Day2;

import org.junit.*;
import java.util.Scanner;

public class TaskTwo {
    public boolean isEqual(int b1, int b2) {
        return (b1 == b2);
    }

    @Test
    public void checkEquals(){
        Assert.assertEquals(true, isEqual(5,5));
    }
}

