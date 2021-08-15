import java.util.Scanner;
public class Atm
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM");
            System.out.println("Choose A for Withdraw");
            System.out.println("Choose B for Deposit");
            System.out.println("Choose C for Check Balance");
            System.out.println("Choose D for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case A:
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case B:
                System.out.print("Enter money to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case C:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case D:
                System.exit(0);
            }
        }
    }
}