package in.Dinesh.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.Dinesh.binding.Passenger;
import in.Dinesh.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService 
{
	Map<Integer,Ticket> map=new HashMap<>();

	@Override
	public Ticket BookTicket(Passenger p)
	{
		Ticket t=new Ticket();
		
		Random r=new Random();
		int id=r.nextInt(50) +3;
		t.setTicketNum(id);
		
		BeanUtils.copyProperties(p, t);
		
		t.setStatus("Confirm");
		
		map.put(id, t);
		
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		
		return map.values();
		
		
	}

}
