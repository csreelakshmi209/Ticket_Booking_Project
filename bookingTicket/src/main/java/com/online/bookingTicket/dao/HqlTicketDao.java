package com.online.bookingTicket.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.online.bookingTicket.entity.Bus;
import com.online.bookingTicket.entity.Ticket;

public class HqlTicketDao {
	
	public Bus getBusList(String fromPlace, String toPlace)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//String hqlQuery="from Bus";
		String hqlQuery=" from Bus from_place,to_place ";
		Query query = session.createQuery(hqlQuery);
		return (Bus) query.list();}
		
	
	public void cancelTicketById(int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="delete from Ticket where id=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i",id);
		query.executeUpdate();
		transaction.commit();	
		
	}
	public Ticket confirmBookedTicket(int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
      	SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session= sessionfactory.openSession();
		//String hqlQuery="from Movie";
		String hqlQuery="from Ticket where id=:i";
		Query query=session.createQuery(hqlQuery);
		query.setParameter("i",id);
		//return query.list();
		return (Ticket) query.uniqueResult();
	}

	
}
