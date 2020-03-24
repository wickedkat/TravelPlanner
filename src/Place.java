public abstract class Place {
    private final int coordX;
    private final int coordY;
    private String name;

//    first constructor for testing purposes only

    public Place (int X, int Y, String name, Planner planner) throws Exception{
        if(X >planner.getMaxCoord() || Y > planner.getMaxCoord() || X < 0 || Y <0){
        this.coordX = 0;
        this.coordY = 0;
        this.name = name;
        planner.addTakenLocation(coordX,coordY);

    }
        else{this.coordX = X;
            this.coordY = Y;
            this.name = name;
            planner.addTakenLocation(coordX,coordY);

        }
    }

//    marked-up validation only

    public Place(int maxCoord, String name, Planner planner) throws Exception {
        int coordX = getRandomNumber(maxCoord);
        int coordY = getRandomNumber(maxCoord);
        if (planner.getTakenLocations().contains(new int []{coordX,coordY})) {
            this.coordX = coordY;
            this.coordY = coordX;
            planner.addTakenLocation(coordY,coordX);

        }
        else{
            this.coordX = coordX;
            this.coordY = coordY;
            planner.addTakenLocation(coordX,coordY);
        }
        this.name = name;
    }


    public int getRandomNumber(int max){
        return (int) Math.floor((Math.random() * max) + 1);


    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;

    }

    public String getName() {
        return name;
    }
}
