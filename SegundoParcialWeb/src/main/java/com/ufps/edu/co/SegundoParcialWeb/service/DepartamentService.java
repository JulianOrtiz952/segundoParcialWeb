package com.ufps.edu.co.SegundoParcialWeb.service;

import com.ufps.edu.co.SegundoParcialWeb.entity.Departament;
import com.ufps.edu.co.SegundoParcialWeb.repository.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartamentService {

    @Autowired
    private DepartamentRepository departamentRepository;

    public Departament postDepartament(Departament departament){
        return departamentRepository.save(departament);
    }

    public Optional<Departament> findByID(Integer id){
        return departamentRepository.findById(id);
    }

}
