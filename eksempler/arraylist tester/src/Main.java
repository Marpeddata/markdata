import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> newarr = new ArrayList<>();
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};

        arr.add("Red");
        arr.add("blue");
        arr.add("green");
        arr.add("yellow");

        for(int j = 0; j < arr.size(); j++){
            newarr.add(arr.get(j));
        }

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equalsIgnoreCase("red")){
                arr.set(i,"Your mom is fat!");

            }
            if(arr.get(i).charAt(0) = "r"){

            }
        }

        System.out.println(arr);
        System.out.println(newarr);

        }






    }




