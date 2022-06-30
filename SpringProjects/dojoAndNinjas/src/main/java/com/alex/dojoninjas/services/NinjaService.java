package com.alex.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.dojoninjas.models.Ninja;
import com.alex.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepository;
	
	// Constructor
	public NinjaService(NinjaRepository ninja) {
		this.ninjaRepository = ninja;
	}
	// FINDS ALL the ninjas
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // CREATES a ninja
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
    // FINDS, RETRIEVES a ninja by ID
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
	
    }
    // UPDATES a ninja
    public Ninja updateNinja(Ninja ninja) {
    	return ninjaRepository.save(ninja);
    }
	
    // DELETES a ninja
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}

}
