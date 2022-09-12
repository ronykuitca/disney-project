package com.alkemy.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "genero")
@Getter
@Setter

public class GeneroEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagen;

    @Column(name = "nombre_genero")
    private String nombre;

    /*@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "pelicula_id", insertable = false, updatable = false)
    private List<PeliculaEntity> peliculas = new ArrayList<>();

    @Column(name = "pelicula_id", nullable = false)
    private Long peliculaId;*/


}
