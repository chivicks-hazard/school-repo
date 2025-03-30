package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Ticket testTicket1 = new Ticket();
		Passenger testPassenger1 = new Passenger("John Doe");
		testTicket1.setPassenger(testPassenger1);
		assertEquals("John Doe", testTicket1.getPassenger().getName());
	}

}
