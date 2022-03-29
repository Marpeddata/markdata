public abstract class ACar implements Car {

    private String licensePlate;
    private String make;
    private String model;
    private int numberOfDoors;


    ACar(String licensePlate,String make,String model,int numberOfDoors){
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public int getNumberOfDoors() {

        return numberOfDoors;
    }

    @Override
    public String getMake() {

        return this.make;
    }

    @Override
    public String getModel() {

        return this.model;
    }

    @Override
    public String getRegistrationNumber() {

        return this.licensePlate;
    }

    @Override
    public String toString(){
        return "\n" + "Model: "+ model + "\n" + "Make: " + make + "\n" + "Number of Doors: " + numberOfDoors + "\n" + "Licenseplate: " + licensePlate;
    }

}
