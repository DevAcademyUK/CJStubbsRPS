package Banking;

import java.util.Scanner;

public class banksessiondemo {
    double amount;
    private User Jeff = new User();
    Scanner myScanner = new Scanner(System.in);

    /*private is defining the access modifier so where this class can be accessed throughout it's current contatiner
User Jeff is a variable being pulled through from the Account class we have created. this is creating Jeff as a client
and then the Scanner is taking the users input
     */
    public static void main(String[] args) {
        banksessiondemo myBank = new banksessiondemo();
        myBank.logon();
   /* this is one of our methods which is explaining to the system that banksession demo(our class) and simplifying its
   name to myBank which is equal to a new banksession demo, furthermore myBank.logon is

   */
    }


    private void logon() {
        System.out.println("What is your username?");
        String userId = myScanner.nextLine();
        //this line is getting the user input and assigning it
        System.out.println("Please enter your 4 digit pin");
        String pin = myScanner.nextLine();
        if (userId.equals(Jeff.userId) && pin.equals(Jeff.pinId)) {
            getInput();
        } else {
            System.out.println("Invalid details");
        }

    }

    public void getInput() {
        System.out.println("What account would you like to access today?\n"
                + "options you currently have are joint,current and savings or exit");

        String input = myScanner.nextLine().toLowerCase();
        if (input.equals("exit")) {
            //break;
        }
        switch (input) {
            case "current":
                accountFunction(Jeff.current);
                break;
            case "savings":
                accountFunction(Jeff.savings);

                break;
            case "joint":
                accountFunction(Jeff.joint);
                break;

            default:
                System.out.println("invalid command, please try again.");

        }
    }

    void accountFunction(Account acc) {
        String accName = "";
        if (acc == Jeff.current) {
            accName = "Current";
        } else if (acc == Jeff.savings) {
            accName = "Savings";
        } else if (acc == Jeff.joint) {
            accName = "Joint";
        }
        System.out.println(accName + " Account balance: £" + acc.balance);

        getTransactionType();
    }


    void getTransactionType() {
        System.out.println("What would you like to do with your account?" +
                " Your options are: Withdraw, Deposit or Transfer?");
        String transaction = myScanner.nextLine();

        if (transaction.equalsIgnoreCase("deposit")) {

            deposit(amount);
        } else if (transaction.equalsIgnoreCase("withdraw")) {

            withdraw(amount);
        } else if (transaction.equalsIgnoreCase("transfer")) {

            transfer(amount);
        }
    }

    private double deposit(double amount) {
        System.out.println("How much would you like to deposit?");
        double money = myScanner.nextDouble();
        Account acc = new Account();
        acc.balance = acc.balance + money;
        System.out.println("Your new balance is: £" + acc.balance);
        System.out.println("What would you like to do next? Log out or continue with another Transaction?");
        String answerlog = myScanner.nextLine();
        if (answerlog.equalsIgnoreCase("logout")) {
            logon();
        } else if (answerlog.equalsIgnoreCase("another transaction")) {
            getInput();

        } else {
            System.out.println("Invalid input, please choose between 'log out' or 'another transaction'.");



        }
return amount;

    }

    private double withdraw(double amount) {
        System.out.println("How much would you like to Withdraw?");
        double money = myScanner.nextDouble();
        Account acc = new Account();
        acc.balance = acc.balance - money;
        System.out.println("Your new balance is: £" + acc.balance);
        return amount;
    }

    private double transfer(double amount) {
        System.out.println("How much would you like to Transfer?");
        double money = myScanner.nextDouble();
        Account source = new Account();
        source.balance = source.balance - amount;
        source.balance = source.balance + amount;
        System.out.println("Your new balance is: £" + source.balance);
        return transfer(amount);
    }
}


