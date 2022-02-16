import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpeningHoursTest {

    @Test
    void isOpenOn() {
        OpeningHours openingHours = new OpeningHours();
        assertTrue(openingHours.isOpenOn("wednesday"));
    }

    @Test
    void nextOpeningDate() {
        OpeningHours openingHours = new OpeningHours();
        assertEquals(openingHours.nextOpeningDate("wednesday"), "fridayMorning");
    }
}
