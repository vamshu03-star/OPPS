package Objects;
import java.util.Scanner;
class BankAccount{
    String accHol;
    long accNum;
    double balance;
    String accType;
    BankAccount()
    {
        accHol = "";
        accNum=0;
        balance = 0.0;
        accType = "";
    }
    BankAccount(String h,long num,double b,String type)
    {
        accHol = h;
        accNum= num;
        balance = b;
        accType = type;
    }
    void deposit()
    {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        balance = balance +amount;
        System.out.println("You deposited Rs."+amount+" to account "+accNum);
    }
    void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
            System.out.println("You withdraw Rs."+amount+" from account "+accNum);
        }
    }
    void checkBal()
    {
        System.out.println("Your Balance amount is Rs."+balance);
    }
}
public class BankAccountMgnt {
    public static void main(String[] args) {
        BankAccount[] b= new BankAccount[3];
       b[0]= new BankAccount();
       b[1]= new BankAccount("Teja",2108,2000.9,"Current");
       b[2] = new BankAccount("Vamshi",22011,1000.9,"Saving");
       b[1].deposit();
       b[2].withdraw();
       b[1].checkBal();


    }
}
