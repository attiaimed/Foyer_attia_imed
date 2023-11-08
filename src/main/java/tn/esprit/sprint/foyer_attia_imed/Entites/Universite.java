package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;

@Table(name = "Universite")
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    @Column(name = "nomUniversite")
    private String nom;
    @Column(name = "adresse")
    private String adresse;

}