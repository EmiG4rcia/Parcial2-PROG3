package com.tp1.spring.service;

import com.tp1.spring.entity.Curso;
import com.tp1.spring.entity.dto.curso.CursoCreate;
import com.tp1.spring.entity.dto.curso.CursoDto;
import com.tp1.spring.entity.dto.curso.CursoEdit;
import com.tp1.spring.entity.mapper.CursoMapper;
import com.tp1.spring.repository.CursoRepository;
import com.tp1.spring.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImp extends BaseServiceImp<Curso,CursoDto, CursoCreate,CursoEdit, Long> implements CursoService {

    @Autowired
    EstudianteRepository estudianteRepository;

    @Autowired
    CursoRepository cursoRepository;

    @Autowired
    CursoMapper cursoMapper;

    @Override
    public void addEstudiante(Long idCuso, Long idEstudiante) {
        var c = baseRepository.getById(idCuso);
        var e = estudianteRepository.getById(idEstudiante);
        c.getEstudiantes().add(e);
        baseRepository.save(c);
        e.getCursos().add(c);
        estudianteRepository.save(e);
    }

    @Override
    public CursoDto update(Long id, CursoEdit cursoDto) {
        Curso curso = baseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        //Solo se pueden editar atributos nativos
        curso.setNombre(cursoDto.nombre());
        cursoRepository.save(curso);

        return cursoMapper.toDto(curso);
    }

    @Override
    public CursoDto findById(Long id) {
        return cursoMapper.toDto(cursoRepository.getById(id));
    }

    @Override
    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }
}
