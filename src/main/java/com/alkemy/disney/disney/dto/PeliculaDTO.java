package com.alkemy.disney.disney.dto;

import com.alkemy.disney.disney.entity.GeneroEntity;
import com.alkemy.disney.disney.entity.PersonajeEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PeliculaDTO {
    private Long id;
    private String imagen;
    private String titulo;
    //private LocalDate fechaCreacion;
    private String fechaCreacion;
    private int calificacion;
    private Long generoId;
    private Set<PersonajeEntity> personajes = new HashSet<>();
}
