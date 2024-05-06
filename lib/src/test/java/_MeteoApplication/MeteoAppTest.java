package _MeteoApplication;

import static org.junit.Assert.assertNotNull;

import org.json.simple.JSONObject;
import org.junit.Test;

public class MeteoAppTest {

    @Test
    public void testGetWeatherData() {
        // Arrange
        String cityName = "Rome"; // Città di esempio per il test

        // Act
        JSONObject weatherData = MeteoApp.getWeatherData(cityName);

        // Assert
        assertNotNull("Il JSONObject non dovrebbe essere nullo", weatherData);
    }
    }

