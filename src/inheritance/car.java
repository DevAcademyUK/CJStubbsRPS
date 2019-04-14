package inheritance;

public class car extends steeringWheel{


        public car(short numberOfSeats,short numberOfWheels){
            this.numberOfSeats = numberOfSeats;
            this.numberOfWheels = numberOfWheels;
        }

        private void createCar() {
            car c  = new car ((short)5, (short) 4);

        }
}
