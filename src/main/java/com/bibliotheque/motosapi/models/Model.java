package com.bibliotheque.motosapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Model {
    @Id
    Long id;
    String nom;
    String image;
    int debutfabrication;
    int finfabrication;
    int generation;
    @ManyToOne
    Marque marque;
}
