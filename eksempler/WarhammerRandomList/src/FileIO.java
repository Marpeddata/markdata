
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    ArrayList<String> readUnitData(){
        File file = new File("src/deathguard.csv");
        ArrayList<String> data = new ArrayList<>();

        try{
            Scanner scan = new Scanner(file);

            String header = scan.nextLine();

            while(scan.hasNextLine()) {
                data.add(scan.nextLine());

            }
        } catch (FileNotFoundException e){
            data = null;
        }
        return data;
    }

}
