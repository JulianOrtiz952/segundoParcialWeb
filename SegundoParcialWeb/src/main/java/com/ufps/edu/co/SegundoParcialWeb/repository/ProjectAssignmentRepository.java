package com.ufps.edu.co.SegundoParcialWeb.repository;

import com.ufps.edu.co.SegundoParcialWeb.entity.ProjectAssigment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssigment, Integer> {
}
