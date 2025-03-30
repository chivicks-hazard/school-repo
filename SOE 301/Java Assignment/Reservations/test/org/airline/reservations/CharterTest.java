package org.airline.reservations;
import static org.junit.Assert.*;
import org.junit.Test;

public class CharterTest {

    @Test
    public void TestCharter() {
        // Create a new Charter object
        Charter charterOne = new Charter(6010, "San Diego", "San Francisco", "2023-06-15T09:30");

        // Test inherited method from Flight class
        assertEquals(6010, charterOne.getFlightNumber());

        // Test method specific to Charter class
        assertEquals("2023-06-15T09:30", charterOne.getDepartureDateTime().toString());
    }
}