import java.util.ArrayList;
import java.util.Arrays;

public class ListOfUnits {
    ArrayList<AbUnit> unitData = new ArrayList<>();
    ArrayList<AbUnit> hqData = new ArrayList<>();
    ArrayList<AbUnit> troopData = new ArrayList<>();
    ArrayList<AbUnit> eliteData = new ArrayList<>();
    ArrayList<AbUnit> fastattData = new ArrayList<>();
    ArrayList<AbUnit> heavyData = new ArrayList<>();
    ArrayList<AbUnit> flyerData = new ArrayList<>();
    ArrayList<AbUnit> transData = new ArrayList<>();


    public ListOfUnits(ArrayList<String> data) {
        createUnit(data);

    }

    public void createUnit(ArrayList<String> data) {
        for (int i = 0; i < data.size(); i++) {
            String tmpdata[] = data.get(i).split(",");

            String unitName = tmpdata[0];



            String type = tmpdata[4];
            int minimumUnitSize = Integer.parseInt(tmpdata[1]);
            int maximumUnitSize = Integer.parseInt(tmpdata[2]);
            int modelCost = Integer.parseInt(tmpdata[3]);

            AbUnit abUnit = null;

            switch (type) {
                case "hq":
                    abUnit = new HQ(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    hqData.add(abUnit);
                    break;
                case "troops":
                    abUnit = new Troops(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    troopData.add(abUnit);
                    break;
                case "elites":
                    abUnit = new Elites(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    eliteData.add(abUnit);
                    break;
                case "fastattack":
                    abUnit = new FastAttacks(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    fastattData.add(abUnit);
                    break;
                case "heavysupport":
                    abUnit = new HeavySupport(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    heavyData.add(abUnit);
                    break;
                case "flyer":
                    abUnit = new Flyer(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    flyerData.add(abUnit);
                    break;
                case "dedicatedtransport":
                    abUnit = new DedicatedTransport(unitName, type, minimumUnitSize, maximumUnitSize, modelCost);
                    transData.add(abUnit);
                    break;


            }
            unitData.add(abUnit);





        }






    }




    public void showlist(){
        for(AbUnit e: unitData){
            System.out.println(e);
        }

    }


}