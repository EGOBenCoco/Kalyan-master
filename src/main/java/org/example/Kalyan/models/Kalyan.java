package org.example.Kalyan.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Kalyan
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idKalyan;

    @NotNull
    private String name;
    private String description;

/*    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;*/
}
