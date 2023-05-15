package com.heliverse.Services;

import java.util.List;

import com.heliverse.Exceptions.QuizeExceptions;
import com.heliverse.Models.Quize;
import com.heliverse.Models.Result;

public interface QuizeService {
	
	//active quize
	List<Quize> getActiveQuizeService() throws QuizeExceptions;

	//new quize
	Quize createQuize(Quize quize) throws QuizeExceptions;
	
	//get all quize
	List<Quize> getAllQuize() throws QuizeExceptions;
	
	//get quize by id
	Quize getByID(Integer id) throws QuizeExceptions;
	
	//get quize result by id
	Result getResultByID(Integer id) throws QuizeExceptions;
	
}
