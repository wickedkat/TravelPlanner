import java.util.ArrayList;
import java.util.List;

public class City extends Place {

    public City (int X, int Y, String name, Planner planner) throws Exception{
        super(X, Y, name, planner);

    }

    public City( String name, Planner planner) throws Exception {
        super(planner.getMaxCoord(), name, planner);
    }


    public List<Place> getLandmarksIn50Km(List<Landmark> landmarks) {
        System.out.println("The landmarks withing 50 km to " + this.getName());
        List<Place> listOfLandmarksWithin50Km = new ArrayList<>();
        int Xcity = this.getCoordX();
        int Ycity = this.getCoordY();
        for (Landmark landmark : landmarks) {
            int XPlace = landmark.getCoordX();
            int YPlace = landmark.getCoordY();
            double distance = Math.sqrt((YPlace - Ycity) * (YPlace - Ycity) + (XPlace - Xcity) * (XPlace - Xcity));
            if (-50 <= distance && distance <= 50) {
                listOfLandmarksWithin50Km.add(landmark);
            }
        }
        if (listOfLandmarksWithin50Km.isEmpty()) {
            System.out.println("No landmarks within 50km");
        }
        return listOfLandmarksWithin50Km;
    }
}
