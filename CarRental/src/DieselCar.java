public class DieselCar extends AFuelCar{
    boolean particleFilter;

    DieselCar(String licensePlate, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(licensePlate, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }


    boolean hasParticleFilter(){

        return particleFilter;
    }

    @Override
    String getFuelType() {

        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {

        int sum = 0;

        if(!particleFilter){
            sum += 1000;
        }

        if(getKmPrLitre() >= 20 && getKmPrLitre() <= 50){
            sum += 330+130;
        }
        if(getKmPrLitre() >= 15 && getKmPrLitre() <= 20){
            sum += 1050+1390;
        }
        if(getKmPrLitre() >= 10 && getKmPrLitre() <= 15){
            sum += 2340+1850;
        }
        if(getKmPrLitre() >= 5 && getKmPrLitre() <= 10){
            sum += 5500+2770;
        }
        if(getKmPrLitre() > 0 && getKmPrLitre() <=5){
            sum += 10470+15260;
        }
        return sum;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Km pr Litre: " + getKmPrLitre() + "\n" + "FuelType: " + getFuelType() + "\n" + "Particle Filter: " + hasParticleFilter() + "\n";
    }

}
