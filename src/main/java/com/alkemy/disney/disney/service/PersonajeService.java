package com.alkemy.disney.disney.service;

import com.alkemy.disney.disney.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {

    PersonajeDTO save (PersonajeDTO dto);

    List<PersonajeDTO> getAllPersonajes();

    //PersonajeDTO update(Long id, PersonajeDTO personajeDTO);
}
