package Banking;

import java.util.Scanner;

public class Bank {
    public static Scanner myScanner= new Scanner (System.in);
    String userId;
    String pin;


    /*
    log in
      check balance
      select account
      joint, savings current
      would you like to withdraw transfer or log out?
       */


    public static void main(String[] args) {
        Bank create = new Bank();
        create.getAccountDetails();
    }

    boolean checkAccount(String id, String pin){
        return true ;
    }

    public void getAccountDetails() {


        System.out.println("What is your username?");
        String userId = myScanner.nextLine();
        System.out.println("Please enter your 4 digit pin");
        String pin = myScanner.nextLine();
        if (checkAccount(userId,pin))
        {
            user Jeff= new user() ;
         Jeff.getAccountType();
        }


    }


}








