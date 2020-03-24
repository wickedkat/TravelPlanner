public class Main {

    public static void main(String[] args) throws Exception {
        Planner planner = new Planner(100, 20,20);
        View printingMachine = new View();
        planner.addLandmark(new Landmark("Blue Mountain", 10, planner));
        planner.addLandmark(new Landmark("Green Lake", 15, planner));
        planner.addLandmark(new Landmark("Yellow Brick Road", 0, planner));

        planner.addCity(new City("Shiz", planner));
        planner.addCity(new City("Kiamo Ko", planner));
        planner.addCity(new City("Emerald City", planner));

        for (Landmark landmark : planner.getLandmarks()
             ) {printingMachine.printLocation(landmark);

        }

        for (City city :planner.getCities()){
            printingMachine.printLocation(city);
        }

        UserLocation userLocation = planner.getUserLocation();
        userLocation.setCoordinates(15,90);
        printingMachine.printCurrentUserLocation(userLocation);
        userLocation.getClosestCity(planner);
        userLocation.setCoordinates(45,80);
        printingMachine.printCurrentUserLocation(userLocation);
        userLocation.getClosestCity(planner);

        printingMachine.printUserLocationsHistory(userLocation.getLocationHistory());

        printingMachine.printNameFromList(planner.getCities().get(0).getLandmarksIn50Km(planner.getLandmarks()));




    }
}
