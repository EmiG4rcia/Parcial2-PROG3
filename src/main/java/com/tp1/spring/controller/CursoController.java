package com.tp1.spring.controller;

import com.tp1.spring.entity.dto.curso.CursoCreate;
import com.tp1.spring.entity.dto.curso.CursoDto;
import com.tp1.spring.entity.dto.curso.CursoEdit;
import com.tp1.spring.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("curso")
public class CursoController extends BaseController<CursoDto, CursoCreate, CursoEdit,Long> {

    @Autowired
    CursoService cursoService;

    @PutMapping("addEstudiante/{idCurso}/{idEstudiante}")
    public ResponseEntity<?> addEstudiante(@PathVariable Long idCurso, @PathVariable Long idEstudiante){
        try{
            cursoService.addEstudiante(idCurso,idEstudiante);
            return ResponseEntity.ok("Estudiante agregado con exito");
        }catch (Exception e ){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Ocurrio un error del tipo " + e.getClass() + " \nMensaje: " + e.getMessage());

        }
    }
}
