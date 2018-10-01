package com.nstgroupe.gestionprojet.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nstgroupe.gestionprojet.persistance.model.Employe;

public interface EmployeDao extends JpaRepository<Employe, Integer> {
	

}
