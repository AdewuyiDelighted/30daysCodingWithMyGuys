import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperatureTest {
    @Test
    public void testThatWhenTheNumberOfDaysYouHaveToWaitAfterTheLatestDayToGetAWarmerTemperature() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] output = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(output, DailyTemperature.checkDailyTemperature(temperatures));

    }

}