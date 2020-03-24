import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaceTest {
    Planner planner = new Planner(100, 10,10);
    City city = new City( 20,20,"Shiz", planner);
    Landmark landmark = new Landmark(100,100, "Lake", 10, planner );

    PlaceTest() throws Exception {
    }


    @org.junit.jupiter.api.Test
    void getName() throws Exception {
        assertEquals("Shiz", city.getName());
        assertEquals("Lake", landmark.getName());

    }


    @Test
    void getCoordX() {
        assertEquals(20, city.getCoordX());
        assertEquals(100,landmark.getCoordY());
    }

    @Test
    void getCoordY() {
        assertEquals(20, city.getCoordX());
        assertEquals(100,landmark.getCoordY());
    }
}