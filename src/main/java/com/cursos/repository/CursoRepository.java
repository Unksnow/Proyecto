package com.cursos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cursos.model.Curso;

@Repository

public class CursoRepository {

    private List<Curso> listarCursos = new ArrayList<>();

    public List<Curso> obteneCursos(){
        return listarCursos;
    }



}
