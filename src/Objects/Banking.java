package Objects;
import java.util.Scanner;
public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=50;
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=1000;
        }
        System.out.print("Enter no.of queries : ");
        int q = sc.nextInt();
        for(i=1;i<=q;i++)
        {
            int p,a,b,amount;
            System.out.println("1.Credit 2.Debit 3.Transfer 4.Check Balance");
            p = sc.nextInt();
            switch(p)
            {
                case 1:{
                    System.out.println("Enter account Number and Amount");
                    a = sc.nextInt();
                    amount = sc.nextInt();
                    arr[a-1]+=amount;
                }break;
                case 2:{
                    System.out.println("Enter account Number and Amount");
                    a = sc.nextInt();
                    amount = sc.nextInt();
                    if(amount>arr[a-1]){
                        System.out.println("Insufficient Balance");
                    }
                    else {
                        arr[a-1]-=amount;
                        System.out.println("You withdrawn amount "+amount+" R.S");
                    }
                }break;
                case 3:{
                    System.out.print("Enter sender account Number : ");
                    a = sc.nextInt();
                    System.out.print("Enter reciver account Number : ");
                    b = sc.nextInt();
                    System.out.print("Enter Amount : ");
                    amount = sc.nextInt();
                    if(amount>arr[a-1]){
                        System.out.println("Insufficient Balance");
                    }
                    else {
                        arr[a-1]-=amount;
                        arr[b-1]+=amount;
                        System.out.println("Transferred Amount "+amount+" to "+b+" account");
                    }
                }break;
                case 4:{
                    System.out.print("Enter account Number to check Balance : ");
                    a = sc.nextInt();
                    System.out.println("Balance = "+ arr[a-1]);
                }break;
            }
        }
    }
}
