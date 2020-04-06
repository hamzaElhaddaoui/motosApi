package com.bibliotheque.motosapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Moto {
    @Id
    private Long id;
    private String nom;
    @Column(length=2048)
    private String description;
    private String lien;
    private String categorie;
    private String puissance;
    private String couple;
    private String typemoteur;
    private String rapports;
    private String cylindres;
    private String poids;
    private int debutfabrication;
    private int finfabrication;

    @ManyToOne
    private Model model;
}
