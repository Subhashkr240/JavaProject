import java.util.*;
class ATM {
    float Balance;
    int PIN=1234; 
    public void checkpin(){
        System.out.println("Enter your PIN: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Wrong PIN");
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check  A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            checkBalance();
        }
        else if(choice == 2){
            withdrawMoney();
        }
        else if(choice == 3){
            depositMoney();
        }
        else if(choice == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");

        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();

    }
    public void withdrawMoney(){
      System.out.println("Enter Amount to withdraw: ");
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextFloat();
      if(amount>Balance){
        System.out.println("Insufficient Balance");
      }
      else{
        Balance = Balance - amount;
        System.out.println("Money Withdrawl Successful");
      }
      menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposit Successful");
        menu();
    }

}

public class ATMMachine{
    public static void  main (String args[]) {
        System.out.println("Welcome to ATM Machine");
        ATM obj = new ATM();
        obj.checkpin();
        

    }
}
