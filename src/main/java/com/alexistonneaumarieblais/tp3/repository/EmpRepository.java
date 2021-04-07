package com.alexistonneaumarieblais.tp3.repository;

import com.alexistonneaumarieblais.tp3.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp, Long> {

}
