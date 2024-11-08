package com.ufps.edu.co.SegundoParcialWeb.controller;

import com.ufps.edu.co.SegundoParcialWeb.entity.Position;
import com.ufps.edu.co.SegundoParcialWeb.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @PostMapping
    public ResponseEntity<Position> postPosition(@RequestBody Position position){
        return ResponseEntity.ok(positionService.post(position));
    }



}
