import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLocationTest {
    Planner planner = new Planner(100, 10,10);
    City city = new City(20,20,"TestCity", planner);
    City city2 = new City(30,20,"TestCity2", planner);
    Landmark landmark = new Landmark (10,10,"TestLandmark",10, planner);
    Landmark landmark2 = new Landmark (100,100,"TestLand2",10, planner);
    UserLocation user = planner.getUserLocation();



    UserLocationTest() throws Exception {
    }

    @Test
    void getClosestCity() throws Exception {
        planner.addCity(city);
        planner.addCity(city2);
        assertSame("TestCity",user.getClosestCity(planner));
    }

    @Test
    void getCoordinates() {
        assertArrayEquals(new int[]{10, 10}, user.getCoordinates() );
    }
}