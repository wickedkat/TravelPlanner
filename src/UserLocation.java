import java.util.*;

public class UserLocation {
    private int[] coordinates;
    private List<int[]> locationHistory = new ArrayList<>();

    public UserLocation(int coordX, int coordY) {
        this.coordinates = new int[]{coordX, coordY};
        locationHistory.add(coordinates);
    }

    public void setCoordinates(int coordX, int coordY) {
        this.coordinates = new int[]{coordX, coordY};
        locationHistory.add(coordinates);
    }

    public List<int[]> getLocationHistory() {
        return locationHistory;
    }

    public String getClosestCity(Planner planner) {
        List<City> allCities = planner.getCities();
        HashMap<String, Double> distancefromUser = new HashMap<String, Double>();
        String closestCity = "";
        for (City city : allCities
        ) {
            distancefromUser.put(city.getName(), getDistanceFromPlace(city));
        }
        Double min = Collections.min(distancefromUser.values());
        for (Map.Entry<String, Double> entry : distancefromUser.entrySet()) {
            if (entry.getValue().equals(min)) {
                System.out.println("The closest city is " + entry.getKey() + " at " + min + " km");
                closestCity = entry.getKey();
                break;

            }
        }
        return closestCity;
    }

    public double getDistanceFromPlace(Place place) {
        double distance = Math.sqrt((place.getCoordY() - this.getCoordinates()[1]) * (place.getCoordY() - this.getCoordinates()[1])
                + (place.getCoordX() - this.getCoordinates()[0]) * (place.getCoordX() - this.getCoordinates()[0]));
        return distance;
    }

    public int[] getCoordinates() {
        return coordinates;
    }
}
