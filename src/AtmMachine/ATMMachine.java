package AtmMachine;

import java.util.Scanner;

class ATM {

    float balance;
    int PIN = 9876;

    public void checkPin() {
        System.out.println("Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1){
            CheckBalance();
        }
        else if (option == 2){
            WithdrawMoney();
        }
        else if (option == 3) {
            DepositMoney();
        }
        else if (option == 4) {
            return;
        }
        else {
            System.out.println("Enter a valid choice");
        }
    }

    public void CheckBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance){
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Balance Withdrawl Successful");
        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}


public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
