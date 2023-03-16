package org.example.Kalyan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public abstract class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idUser;

    @NotNull
   private String name;
    @NotNull
   private long number;
    @NotNull
   private String email;
    @NotNull
  private  String password;




}
