package Week2_Excercise;

public class BankAccount {
    private String holderName;
    private double balance;
    private String number;

    public BankAccount(String holderName, String number) {
        this.holderName = holderName;
        this.balance = 0.0;
        this.number = number;
    }

    public BankAccount(String holderName, double balance, String number) {
        this.holderName = holderName;
        this.balance = balance;
        this.number = number;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void depositTo(double amount){
        balance = balance + amount;
    }

    public void withDrawFrom(double amount){
        balance = balance - amount;
    }

    @Override
    public String toString() {
        return "BankAccount " +
                "holderName= " + holderName +
                ", balance=" + balance +
                ", number=" + number +
                '}';
    }
}