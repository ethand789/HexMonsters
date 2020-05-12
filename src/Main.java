import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        //get text file to generate map
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the text file address to generate a map from (Leave blank to use default): \n");
        String address = in.nextLine();
        if(address.equals("")) {
            address = "Default.txt";
        }

        ArrayList<ArrayList<Hex>> hexes = initialize(address);
    }

    private static ArrayList<ArrayList<Hex>> initialize(String address){
        /**
         * input: the address of a text file used to generate a map
         * output: a 2d ArrayList of hexes representing a map
         */
        ArrayList<ArrayList<Hex>> result = new ArrayList<>();
        ArrayList<Hex> row = new ArrayList<>();
        Scanner input = new Scanner(address);

        
    }
}
