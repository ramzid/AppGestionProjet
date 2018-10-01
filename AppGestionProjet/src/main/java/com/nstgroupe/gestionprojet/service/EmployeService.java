package com.nstgroupe.gestionprojet.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nstgroupe.gestionprojet.persistance.dao.EmployeDao;
import com.nstgroupe.gestionprojet.persistance.model.Employe;

@Service
@Transactional
public class EmployeService implements IEmployeService {
	
@Autowired
	EmployeDao employeDao;
	
	@Override
	public void add(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.save(employe);
	}

	@Override
	public void delete(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.delete(employe);
	}

	@Override
	public void update(Employe employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeDao.findAll();
	}
	

}
