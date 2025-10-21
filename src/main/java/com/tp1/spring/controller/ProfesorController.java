package com.tp1.spring.controller;

import com.tp1.spring.entity.dto.profesor.ProfesorCreate;
import com.tp1.spring.entity.dto.profesor.ProfesorDto;
import com.tp1.spring.entity.dto.profesor.ProfesorEdit;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("profesor")
public class ProfesorController extends BaseController<ProfesorDto, ProfesorCreate, ProfesorEdit,Long> {
}
