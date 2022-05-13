package Day3;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest{
    @Test
    public void checkFunctionality(){
        BankAccount bankAccount = new BankAccount();
        Assert.assertEquals(true, bankAccount.depist(100.5));
        Assert.assertEquals(false, bankAccount.depist(7000));
        Assert.assertEquals(true, bankAccount.withDraw(50.7));
        Assert.assertEquals(false, bankAccount.withDraw(500.7));
        Assert.assertEquals(true, bankAccount.transferBalance(20));
        Assert.assertEquals(false, bankAccount.transferBalance(800));
    }

}