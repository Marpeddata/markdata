public class Main {

    public static void main(String[]args){
        GasolineCar ford = new GasolineCar("50D20D","Ford","GT",2, 8);
        DieselCar renault = new DieselCar("203DL23","Reanult","Megan",5,45,false);
        ElectricCar tesla = new ElectricCar("89S8GF","Tesla","S",4,110,575);

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(ford);
        fleetOfCars.addCar(renault);
        fleetOfCars.addCar(tesla);

        //System.out.println(tesla.getWhPrKm());

        System.out.println("Total registrationfee of Fleet: "+ fleetOfCars.getTotalRegistrationFeeForFleet() + " Kr");
        System.out.println(fleetOfCars);
    }

}
