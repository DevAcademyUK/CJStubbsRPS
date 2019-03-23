package switches;

import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        parking p = new parking();
        p.getInput();
    }

    private void getInput() {
        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        System.out.println("How long  will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("what position do you hold within the college? (staff/student/visitor)");
        String position = myScanner.nextLine();
        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position) {

        int cost;
        int hourlyrate;
        int multiplier;

        switch (position) {
            case "Staff":
                multiplier = 2;
                break;

            case "Student":
                multiplier = 1;
                break;

            case "visitor":
                multiplier = 3;
                break;


            default:
                System.out.println("Invalid input for position, please retry");
                getInput();

        }
            switch (day) {
                case "Monday":
                    hourlyrate = 2;
                    break;

                case "Tuesday":
                    hourlyrate = 2;
                    break;

                case "Wednesday":
                    hourlyrate = 3;
                    break;

                case "Thursday":
                    hourlyrate = 2;
                    break;

                case "Friday":
                    hourlyrate = 3;
                    break;

                case "Saturday":
                    hourlyrate = 4;
                    break;

                case "Sunday":
                    hourlyrate = 5;
                    break;



            }


        }


    }

