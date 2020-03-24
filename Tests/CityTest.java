import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    Planner planner = new Planner(100, 10,10);
    City city = new City(20,20,"TestCity", planner);
    Landmark landmark = new Landmark (10,10,"TestLandmark",10, planner);
    Landmark landmark2 = new Landmark (100,100,"TestLand2",10, planner);

    CityTest() throws Exception {
    }

    @Test
    void getLandmarksIn50KmTest() throws Exception {
        planner.addLandmark(landmark);
        planner.addLandmark(landmark2);
        assertSame(landmark, city.getLandmarksIn50Km(planner.getLandmarks()).get(0));
        assertEquals(1, city.getLandmarksIn50Km(planner.getLandmarks()).size());


    }

}