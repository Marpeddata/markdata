import java.util.List;

public class Main {
    private static FileIO fileIO = new FileIO();
    private static ListOfUnits listOfUnits = new ListOfUnits(fileIO.readUnitData());

    public static void main(String[] args) {

        //listOfUnits.showlist();
        //System.out.println(listOfUnits.heavyData);
        System.out.println(listOfUnits.heavyData.get(4));
    }
}
