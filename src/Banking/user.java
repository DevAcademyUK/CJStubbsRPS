package Banking;

import static Banking.Bank.myScanner;

public class user {

    Accounts current = new Accounts();
    Accounts savings = new Accounts();
    Accounts joint = new Accounts();

    void accountFunction(Accounts acc) {
        String accName = "";
        if (acc == this.current) {
            accName = "Current";
        } else if (acc == this.savings) {
            accName = "Savings";
        } else if (acc == this.joint) {
            accName = "Joint";
        }
        System.out.println(accName + " Account balance: £" + acc.balance);

        System.out.println("What would you like to do with your account?" +
                " Your options are: Withdraw, Deposit or Transfer?");


    }


    void getAccountType() {
        System.out.println("What account would you like to access today?\n"
                + "options you currently have are joint,current and savings");
        String account = myScanner.nextLine().toLowerCase();


        if (account.equals("savings")) {
            this.accountFunction(this.savings);
        } else if (account.equals("joint")) {
            this.accountFunction(this.joint);
        } else if (account.equals("current")) {
            this.accountFunction(this.current);
        } else {
            System.out.println("You unfortunately do not have a " + account +
                    "account. please call us on 0117 971 3349 for customer service");
        }


    }


}
