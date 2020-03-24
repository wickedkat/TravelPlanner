public class Landmark extends Place {
    private int entranceFee;

    public Landmark(int X, int Y, String name, int entranceFee, Planner planner) throws Exception {
        super(X, Y, name, planner);
        setEntranceFee(entranceFee);

    }

    public Landmark(String name, int entranceFee, Planner planner) throws Exception {
        super(planner.getMaxCoord(), name, planner );
        setEntranceFee(entranceFee);
    }


    public int getEntranceFee() {
        return entranceFee;
    }


    public void setEntranceFee(int entranceFee) {
        if(entranceFee <0){
            this.entranceFee = -(entranceFee);
        }
        this.entranceFee = entranceFee;
    }


}
