package com.tp1.spring.service;

import com.tp1.spring.entity.dto.curso.CursoCreate;
import com.tp1.spring.entity.dto.curso.CursoDto;
import com.tp1.spring.entity.dto.curso.CursoEdit;

//No hay campos editables
public interface CursoService extends BaseService<CursoDto,CursoCreate,CursoEdit,Long> {
    void addEstudiante(Long idCuso, Long idEstudiante);
    CursoDto update(Long id, CursoEdit cursoDto);
}
