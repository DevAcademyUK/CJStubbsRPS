package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session {
    private User Jeff = new User();

    Scanner myScanner = new Scanner(System.in);
    List<EmployeeID> employees = new ArrayList<EmployeeID>();


    public static void main(String[] args) {
        Session emp = new Session();
        emp.logon();
    }

    private void logon() {
        System.out.println("What is your username?");
        String userId = myScanner.nextLine();
        //this line is getting the user input and assigning it
        System.out.println("Please enter your 4 digit pin");
        String pin = myScanner.nextLine();
        if (userId.equals(Jeff.userId) && pin.equals(Jeff.pinId)) {
            init();
        } else {
            System.out.println("Invalid details, please try again.");
            logon();
        }

    }

    public void init() {
        employees.add(new EmployeeID(1, "Mr", "Connor", "Stubbs", "01/04/1998",
                "46 Arlington Road", "Bristol", "Avon", "BS4 4AJ", "07545669201",
                "Connor.stubbs12@hotmail.co.uk", "developer", "10/05/2019"));
        menu();

    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the Intranet");
        System.out.println("Select an option from the list below:");
        System.out.println("1 - Search for a Employee");
        System.out.println("2 - Add employee details");
//        System.out.println("3 - ");
        int choice = Integer.parseInt(myScanner.nextLine());


        switch (choice) {


            case 1:

                searchEmployee();
                break;

            case 2:

                addEmployee();
                break;

//            case 3:
//
//                searchAuthor();
//                break;

            default:
                System.out.println("Invalid input provided, please try again");

                menu();


        }

    }

    private void addEmployee() {
        //Method to add a new employee to the array list we've already completed
        EmployeeID newEmployee = null;
        this.employees.add(newEmployee);
        //this returns a list of employees


        //Method  below adds a new employee based on user input
        System.out.println("Please input title");
        String title = myScanner.nextLine();
        System.out.println("Please input forename");
        String forename = myScanner.nextLine();
        System.out.println("Please input surname");
        String surname = myScanner.nextLine();
        System.out.println("Please input date of birth");
        String DOB = myScanner.nextLine();
        System.out.println("Please input address");
        String address = myScanner.nextLine();
        System.out.println("Please input town");
        String town = myScanner.nextLine();
        System.out.println("Please input county");
        String county = myScanner.nextLine();
        System.out.println("Please input Post Code");
        String postCode = myScanner.nextLine();
        System.out.println("Please input contact number");
        String contactNumber = myScanner.nextLine();
        System.out.println("Please input email address");
        String emailAddress = myScanner.nextLine();
        System.out.println("Please input employee ID");
        int ID = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please input position");
        String position = myScanner.nextLine();
        System.out.println("Please input start date");
        String startDate = myScanner.nextLine();
        newEmployee = new EmployeeID(ID, title, forename, surname, DOB, address, town, county,
                postCode, contactNumber, emailAddress, position, startDate);
        this.employees.add(newEmployee);
//below returns you to the menu so that the program still runs.

        System.out.println("You will now be returned to the Main Menu.");
        menu();
    }


    // this method below will search for an employee and bring ut their details
    // user will enter the employee ID which will then scan the database using an array list created previously
    // it checked employee list of employee
    private void searchEmployee() {
        System.out.println("Please enter an Employees Surname");
        String employee = myScanner.nextLine();
        for (EmployeeID eID : employees) {
            if (eID.eSname.equalsIgnoreCase(employee)) {

                String newLine = System.getProperty("line.separator");

                System.out.println("Employee Details: " + eID.eTitle + " " + eID.eName + " " + eID.eSname + newLine +
                        "Date of birth: " + eID.eDOB + newLine +
                        "Address: " + eID.eAddress + newLine +
                        "Town :" + eID.eTown + newLine +
                        "County :" + eID.eCounty + newLine +
                        "Postcode : " + eID.ePostcode + newLine +
                        "Phone number: " + eID.eCnumber + newLine +
                        "Email: " + eID.eEmail + newLine +
                        "Employee ID: " + eID + newLine +
                        "Position :" + eID.ePosition + newLine +
                        "Start Date: " + eID.eStartDate
                        + newLine + "You will now be returned to the menu..." + newLine);

                menu();
            }

            System.out.println("Sorry that isn't a current Employee please try again.");
            menu();
        }
    }


}



