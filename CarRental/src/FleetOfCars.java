import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();


    void addCar(Car car){

        fleet.add(car);
    }


    int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for(Car c: fleet){
          sum += c.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append("Fleet of Cars:\n");
        res.append("**********************************************");
        for(Car car : fleet){
            res.append(car.toString());
            res.append("**********************************************");
        }
        return res.toString();

        //return fleet.toString();
    }

}
