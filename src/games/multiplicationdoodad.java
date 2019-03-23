package games;

import java.util.Scanner;

public class multiplicationdoodad {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        multiplicationdoodad mdd = new multiplicationdoodad();
        mdd.getValues();

    }

    private void getValues() {
        System.out.println("What number would you like the multiplication tables for?");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the maximum multiplication you wish to calculate?");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        calculate(number, multiplier);
//above is passing number and multiplier to the class below.
    }
/*if it isn't prvded it wont elt you run it it defines a contract if you want to run me yoju have to rpvide me with these two



   */
private void calculate(int number, int multiplier) {
        for (int i = 1; i <= multiplier; i++) {
         //for defines its a for loop as long as i is less than 17 do this and after each loop and keep going until 17 as it isnt big enough then goes tot he enxt stage then enters loop.
            System.out.println(i + " times " + number + " is " + i * number);
        }
    }
}