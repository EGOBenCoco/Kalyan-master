package org.example.Kalyan.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tabak
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTabak;

    @NotNull
    private String name;

    @NotNull
    private String brend;

    @NotNull
    private long strength;

    private String aboutTabak;

/*    @ManyToOne
@JoinColumn(name = "order_id")
private Orders orders;*/
}
