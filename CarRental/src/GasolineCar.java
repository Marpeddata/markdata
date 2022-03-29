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
        if(getKmPrLitre() >= 20 && getKmPrLitre() <= 50){
            return 330;
        }
        if(getKmPrLitre() >= 15 && getKmPrLitre() <= 20){
            return 1050;
        }
        if(getKmPrLitre() >= 10 && getKmPrLitre() <= 15){
            return 2340;
        }
        if(getKmPrLitre() >= 5 && getKmPrLitre() <= 10){
            return 5500;
        }
        if(getKmPrLitre() > 0 && getKmPrLitre() <=5){
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Km pr Litre: " + getKmPrLitre() + "\n" + "FuelType: " + getFuelType() + "\n";
    }

}
