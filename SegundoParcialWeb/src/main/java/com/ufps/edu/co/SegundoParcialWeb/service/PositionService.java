package com.ufps.edu.co.SegundoParcialWeb.service;

import com.ufps.edu.co.SegundoParcialWeb.entity.Position;
import com.ufps.edu.co.SegundoParcialWeb.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public Position post(Position position){
        return positionRepository.save(position);
    }

}
