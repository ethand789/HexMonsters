import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        //get text file to generate map
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the text file address to generate a map from (Leave blank to use default): ");
        String address = in.nextLine();
        if(address.equals("")) {
            address = "src\\Default";
        }

        ArrayList<ArrayList<Hex>> map = initialize(address);
    }

    private static ArrayList<ArrayList<Hex>> initialize(String address){
        /**
         * input: the address of a text file used to generate a map
         * output: a 2d ArrayList of hexes representing a hex map
         */
        ArrayList<ArrayList<Hex>> result = new ArrayList<>();
        ArrayList<Hex> row = new ArrayList<>();

        try {
            //open text file
            File file = new File(address);

            //read text file and generate hex map
            Scanner read = new Scanner(file);

            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
                String[] hexes = line.split(" ");
                for(String hex:hexes){

                }

                //TODO turn Strings into hex map

            }
        }catch(FileNotFoundException exception){
            System.out.println("File was not found. Please try again.");
        }catch(Exception exception){
            System.out.println("something went wrong. please restart and try again.");
        }

        //TODO idiot proof the file reader


        //set all adjacent hexes
        for(int i=0; i< result.size(); i++){
            for(int j=0; j< result.get(i).size(); j++){
                setAdjacent(result,i,j);
            }
        }
        return result;
    }

    private static void setAdjacent(ArrayList<ArrayList<Hex>> map, int column, int num){
        Hex[] result = new Hex[6];
        boolean even = column%2 == 0;
        //top
        try{
            result[0] = map.get(column).get(num-1);
        }catch(Exception exception){
            result[0] = null;
        }
        //top right
        try{
            if(even){
                result[1] = map.get(column+1).get(num-1);
            }else{
                result[1] = map.get(column+1).get(num);
            }
        }catch(Exception exception){
            result[1] = null;
        }
        //bottom right
        try{
            if(even){
                result[2] = map.get(column+1).get(num);
            }else{
                result[2] = map.get(column+1).get(num+1);
            }
        }catch(Exception exception){
            result[2] = null;
        }
        //bottom
        try{
            result[3] = map.get(column).get(num +1);
        }catch(Exception exception){
            result[3] = null;
        }
        // bottom left
        try{
            if(even){
                result[4] = map.get(column-1).get(num);
            }else{
                result[4] = map.get(column-1).get(num+1);
            }
        }catch(Exception exception){
            result[4] = null;
        }
        // top left
        try{
            if(even){
                result[5] = map.get(column-1).get(num-1);
            }else{
                result[5] = map.get(column-1).get(num);
            }
        }catch(Exception exception){
            result[5] = null;
        }

        map.get(column).get(num).setAdjacent(result);
    }
}
