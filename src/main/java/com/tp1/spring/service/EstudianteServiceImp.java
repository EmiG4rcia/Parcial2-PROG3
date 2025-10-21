package com.tp1.spring.service;

import com.tp1.spring.entity.Curso;
import com.tp1.spring.entity.Estudiante;
import com.tp1.spring.entity.dto.curso.CursoDto;
import com.tp1.spring.entity.dto.estudiante.EstudianteCreate;
import com.tp1.spring.entity.dto.estudiante.EstudianteDto;
import com.tp1.spring.entity.dto.estudiante.EstudianteEdit;
import com.tp1.spring.entity.mapper.CursoMapper;
import com.tp1.spring.entity.mapper.EstudianteMapper;
import com.tp1.spring.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImp extends BaseServiceImp<Estudiante, EstudianteDto,EstudianteCreate,EstudianteEdit,Long> implements EstudianteService {

    @Autowired
    CursoMapper cursoMapper;
   @Autowired
    EstudianteRepository estudianteRepository;
   @Autowired
   EstudianteMapper estudianteMapper;

    @Override
    public void addCurso(Curso curso, Estudiante e) {
        e.getCursos().add(curso);
        baseRepository.save(e);
    }

    @Override
    public List<CursoDto> getCursosById(Long idEstudiante) {
        return estudianteRepository.findCursosById(idEstudiante).stream().map(cursoMapper::toDto).toList();
    }

    @Override
    public EstudianteDto update(Long id, EstudianteEdit estudianteEdit) {
        Estudiante estudiante = estudianteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        estudiante.setNombre(estudianteEdit.nombre());
        estudiante.setMatricula(estudianteEdit.matricula());

        estudianteRepository.save(estudiante);
        return estudianteMapper.toDto(estudiante);
    }

    @Override
    public EstudianteDto findById(Long id) {
        Estudiante estudiante = estudianteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
        return estudianteMapper.toDto(estudiante);
    }

    @Override
    public void deleteById(Long id) {
        estudianteRepository.deleteById(id);
    }
}
