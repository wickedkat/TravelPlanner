import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LandmarkTest {
    Planner planner = new Planner(100, 10,10);
    Landmark landmark = new Landmark("Dark Sea", 30, planner);

    LandmarkTest() throws Exception {
    }

    @Test
    void getEntranceFee() {
        assertEquals(30, landmark.getEntranceFee());
    }

    @Test
    void setEntranceFee() {
        landmark.setEntranceFee(5);
        assertEquals(5,landmark.getEntranceFee());
    }
}