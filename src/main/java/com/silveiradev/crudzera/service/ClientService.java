package com.silveiradev.crudzera.service;

import com.silveiradev.crudzera.model.entity.Client;

import java.util.List;

public interface ClientService {
    public void create(Client client);
    public void update(Client client);
    public List<Client> getAll();
    public Client getById(Long id);
    public void delete(Long id);
}
