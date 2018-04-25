package Example6_BankExercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTests {

    @Test
    public void testAmount() {
        BankAccount testAccount = new BankAccount("Chris", "123", 100);
        
        assertEquals("Failed password amount test", testAccount.getAmount("abc"), -1);
        assertEquals("Correct password amount test", testAccount.getAmount("123"), 100);
        
        BankAccount testAccount2 = new BankAccount("NotChris", "987", 0);
        
        assertEquals("Failed password amount test", testAccount.getAmount("abc"), -1);
        assertEquals("Correct password amount test", testAccount.getAmount("987"), 0);
        
    }
    
    @Test
    public void testTransactions() {
        BankAccount testAccount = new BankAccount("Chris", "123", 100);

        assertTrue("Wrong password transactions test", testAccount.getTransactions("abc") == null);
        assertTrue("Correct password transactions test", testAccount.getTransactions("123").isEmpty());
        
        testAccount.makeDeposit(100, "123");
        assertTrue("Added deposit transactions test", testAccount.getTransactions("123").contains(100));
   
        testAccount.makeWithdrawal(100, "123");
        assertTrue("Added withdrawal transactions test", testAccount.getTransactions("123").contains(-100));
    }
    
    @Test
    public void testDeposit() {
        BankAccount testAccount = new BankAccount("Chris", "123", 100);
        
        testAccount.makeDeposit(100, "abc");
        assertEquals("Wrong password deposit test", testAccount.getAmount("123"), 100);
        testAccount.makeDeposit(100, "123");
        assertEquals("Correct password amount test", testAccount.getAmount("123"), 200);

    }
    
    @Test
    public void testWithdrawal() {
        BankAccount testAccount = new BankAccount("Chris", "123", 100);

        testAccount.makeWithdrawal(100, "abc");
        assertEquals("Wrong password withdrawal test", testAccount.getAmount("123"), 100);
        testAccount.makeDeposit(100, "123");
        assertEquals("Correct password amount test", testAccount.getAmount("123"), 200);
    }

}
