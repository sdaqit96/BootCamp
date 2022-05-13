package Day2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class TaskTwoTest {
    @Test
    @DisplayName("Check the value equal")
    public void TestEqual()
    {
        TaskTwo obj = new TaskTwo();
        Assert.assertEquals(true, obj.isEqual(5,5));
        Assert.assertEquals(false, obj.isEqual(4,5));
        Assert.assertEquals(true, obj.isEqual(7,7));
        Assert.assertEquals(true, obj.isEqual(10,10));
        Assert.assertEquals(false, obj.isEqual(4,5));
        Assert.assertEquals(true, obj.isEqual(100,100));
    }

}