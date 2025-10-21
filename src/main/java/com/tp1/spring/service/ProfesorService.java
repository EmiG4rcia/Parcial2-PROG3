package com.tp1.spring.service;

import com.tp1.spring.entity.dto.profesor.ProfesorCreate;
import com.tp1.spring.entity.dto.profesor.ProfesorDto;
import com.tp1.spring.entity.dto.profesor.ProfesorEdit;

//No hay dto de edit porque no hay campos editables
public interface ProfesorService extends BaseService<ProfesorDto, ProfesorCreate, ProfesorEdit,Long> {
    ProfesorDto update(Long id, ProfesorEdit profesorDto);
}
