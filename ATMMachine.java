import java.util.*;
class ATM{
    float balance=20000;
    int amount;
    int PIN = 7858;
    public void checkpin(){
        System.out.println("Enter Your Pin: ");
        Scanner si=new Scanner(System.in);
        int pincode=si.nextInt();
        if(pincode==PIN){
            menu();}
        else{
         System.out.println("Enter a valid pin");
        }
    }
public void menu(){
    System.out.println("Welcome to ATM");
    System.out.println("Enter Your Choice: ");
    System.out.println("1, For Check Balance");
    System.out.println("2, For WithDraw Money");
    System.out.println("3, For Deposit Money");
    System.out.println("4, To Transfer Money");
    System.out.println("5, Quit");
    Scanner si=new Scanner(System.in);
    int a =si.nextInt();
if(a==1){
    check_balance();
   }
    else if(a==2){
        withdraw();
    }
    else if(a==3){
        deposit();
    }
    else if(a==4){
        transfer();
    }
    else if(a==5){
       System.out.println("Thank You!");
        }
        else{
            System.out.println("Please Enter valid Number");
            menu();}
    }
public void check_balance(){
    System.out.println("your balance: "+ balance);
    menu();
}
public void withdraw(){
    System.out.println("Enter Your Amount: ");
    Scanner si =new Scanner(System.in);
    float amount =si.nextFloat();
    if(amount>balance){
        System.out.println("Insufficient Balance");
    }
    else{
    balance=balance-amount;
    System.out.println("Money withdrawl successful");
}menu();
}
public void deposit(){
    System.out.println("Enter Your Amount");
    Scanner si =new Scanner(System.in);
    float amount=si.nextFloat();
 balance=balance+amount;
System.out.println("Amount Deposited Successfully");menu();
}
public void transfer(){
    Scanner si=new Scanner(System.in);
    System.out.println("Enter Receiver Name: ");
    String Name=si.nextLine();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount to Transfer Money: ");
    int transferAmount=sc.nextInt();
    balance=balance-transferAmount;
    System.out.println("Available balance: "+balance);
    System.out.println(Name+" "+transferAmount+" "+"Money Transfer Successfully");
    menu();
}
}
public class ATMMachine{
    public static void main(String[]args){
        Scanner si=new Scanner(System.in);
        System.out.println("Enter UniqueID: ");
        String UniqueID =si.nextLine();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account holder Name: ");
        String Accountholder =sc.nextLine();
        ATM obj=new ATM();
        obj.checkpin();
    }
}

