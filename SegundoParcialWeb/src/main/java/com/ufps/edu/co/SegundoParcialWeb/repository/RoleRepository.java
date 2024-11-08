package com.ufps.edu.co.SegundoParcialWeb.repository;

import com.ufps.edu.co.SegundoParcialWeb.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
