package com.tp1.spring.entity.dto.curso;

import com.tp1.spring.entity.dto.estudiante.EstudianteDto;
import com.tp1.spring.entity.dto.profesor.ProfesorDto;

import java.util.List;

public record CursoDto(Long id,
                       String nombre,
                       ProfesorDto profesor,
                       List<EstudianteDto> estudiantes) {
}
