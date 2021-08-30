package com.online.bookingTicket;


import com.online.bookingTicket.dao.HqlTicketDao;
import com.online.bookingTicket.dao.TicketDao;
import com.online.bookingTicket.entity.Bus;
import com.online.bookingTicket.entity.Ticket;
import com.online.bookingTicket.dto.TicketDto;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Ticket ticket = new Ticket();
       // ticket.setId(1);
        ticket.setFromPlace("rajampet");
        ticket.setToPlace("bglr");
		ticket.setTravelDate("1-sep-2021");
		ticket.setPrice(1000.00);
		ticket.setPassengersCount(5);
		ticket.setStatus("active");
        
        TicketDao ticketDao = new TicketDao();
      // ticketDao.saveBookTicket(ticket);
        
            
//        TicketDto ticketdto=new TicketDto();
//    	ticketdto.setPrice(500.00);
//    	ticketdto.setStatus("cancel");
//    	//ticketDao.updateTicketDetails(ticketdto, 3);
//        
        Bus bus = new Bus();
        bus.setId(1);
        bus.setName("sree");
        bus.setBus_Timings(null);
        bus.setFromPlace("rajampet");
        bus.setToplace("hyderabad");
        bus.setPrice(1000.00);
        
       
        
//        
       HqlTicketDao hqlTicket = new HqlTicketDao();
     
     // hqlTicket.cancelTicketById(3);
      hqlTicket.confirmBookedTicket(4);
     System.out.println(hqlTicket);
     System.out.println("your ticket is confirmed");
      // hqlTicket.getBusList("rajampet","hyderabad");
       
        
        
        
    }
}
