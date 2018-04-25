package Example6_BankExercise;

import java.awt.List;
import java.util.ArrayList;

public class BankAccount {

    private String username;
    private String password;
    private int balance;
    private ArrayList<Integer> transactionsList;
    
    public BankAccount(String inputUsername, String inputPassword, int inputAmount) {
        this.username = inputUsername;
        this.password = inputPassword;
        this.balance = inputAmount;
        
        transactionsList = new ArrayList<Integer>();
    }
    
    public int getAmount(String testPW) {
        if(testPW.equals(password)) {
            return balance;
        } else {
            return -1;
        }
    }
    
    public ArrayList<Integer> getTransactions(String testPW) {
        if(testPW.equals(password)) {
            return transactionsList;
        } else {
            return null;
        }
    }
    
    public void makeDeposit(int amount, String testPW) {
        if(testPW.equals(password)) {
            balance += amount;
            transactionsList.add(amount);
        }
    }
    
    public void makeWithdrawal(int amount, String testPW) {
        if(testPW.equals(password)) {
            balance -= amount;
            transactionsList.add(-amount);
        }
    }
    
    private boolean testPassword(String testPassword) {
        return testPassword.equals(password);
    }
    
    public void makeTransfer(BankAccount otherUser, String testPW1, String otherTestPW2, int amount) {
        if(testPassword(testPW1) && otherUser.testPassword(otherTestPW2)) {
            makeWithdrawal(amount, testPW1);
            otherUser.makeDeposit(amount, otherTestPW2);
        }
    }
}
