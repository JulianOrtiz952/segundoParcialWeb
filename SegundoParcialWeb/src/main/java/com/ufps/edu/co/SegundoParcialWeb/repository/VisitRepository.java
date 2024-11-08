package com.ufps.edu.co.SegundoParcialWeb.repository;

import com.ufps.edu.co.SegundoParcialWeb.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {
}
