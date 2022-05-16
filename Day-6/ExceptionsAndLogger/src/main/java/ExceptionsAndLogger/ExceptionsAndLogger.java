package ExceptionsAndLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class ExceptionsAndLogger {
    static Logger logger = LogManager.getLogger(ExceptionsAndLogger.class);

    public static void main(String[] args) throws IOException {
        BankAccount bankAccount = new BankAccount();
        logger.info("Bank Account Deposit of 100.5 unites successful? "+bankAccount.depist(100.5));
        logger.info("Bank Account Deposit of 7000 unites successful? "+bankAccount.depist(7000));
        logger.info("Bank Account Withdraw of 100.5 unites successful? "+bankAccount.withDraw(50.7));
        logger.info("Bank Account Withdraw of 500.7 unites successful? "+bankAccount.withDraw(500.7));
        logger.info("Bank Account Transfer of 20 unites successful? "+bankAccount.transferBalance(20));
        logger.info("Bank Account Transfer of 800.5 unites successful? "+bankAccount.transferBalance(800));

        //Exception handling
        File file = null;
        try {
            int value1=100;
            value1 = value1/0;
            //file not found exception
            file = new File(
                    "C:\\Users\\abc\\Desktop\\test.txt");
            // Creating an object of BufferedReader class
            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null)

                // Print the string
                System.out.println(st);
        } catch(FileNotFoundException | ArithmeticException e)
        {
            logger.error("Exception occur "+e.getMessage());
        }
        finally {
            System.out.println("Completed");
        }

        System.out.println("\n Completed");
    }
}
