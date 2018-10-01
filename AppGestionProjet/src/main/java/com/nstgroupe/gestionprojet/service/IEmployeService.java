package com.nstgroupe.gestionprojet.service;

import java.util.List;

import com.nstgroupe.gestionprojet.persistance.model.Employe;


public interface IEmployeService {
	public void add(Employe employe);
	public void delete(Employe employe);
	public void update(Employe employe);
	public List<Employe> findAll();

}
