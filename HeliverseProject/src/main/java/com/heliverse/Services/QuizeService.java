package com.heliverse.Services;

import java.util.List;

import com.heliverse.Exceptions.QuizeExceptions;
import com.heliverse.Models.Quize;

public interface QuizeService {
	
	
	List<Quize> getActiveQuizeService() throws QuizeExceptions;

	Quize createQuize(Quize quize) throws QuizeExceptions;
	
	List<Quize> getAllQuize() throws QuizeExceptions;
	
	Quize getByID(Integer id) throws QuizeExceptions;
	
}
