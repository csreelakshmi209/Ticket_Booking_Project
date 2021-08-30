package com.online.bookingTicket.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.online.bookingTicket.dto.TicketDto;
import com.online.bookingTicket.entity.Bus;
import com.online.bookingTicket.entity.Ticket;

public class TicketDao {
	
	public void saveBookTicket(Ticket ticket)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Ticket.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ticket);
		transaction.commit();
	}
	
	
	public Bus getBusList(String fromPlace,String toplace)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Bus.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return (Bus) session.get(fromPlace,toplace);
	}
	public Ticket know_informationTicket(int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Ticket.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		return session.get(Ticket.class,1);
	}
	

	
	public void updateTicketDetails(TicketDto ticketdto ,int id)
	{
		Ticket ticketFromDb=know_informationTicket(id);
		if(ticketFromDb!=null)
		{
			//update logic
			 Configuration cfg = new Configuration();
			 cfg.configure();
			cfg.addAnnotatedClass(Ticket.class);
			 SessionFactory sessionfactory = cfg.buildSessionFactory();
			 Session session = sessionfactory.openSession();
			 Transaction transaction=session.beginTransaction();
			 ticketFromDb.setPrice(ticketdto.getPrice());
			 ticketFromDb.setStatus(ticketdto.getStatus());
			 session.merge(ticketFromDb);
			 transaction.commit();
		}
		else {
			System.out.println("update failure");
		}
	

}
}
