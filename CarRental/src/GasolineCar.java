public class GasolineCar extends AFuelCar{

    GasolineCar(String licensePlate, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(licensePlate, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            return 330;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20){
            return 1050;
        }
        if(kmPrLitre >= 10 && kmPrLitre <= 15){
            return 2340;
        }
        if(kmPrLitre >= 5 && kmPrLitre <= 10){
            return 5500;
        }
        if(kmPrLitre > 0 && kmPrLitre <=5){
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + "Km pr Litre: " + kmPrLitre + "\n" + "FuelType: " + getFuelType() + "\n";
    }

}
