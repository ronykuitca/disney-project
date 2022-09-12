package com.alkemy.disney.disney.service.impl;

import com.alkemy.disney.disney.dto.PersonajeDTO;
import com.alkemy.disney.disney.entity.PersonajeEntity;
import com.alkemy.disney.disney.mapper.PersonajeMapper;
import com.alkemy.disney.disney.repository.PersonajeRepository;
import com.alkemy.disney.disney.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {


    @Autowired
    private PersonajeMapper personajeMapper;

    @Autowired
    private PersonajeRepository personajeRepository;


    public PersonajeDTO save(PersonajeDTO dto) {
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity entitySaved = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entity);
        return result;
    }


    public List<PersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<PersonajeDTO>result = personajeMapper.personajeEntityList2DTOList(entities);
        return result;
    }


    /*public PersonajeDTO update(Long id, PersonajeDTO personajeDTO) {
        PersonajeEntity entity = this.personajeRepository.getReferenceById(id);
        entity.setNombre(personajeDTO.getNombre());
        entity.setPeso(personajeDTO.getPeso());
        entity.setEdad(personajeDTO.getEdad());
        entity.setImagen(personajeDTO.getImagen());
        entity.setHistoria((personajeDTO.getHistoria()));

        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entity);
        return result;
    }*/
}
