package org.example.Kalyan.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Client extends  User
{
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client" )
    private List<Orders> orderList;
}
