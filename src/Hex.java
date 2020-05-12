import java.util.ArrayList;

public class Hex {

    private ArrayList<Terrain> terrain;
    private Hex[] adjacent;
    private ArrayList<Monster> monsters = new ArrayList<>();

    public Hex(ArrayList<Terrain> terrain){
        this.terrain = terrain;
    }

    public void setAdjacent(Hex[] adjacent){
        this.adjacent = adjacent;
    }

    public Hex getAdjacent(int val) {
        try {
            return this.adjacent[val];
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("Error: Please enter a number between 0 and 5 for corresponding adjacent hex");
            return null;
        }
    }

    public Hex[] getAdjacent(){
        return this.adjacent;
    }

    public boolean hasTerrain(Terrain terrain){
        return this.terrain.contains(terrain);
    }

    public boolean hasMonster(Monster monster){
        return this.monsters.contains(monster);
    }

    public boolean addMonster(Monster monster){
        if (hasMonster(monster)) {

            return false;
        }
        this.monsters.add(monster);
        return true;
    }


}
