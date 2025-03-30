package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassenger() {
//		fail("Not yet implemented");
		Passenger testPassenger1 = new Passenger();
		String result = testPassenger1.getName();
		assertEquals("Unknown name", result);
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
//		fail("Not yet implemented");
		Passenger testPassenger2 = new Passenger();
		testPassenger2.setName("John Doe");
		assertEquals("John Doe", testPassenger2.getName());
	}

}
