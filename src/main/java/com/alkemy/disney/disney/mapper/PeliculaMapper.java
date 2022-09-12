package com.alkemy.disney.disney.mapper;

import com.alkemy.disney.disney.dto.PeliculaDTO;
import com.alkemy.disney.disney.entity.PeliculaEntity;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class PeliculaMapper {

    public PeliculaEntity peliculaDTO2Entity(PeliculaDTO dto){
        PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setCalificacion(dto.getCalificacion());
        peliculaEntity.setImagen(dto.getImagen());
        peliculaEntity.setTitulo(dto.getTitulo());
        peliculaEntity.setPersonajes(dto.getPersonajes());
        peliculaEntity.setCalificacion(dto.getCalificacion());
        peliculaEntity.setFechaCreacion(this.string2LocalDate(dto.getFechaCreacion()));
        peliculaEntity.setGeneroId(dto.getGeneroId());

        return peliculaEntity;
    }

    public PeliculaDTO peliculaEntity2DTO(PeliculaEntity entity){
        PeliculaDTO peliculaDTO = new PeliculaDTO();
        peliculaDTO.setId(entity.getId());
        peliculaDTO.setCalificacion(entity.getCalificacion());
        peliculaDTO.setImagen(entity.getImagen());
        peliculaDTO.setTitulo(entity.getTitulo());
        peliculaDTO.setPersonajes(entity.getPersonajes());
        peliculaDTO.setCalificacion(entity.getCalificacion());
        peliculaDTO.setFechaCreacion(entity.getFechaCreacion().toString());
        peliculaDTO.setGeneroId(entity.getGeneroId());

        return peliculaDTO;
    }

    public List<PeliculaDTO> peliculaEntityList2DTOList(List<PeliculaEntity> entities){
        List<PeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity: entities) {
            dtos.add(this.peliculaEntity2DTO(entity));
        }
        return dtos;
    }

    private LocalDate string2LocalDate(String stringDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }

}
