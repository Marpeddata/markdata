public class Main {

    public static void main(String[]args){
        GasolineCar ford = new GasolineCar("50D20D","Ford","GT",2, 8);
        DieselCar renult = new DieselCar("203DL23","Renult","Megan",5,45);
        ElectricCar tesla = new ElectricCar("89S8GF","Tesla","S",4,30,20,100);

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(ford);
        fleetOfCars.addCar(renult);
        fleetOfCars.addCar(tesla);

        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());
        System.out.println(fleetOfCars);
    }

}
