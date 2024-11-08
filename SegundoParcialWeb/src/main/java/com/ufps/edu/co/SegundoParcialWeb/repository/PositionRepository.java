package com.ufps.edu.co.SegundoParcialWeb.repository;

import com.ufps.edu.co.SegundoParcialWeb.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
