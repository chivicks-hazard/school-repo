package org.airline.reservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Console {
	public static void main(String[] args) {
		Database prodDB = new Database();
		prodDB.bootstrap();
		prodDB.setLogging();
		
		boolean always = true;
		BufferedReader screenInput = new BufferedReader(new InputStreamReader(System.in));
		String passengerName = null;
		int flightNumber = 0;
		LocalDate departureDate = LocalDate.now();
		int seatNumber = 0;
		
		while (always) {
			System.out.println("Enter passenger: ");
			try {
				passengerName = screenInput.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				
				System.out.println("Sorry. I don't understand.");
			}
			boolean result = prodDB.addPassenger(passengerName);
			if (result) {
				System.out.println("Welcome back " + passengerName);
			} else {
				System.out.println("Welcome " + passengerName);
			}
//			always = false;
			
			System.out.println("\n Here are the available flights");
			for (Flight item : prodDB.getFlights()) {
				System.out.println(item);
			}
			System.out.println("Enter the flight number to book");
			try {
				flightNumber = Integer.parseInt(screenInput.readLine());
			} catch (IOException e) {
				System.out.println("Please enter a flight number");
			} catch (NumberFormatException e) {
//				System.out.println("This isn't a number.");
				Logger.getGlobal().warning("Flight must be an integer");
			}
			
			System.out.println("\nAssuming you are flying today, ");
			System.out.println("Here are the available seats on that flight: ");
			ArrayList<Seat> openSeats = prodDB.getOpenSeats(departureDate, flightNumber);
			for (Seat item : openSeats) {
				
			 System.out.print(item.getSeatNumber()+",");

			}
			 System.out.println("\nEnter the seat you want: ");
			try {
			seatNumber = Integer.parseInt(screenInput.readLine());
			} catch (IOException e) {
				 System.out.println("Please Enter a Seat Number: ");
			}
			
			String ticketInfo = prodDB.addTicket(departureDate, passengerName, flightNumber, seatNumber);
			System.out.println("\nYour Reservation Was Successful Details: ");
			System.out.println(ticketInfo + "\n");
			
		}
	}
}
