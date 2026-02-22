import java.util.*;
class Account{
    String name;
    int  accountNumber;
    int Pin;
    double balance;
    Account(String name,int accountNumber,double balance,int Pin)
    {
this.name=name;
this.accountNumber=accountNumber;
this.balance=balance;
this.Pin=Pin;
    }
    void deposite(double amount){
        balance+=amount;
        System.out.println("Amount succesfully deposite");
    }
    void withdraw(double amount)
    {
        System.out.println("Enter Pin");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
if(amount<=balance)
{
    balance-=amount;
    System.out.println("Amount withdraw succesfully");
}
else{
    System.out.println("Insufficient Balance!");
}
    }
    void checkBalance(){
        System.out.println("Current Balance:"+balance);
    }
}


public class pro {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name:-");
String name=sc.nextLine();
System.out.println("Enter Account Number:-");
int accNo=sc.nextInt();
System.out.println("Enter Pin:");
int Pin=sc.nextInt();
Account acc=new Account(name,accNo,0,Pin);
int choice;
do { 
    System.out.println("\n1.Deposite");
    System.out.println("\n2.Withdraw");
    System.out.println("\n3.check Balance");
    System.out.println("\n4.Exit");
    System.out.println("Choose option");
    choice=sc.nextInt();
    switch (choice) {
        case 1:System.out.println("Enter Amount:");
        double depositeAmount=sc.nextDouble();
        acc.deposite(depositeAmount);
        break;
        case 2:
        System.out.println("Enter Pin:");
        int enterpin=sc.nextInt();

        if(enterpin==acc.Pin){
System.out.println("Enter Amount:");
 double withdrawAmount=sc.nextDouble();
 acc.withdraw(withdrawAmount);
 }
 else{
System.out.println("Incorrect pin");
 }  
        break;
        case 3:
            acc.checkBalance();
            break;
            case 4:
                System.out.println("Thank You!");
                break;
                default:System.out.println("Invalid Choice!");

    }
} while (choice!=4);
    }
    
}
