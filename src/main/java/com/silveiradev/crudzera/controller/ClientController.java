package com.silveiradev.crudzera.controller;

import com.silveiradev.crudzera.model.entity.Client;
import com.silveiradev.crudzera.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id){
        return clientService.getById(id);
    }

    @GetMapping
    public List<Client> getAll(){
        return (List<Client>) clientService.getAll();
    }

    @PostMapping
    public void create(@RequestBody Client client){
        clientService.create(client);
    }

    @PutMapping
    public void update(@RequestBody Client client){
        clientService.update(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clientService.delete(id);
    }


}
