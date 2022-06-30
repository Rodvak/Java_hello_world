package com.alex.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alex.dojoninjas.models.Ninja;


public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}
