package org.sid.cinema.entities;

import javax.persistence.ManyToOne;

@org.springframework.data.rest.core.config.Projection(name="ticketProj", types =Ticket.class)
public interface TicketProjection {
	public Long getId();
	public String getNomClient();
	public double getPrix();
	public Integer getCodePayement();
	public boolean getReserve();
	public Place getPlace();
}
