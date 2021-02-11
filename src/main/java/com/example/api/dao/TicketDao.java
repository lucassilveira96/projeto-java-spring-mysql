package com.example.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.api.models.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Long>{

}
