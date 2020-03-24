import java.util.ArrayList;
import java.util.List;

public class Planner {
    private List<City> cities;
    private List<Landmark> landmarks;
    private List<int[]> takenLocations = new ArrayList<>();
    private UserLocation userLocation;
    private int maxCoord;

    public Planner(int maxCoord, int userlocX, int userlocY) {
        this.cities = new ArrayList<>();
        this.landmarks = new ArrayList<>();
        userLocation = new UserLocation(userlocX, userlocY);
        this.maxCoord = maxCoord;

    }

    public void addCity(City city) throws Exception {
        cities.add(city);
    }

    public void addLandmark(Landmark landmark) throws Exception {
        landmarks.add(landmark);
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Landmark> getLandmarks() {
        return landmarks;
    }

    public void setUserLocation(int newX, int newY){
        userLocation.setCoordinates(newX, newY);
    }

    public List<int[]> getTakenLocations() {
        return takenLocations;
    }

    public void addTakenLocation(int X, int Y) throws Exception {
        if(takenLocations.contains(new int[] {X,Y})){
            throw new Exception("Random location assigning error");
        }
        takenLocations.add(new int[] {X,Y});

    }

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public int getMaxCoord() {
        return maxCoord;
    }
}


