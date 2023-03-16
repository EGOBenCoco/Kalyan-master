package org.example.Kalyan.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_order;

    @NotNull
    private long sum;

    @NotNull
    private Date date;

    @ManyToOne()
    @JoinColumn(name = "manager_id")
    private Manager manager;
    @ManyToOne()
    @JoinColumn(name = "client_id")
    private Client client;


    @OneToMany
    private List<Kalyan> kalyans;
    @OneToMany
    private List<Tabak> tabaks;
}
