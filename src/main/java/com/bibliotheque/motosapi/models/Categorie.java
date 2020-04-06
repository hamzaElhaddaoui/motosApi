package com.bibliotheque.motosapi.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@EqualsAndHashCode
public class Categorie implements Serializable,Cloneable{
    @Id
    private Long id;
    private String nom;

    @Override
    public boolean equals(Object o){
        //self check
        if(this == o){
            return true;
        }
        //null check
        if(o == null){
            return false;
        }
        //type check and cast
        if(getClass() != o.getClass()){
            return false;
        }
        Categorie cat = (Categorie) o;
        return this.id==cat.id && this.nom.equals(cat.nom);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
     return super.clone();
    }
}
