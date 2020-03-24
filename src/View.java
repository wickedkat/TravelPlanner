import java.util.Arrays;
import java.util.List;

public class View {
    public void printObject(Object object){
        System.out.println(object);
    }

    public void printCurrentUserLocation(UserLocation userLocation){
        System.out.println("User at " + userLocation.getCoordinates()[0] + "x and " + userLocation.getCoordinates()[1] + "y");
    }

    public void printPlaceName(Place place){
        System.out.println(place.getName());
    }

    public void printLocation(Place place){
        System.out.println(place.getName() + " at coord X: " + place.getCoordX() + ", coord Y :" + place.getCoordY());
    }

    public void printUserLocationsHistory(List<int[]> locationHistory){
        System.out.println("User location history");
        for (int[] location: locationHistory
             ) {
            System.out.println(Arrays.toString(location));

        }

    }

    public void printNameFromList(List<Place> listPlaces){
        for (Place place:listPlaces
             ) {
            System.out.println(place.getName());

        }

    }
}
