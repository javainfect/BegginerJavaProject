package BegginerJavaProject;

import java.util.Scanner;
/**
 * Class bankaccount constructor with attributes and methods needed
 */
public class bankaccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    bankaccount(String cname, String cid)
    {
        cname = customerName;
        cid   = customerId;
    }

    /**
     * Method that adds the amount provided by the user to the bank account
     * @param amount The amount of money the user wants to deposit (Integer)
     */
    public void deposit (int amount)
    {
        if (amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    /**
     * Method that withdraws the amount selected by user from its bank account
     * @param amount The amount of money the user wants to withdraw (Integer)
     */
    public void withdraw ( int amount)
    {
        if ( amount != 0)
        {
            balance = balance - amount  ;
            previousTransaction = -amount;
        }
    }

    /**
     * Method that returns the last banking operation performed by the user
     */
    public void getPreviousTransaction()
    {
        if (previousTransaction > 0)
        {
            System.out.println(" Deposited :" + previousTransaction);
        }
        else  if(previousTransaction < 0)
        {
            System.out.println("Withdrawn :" + Math.abs(previousTransaction));
        }
        else
        {
            System.out.println(" NO Transaction ocurred!!");
        }
    }

    /**
     * Method that shows the menu of the banking application
     */
    public void showMenu()
    {
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome :"+customerName);
        System.out.println("Your ID :"+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do
        {
            System.out.println("=========================================================================================");
            System.out.println("Enter an option");
            System.out.println("=========================================================================================");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option)
            {
                case 'A':
                    System.out.println("-----------------------------------");
                    System.out.println("Balnce:"+balance);
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter amount to deposit:");
                    System.out.println("-----------------------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter amount to withdraw:");
                    System.out.println("-----------------------------------");
                    amount = sc.nextInt();
                    withdraw(amount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("***********************************");
                    break;

                default:
                    System.out.println("Invalid option!! Please enter again");
                    break;

            }

        }
        while ( option != 'E');
        System.out.println("Thank for using our service");

    }
}
