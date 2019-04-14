package inheritance;

import java.util.Scanner;

public class vehicleController {

    Scanner myScanner = new Scanner(System.in);

    bus b = new bus((short) 5, (short) 4);

    public static void main(String[] args) {
        vehicleController vc = new vehicleController();
        vc.menu();
    }


    private void menu() {
        System.out.println("Which vehicle would you like to create today?");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");
        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                createCar();
                break;

            case 2:
                createBus();

            case 3:
                createTruck();

            case 4:
                createTrain();

            case 5:
                createMotorbike();

            case 6:
                createBicycle();


        }
    }


    private void createCar() {
        car c = new car((short) 5, (short) 4);
        c.accelerate();
        c.steer("Right");
        c.brake();
        menu();
    }

    private void createBus() {
        bus b = new bus((short) 5, (short) 4);
        b.accelerate();
        b.steer("Right");
        b.brake();
        menu();
    }

    private void createTruck() {
        truck t = new truck((short) 5, (short) 4);
        t.accelerate();
        t.steer("Right");
        t.brake();
        menu();
    }

    private void createTrain() {
        train tn = new train((short) 5, (short) 4);
        tn.accelerate();
        tn.steer("Right");
        tn.brake();
        menu();
    }

    private void createMotorbike() {
        motorbike m = new motorbike((short) 5, (short) 4);
        m.accelerate();
        m.steer("Right");
        m.brake();
        menu();
    }


    private void createBicycle() {
        bicycle bc = new bicycle((short) 5, (short) 4);
        bc.accelerate();
        bc.steer("Right");
        bc.brake();
        menu();

    }


//    private void accelerate() {
//        System.out.println("Which vehicle would you like to accelerate?");
//        String speed = myScanner.nextLine();
//        System.out.println("how much faster would you like to go?");
//        short depositAmount = Short.parseShort(myScanner.nextLine());
//
//        if (speed.equalsIgnoreCase("Car")) {
//            cAccerlerate = depositAmount;
//        } else if (speed.equalsIgnoreCase("bus")) {
//             bAccelerate += depositAmount;
//        } else if (speed.equalsIgnoreCase("train")) {
//            tnAccelerate += depositAmount;
//        } else if (speed.equalsIgnoreCase("truck")) {
//            tAcceerlate += depositAmount;
//        } else if (speed.equalsIgnoreCase("bicycle")) {
//            bcAccelerate += depositAmount;
//        } else if (speed.equalsIgnoreCase("motorbike")) {
//            mbAccelerate += depositAmount;
//        } else {
//            System.out.println("Sorry we don't have that vehicle, please try again");
//        }

}