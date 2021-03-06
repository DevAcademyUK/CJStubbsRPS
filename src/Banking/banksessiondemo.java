package Banking;

import java.util.Scanner;

public class banksessiondemo {

    double amount;
    private User Jeff = new User();
    Scanner myScanner = new Scanner(System.in);

    public double cAccBal = 0;
    public double jAccBal = 0;
    public double sAccBal = 0;

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
            System.out.println("Invalid details, please try again.");
            logon();
        }

    }

    public void getInput() {
        System.out.println("What account would you like to access today?\n"
                + "options you currently have are joint,current and savings or make a transfer or exit");

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

            case "transfer":
                transfer();

            default:
                System.out.println("invalid command, please try again.");
                getInput();
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
                " Your options are: Withdraw or Deposit");
        String transaction = myScanner.nextLine();

        if (transaction.equalsIgnoreCase("deposit")) {

            deposit();


        } else if (transaction.equalsIgnoreCase("withdraw")) {

            withdraw();
        }
    }

    private void deposit() {
        System.out.println("How much would you like to deposit?");
        double money = Double.parseDouble(myScanner.nextLine());
        Account acc = new Account();
        acc.balance = acc.balance + money;
        System.out.println("Your new balance is: £" + acc.balance);

        nextStage();
    }

    private void withdraw() {
        System.out.println("How much would you like to Withdraw?");
        double money = Double.parseDouble(myScanner.nextLine());
        Account acc = new Account();
        acc.balance = acc.balance - money;
        System.out.println("Your new balance is: £" + acc.balance);

        nextStage();
    }


    private void transfer() {
        System.out.println("Which account would you like to transfer funds from?");
        String source = myScanner.nextLine();
        System.out.println("Which account would you like to transfer funds to?");
        String destination = myScanner.nextLine();
        System.out.println("How much would you like to transfer?");
        double amount = Double.parseDouble(myScanner.nextLine());

        if (source.equalsIgnoreCase("current")) {
            if (cAccBal >= amount) {
                if (destination.equalsIgnoreCase("Joint")) {
                    jAccBal += amount;
                    cAccBal -= amount;
                    System.out.println(cAccBal);
                } else if (destination.equalsIgnoreCase("Savings")) {
                    sAccBal += amount;
                    cAccBal -= amount;

                } else {
                    System.out.println("Invalid Destination account");

                }
            }
            else if (source.equalsIgnoreCase("Joint")) {
                if (jAccBal >= amount) {
                    if (destination.equalsIgnoreCase("Current")) {
                        cAccBal += amount;
                        jAccBal -= amount;
                    } else if (destination.equalsIgnoreCase("Savings")) {
                        sAccBal += amount;
                        jAccBal -= amount;
                    } else {
                        System.out.println("Invalid destination account");
                    }
                }
            } else if (source.equalsIgnoreCase("Savings")) {
                if (sAccBal >= amount) {
                    if (destination.equalsIgnoreCase("Current")) {
                        cAccBal += amount;
                        sAccBal -= amount;
                    } else if (destination.equalsIgnoreCase("Joint")) {
                        jAccBal += amount;
                        sAccBal -= amount;
                    } else {
                        System.out.println("Invalid destination account");
                    }
                }
            } else {
                System.out.println("Invalid source account");
            }
            nextStage();
        }

    }


    private void nextStage() {
        System.out.println("What would you like to do next? Log out or continue with another Transaction?");
        String answerLog = myScanner.nextLine();

        if (answerLog.equalsIgnoreCase("log out")) {
            logon();

        } else if (answerLog.equalsIgnoreCase("another transaction")) {
            getInput();

        } else {
            System.out.println("Invalid input, please choose between 'log out' or 'another transaction'.");
            nextStage();
        }
    }


}






