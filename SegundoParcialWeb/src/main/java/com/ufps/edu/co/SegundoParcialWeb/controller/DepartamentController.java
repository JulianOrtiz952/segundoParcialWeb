package com.ufps.edu.co.SegundoParcialWeb.controller;

import com.ufps.edu.co.SegundoParcialWeb.entity.Departament;
import com.ufps.edu.co.SegundoParcialWeb.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departament")
public class DepartamentController {

    @Autowired
    private DepartamentService departamentService;

    @PostMapping
    public ResponseEntity<Departament> postDepartament(@RequestBody Departament departament){
        return ResponseEntity.ok(departamentService.postDepartament(departament));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Departament>> findById(@PathVariable Integer id){
        return ResponseEntity.ok(departamentService.findByID(id));
    }

}
