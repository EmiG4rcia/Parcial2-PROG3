package com.tp1.spring.controller;

import com.tp1.spring.entity.dto.curso.CursoEdit;
import com.tp1.spring.entity.dto.estudiante.EstudianteCreate;
import com.tp1.spring.entity.dto.estudiante.EstudianteDto;
import com.tp1.spring.entity.dto.estudiante.EstudianteEdit;
import com.tp1.spring.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("estudiante")
@CrossOrigin("*")
public class EstudianteController extends BaseController<EstudianteDto, EstudianteCreate, EstudianteEdit, Long> {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("findCursos/{idEstudiante}")
    public ResponseEntity<?> findAll (@PathVariable Long idEstudiante){
        try{
            return ResponseEntity.ok(estudianteService.getCursosById(idEstudiante));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ocurrio un error del tipo " + e.getClass() + " \nMensaje: " + e.getMessage());
        }
    }
}
