package Week2_Excercise;

public class BankAccountTest {
    public static void main(String[] args) {
        if(args.length == 2){
            BankAccount bankAccount = new BankAccount(args[0],args[1]);
            System.out.println(bankAccount.toString());
        }
        if(args.length == 3){
            BankAccount bankAccount = new BankAccount(args[0],Double.parseDouble(args[2]),args[1]);
            System.out.println(bankAccount.toString());
        }
    }
}
