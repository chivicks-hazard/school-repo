package org.airline.reservations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

	private ArrayList<Seat> seats;
	private ArrayList<Flight> flights;
	private ArrayList<Passenger> passengers;
	private ArrayList<Ticket> tickets;
	
	private static Logger databaseLog = Logger.getLogger(Database.class.getName());
	private static ConsoleHandler logScreen = new ConsoleHandler();
	
	public Database() {
		seats = new ArrayList<Seat>();
		flights = new ArrayList<Flight>();
		passengers = new ArrayList<Passenger>();
		tickets = new ArrayList<Ticket>();
	}

	// getters
	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}


	public ArrayList<Seat> getSeats() {
		return seats;
	}

	// setters 
	
	public void setLogging() {
		databaseLog.addHandler(logScreen);
		databaseLog.setLevel(Level.FINER);
		logScreen.setLevel(Level.FINER);
		databaseLog.setUseParentHandlers(false);
	}
	
	public void addSeat(int seat) {
		seats.add(new Seat(seat));
	}
	
	public boolean addPassenger(String passengerName) {
		boolean passengerExists = false;
		for (Passenger item : getPassengers()) {
			if (passengerName.equals(item.getName())) {
				passengerExists = true;
			}
		}
		
		if (passengerExists == false) {
			passengers.add(new Passenger(passengerName));
		}
		
		return passengerExists;
	}
	
	public void addFlight(int flightNumber, String departureCity, String arrivalCity) {
		flights.add(new Flight(flightNumber, departureCity, arrivalCity));
	}
	
	public String addTicket(LocalDate departureDate, String passengerName, int flightNumber, int seatNumber) {
		databaseLog.fine("Beginning ticket creation");
		
		// find the passenger object
		databaseLog.fine("Finding the passenger");
		Passenger ticketPassenger = null;
		for (Passenger item : getPassengers()) {
			if (passengerName.equals(item.getName())) {
				ticketPassenger = item;
			}
		}
		
		// find flight object
		databaseLog.fine("Finding flight");
		Flight ticketFlight = null;
		for (Flight item : getFlights()) {
			databaseLog.finer("Comparing qqqqqqqqq1" +111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111 flightNumber + " to flight " + item.getFlightNumber());
			if (flightNumber == item.getFlightNumber()) {
				ticketFlight = item;
			}
		}
		
		// finding seat object
		databaseLog.fine("Finding seat");
		Seat ticketSeat = null;
		for (Seat item : getSeats()) {
			if (seatNumber == item.getSeatNumber()) {
				ticketSeat = item;
			}
		}
		
		// finding ticket object
		databaseLog.fine("Finding ticket");
		Ticket tempTicket = new Ticket();
		tempTicket.setDepartureDate(departureDate);
		tempTicket.setPassenger(ticketPassenger);
		tempTicket.setFlight(ticketFlight);
		tempTicket.setSeat(ticketSeat);
		tickets.add(tempTicket);
		databaseLog.info("Ticket created");
		return tempTicket.toString();
	}
	
	public ArrayList<Seat> getOpenSeats(LocalDate departureDate, int flightNumber) {
		ArrayList<Seat> openSeats = getSeats();
		for (Ticket item : getTickets()) {
			if (departureDate.equals(item.getDepartureDate()) && flightNumber == item.getFlight().getFlightNumber()) {
				openSeats.remove(item.getSeat());
			}
		}
		
		return openSeats;
	}
	
	public void bootstrap() {
		addSeat(1);
		addSeat(2);
        addSeat(3);
        addSeat(4);
        addSeat(5);
        addSeat(6);

        addFlight(1000,"Los Angeles", "Chicago");
        addFlight(1010,"Chicago","New York");
        addFlight(2000,"New York","Chicago");
        addFlight(2010,"Chicago","Los Angeles");
	}
	
	public void bootstrapCSV() {
		try {
			BufferedReader flightImport = new BufferedReader(new FileReader("C:\\Users\\HP\\Documents\\Programming\\School Tech\\SOE 301\\Java Assignment\\Reservations\\import"));
			String flightLine;
			while ((flightLine = flightImport.readLine()) != null) {
				System.out.println(flightLine);
			}
			flightImport.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exportSeats() {
		try {
			BufferedWriter seatExport = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Documents\\Programming\\School Tech\\SOE 301\\Java Assignment\\Reservations\\export\\seats.csv"));
			for (Seat item : getSeats()) {
				seatExport.write(item.toString() + "\n");
			}
			System.out.println("Export file created");
			seatExport.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   

}
