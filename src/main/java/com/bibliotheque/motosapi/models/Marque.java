package com.bibliotheque.motosapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
    @Id
    private Long id;

    private String logo;
    private String nom;
    private String pays;
    private String annee;
    private String status;
    private boolean grand;

}
