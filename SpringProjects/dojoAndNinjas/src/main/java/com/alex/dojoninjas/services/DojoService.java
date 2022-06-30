package com.alex.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.dojoninjas.models.Dojo;
import com.alex.dojoninjas.repositories.DojoRepository;


@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepository;
	
	// Constructor
	public DojoService(DojoRepository dojo) {
	this.dojoRepository = dojo;
	}
    // FINDS ALL the dojos
	public List<Dojo> allDojos() {
    return dojoRepository.findAll();
	}
	// CREATES a dojo
	public Dojo createDojo(Dojo dojo) {
	return dojoRepository.save(dojo);
	}
	// FINDS, RETRIEVES a dojo by ID
	public Dojo findDojo(Long id) {
	Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	if(optionalDojo.isPresent()) {
	     	return optionalDojo.get();
		} else {
			return null;
		}
		
	}
	// UPDATES a dojo
    public Dojo updateDojo(Dojo dojo) {
    	return dojoRepository.save(dojo);
	}
		
	// DELETES a dojo
    public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
}
