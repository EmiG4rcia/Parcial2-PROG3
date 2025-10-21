package com.tp1.spring.entity.mapper;

import com.tp1.spring.entity.Profesor;
import com.tp1.spring.entity.dto.profesor.ProfesorCreate;
import com.tp1.spring.entity.dto.profesor.ProfesorDto;
import org.springframework.stereotype.Component;

@Component
public class ProfesorMapper implements BaseMapper<Profesor, ProfesorDto, ProfesorCreate> {
    @Override
    public Profesor toEntity(ProfesorCreate profesorCreate) {
        Profesor p = new Profesor();
        p.setMail(profesorCreate.mail());
        p.setNombre(profesorCreate.nombre());
        return p;
    }

    @Override
    public ProfesorDto toDto(Profesor profesor) {
        ProfesorDto p = new ProfesorDto(profesor.getId(), profesor.getNombre(),profesor.getMail());
        return p;
    }
}
