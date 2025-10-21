package com.tp1.spring.entity.mapper;

import com.tp1.spring.entity.Estudiante;
import com.tp1.spring.entity.dto.estudiante.EstudianteCreate;
import com.tp1.spring.entity.dto.estudiante.EstudianteDto;
import org.springframework.stereotype.Component;

@Component
public class EstudianteMapper implements BaseMapper<Estudiante, EstudianteDto, EstudianteCreate> {
    @Override
    public Estudiante toEntity(EstudianteCreate estudianteCreate) {
        Estudiante e = new Estudiante();
        e.setNombre(estudianteCreate.nombre());
        e.setMatricula(estudianteCreate.matricula());
        return e;
    }

    @Override
    public EstudianteDto toDto(Estudiante estudiante) {
        return new EstudianteDto(estudiante.getId(), estudiante.getNombre(), estudiante.getMatricula());
    }
}
