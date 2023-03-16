package org.example.Kalyan.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Manager extends User
{
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "manager" )
    private List<Orders> orderList;



}
