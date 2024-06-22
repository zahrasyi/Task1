public class Account{
    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;
    
    Account (String accountNumber,double balance,String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    
    Account(String accountNumber, double balance, String customerName, String email){
        this(accountNumber, balance, customerName, email,null);
    }
    Account (String accountNumber, double balance, String customerName){
        this(accountNumber, balance, customerName, null);
    }
    Account (String accountNumber, double balance){
        this(accountNumber, balance, null);
    }
    Account (String accountNumber){
        this (accountNumber,0);
    }
    Account(){
        this (null);
    }
    void deposit (double amount){

    }
    void withdraw (double amount){

    }
    double getBalance(){
        return balance;
    }


}
