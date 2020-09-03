import java.util.ArrayList;

public class Monster {
    private String name;
    private int reach;
    private int power;
    private Hex lair;


    public Monster(String name, int reach, int power, Hex hex){
        this.name = name;
        this.reach = reach;
        this.power = power;
        this.lair = hex;

        this.moveIn(hex);
    }

    private boolean moveIn(Hex hex){
        /**
         * input: the hex containing the monsters lair
         * output: a boolean value indicating if the monster successfully moved in
         * add the monster to monster list for all hexes within it's reach.
         */
        ArrayList<Hex> temp = new ArrayList<>();
        temp.add(hex);
        for(int i = 0; i<this.reach; i++){
            for(Hex adjacentHex: temp){
                adjacentHex.addMonster(this);
                for(Hex adjacents: adjacentHex.getAdjacent()){
                    temp.add(adjacents);
                }
                temp.remove(adjacentHex);
            }
        }
        return true;
    }

    //TODO create Monster and children
}

