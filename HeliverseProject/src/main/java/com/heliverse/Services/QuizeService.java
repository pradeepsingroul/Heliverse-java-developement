package com.heliverse.Services;

import java.util.List;

import com.heliverse.Exceptions.QuizeExceptions;
import com.heliverse.Models.Quiz;
import com.heliverse.Models.Result;

public interface QuizeService {
	
	//active quize
	List<Quiz> getActiveQuizeService() throws QuizeExceptions;

	//new quize
	Quiz createQuize(Quiz quize) throws QuizeExceptions;
	
	//get all quize
	List<Quiz> getAllQuize() throws QuizeExceptions;
	
	//get quize by id
	Quiz getByID(Integer id) throws QuizeExceptions;
	
	//get quize result by id
	Result getResultByID(Integer id) throws QuizeExceptions;
	
}
