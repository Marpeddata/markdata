public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String licensePlate, String make, String model, int numberOfDoors,int batteryCapacity,int maxRange){
        super(licensePlate, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    int getBatteryCapacityKWh(){

        return batteryCapacity;
    }

    int getMaxRangeKm(){

        return maxRange;
    }

    int getWhPrKm(){

        return (getBatteryCapacityKWh() * 1000) / getMaxRangeKm();
    }

    @Override
    public int getRegistrationFee() {

        double kmPrLitre = (100/(getWhPrKm()/91.25));
        //System.out.println(kmPrLitre);

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
        return super.toString() + "\n" + "Max Range pr Charge: " + maxRange + "\n" + "Wh pr Km: " + getWhPrKm() + "\n";
    }



}
