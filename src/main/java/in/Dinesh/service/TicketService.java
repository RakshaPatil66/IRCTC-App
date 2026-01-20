package in.Dinesh.service;

import java.util.Collection;

import in.Dinesh.binding.Passenger;
import in.Dinesh.binding.Ticket;

public interface TicketService
{
	public Ticket BookTicket(Passenger p);
	
	public Collection<Ticket> getAllTickets();

}
