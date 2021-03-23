package com.silveiradev.crudzera.repository;

import com.silveiradev.crudzera.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
