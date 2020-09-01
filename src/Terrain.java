public enum Terrain {

    MOUNTAIN ("M"),
    HILL ("H"),
    PLAIN ("P"),
    FORREST ("F"),
    COAST ("C"),
    OCEAN ("O");

    private final String text;
    Terrain( String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }



}
