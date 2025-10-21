package com.tp1.spring.service;

import com.tp1.spring.entity.Profesor;
import com.tp1.spring.entity.dto.profesor.ProfesorCreate;
import com.tp1.spring.entity.dto.profesor.ProfesorDto;
import com.tp1.spring.entity.dto.profesor.ProfesorEdit;
import com.tp1.spring.entity.mapper.ProfesorMapper;
import com.tp1.spring.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImp extends BaseServiceImp<Profesor, ProfesorDto, ProfesorCreate, ProfesorEdit, Long> implements ProfesorService {

    @Autowired
    ProfesorRepository profesorRepository;

    @Autowired
    ProfesorMapper profesorMapper;

    @Override
    public ProfesorDto update(Long id, ProfesorEdit profesorDto) {
        Profesor profesor = baseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));

        profesor.setNombre(profesorDto.nombre());
        profesor.setMail(profesorDto.email());

        profesorRepository.save(profesor);

        return profesorMapper.toDto(profesor);
    }
}
