package com.tp1.spring.service;

import com.tp1.spring.entity.Curso;
import com.tp1.spring.entity.Estudiante;
import com.tp1.spring.entity.dto.curso.CursoDto;
import com.tp1.spring.entity.dto.estudiante.EstudianteCreate;
import com.tp1.spring.entity.dto.estudiante.EstudianteDto;
import com.tp1.spring.entity.dto.estudiante.EstudianteEdit;

import java.util.List;

//No hay dto de edit porque no hay campos editables
public interface EstudianteService  extends BaseService<EstudianteDto, EstudianteCreate,EstudianteEdit,Long> {
    void addCurso(Curso curso, Estudiante e);
    List<CursoDto> getCursosById(Long idEstudiante);
    EstudianteDto update(Long id, EstudianteEdit estudianteDto);
}
