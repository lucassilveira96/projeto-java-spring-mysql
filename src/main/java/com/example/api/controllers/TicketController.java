package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dao.TicketDao;
import com.example.api.models.Ticket;

@RequestMapping("/ticket")
@RestController
public class TicketController {

	@Autowired
	private TicketDao dao;
	
	@PostMapping
	public String bookTicket(@RequestBody List<Ticket> ticket) {
		dao.saveAll(ticket);
		return "ticket booked : " + ticket.size();
	}

	@GetMapping
	public List<Ticket> getTickets() {
		return (List<Ticket>) dao.findAll();
	}
}
