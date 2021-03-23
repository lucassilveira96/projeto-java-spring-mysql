package com.silveiradev.crudzera.service;

import com.silveiradev.crudzera.model.entity.Client;
import com.silveiradev.crudzera.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void create(Client client) {
        this.clientRepository.save(client);
    }

    @Override
    public void update(Client client) {
        create(client);
    }

    @Override
    public List<Client> getAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client getById(Long id) {
        return this.clientRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        this.clientRepository.deleteById(id);
    }
}
