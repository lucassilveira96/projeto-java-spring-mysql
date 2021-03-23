package com.silveiradev.crudzera.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue
    long id;
    String lastname;
    String firstname;
    String email;
    String telephone;
}
