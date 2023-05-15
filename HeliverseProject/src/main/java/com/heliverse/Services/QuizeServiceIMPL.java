package com.heliverse.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliverse.Exceptions.QuizeExceptions;
import com.heliverse.Models.Quize;
import com.heliverse.Repository.QuizeRepository;

@Service
public class QuizeServiceIMPL implements QuizeService{

	
	@Autowired
	private QuizeRepository qRepo;
	
	
	@Override
	public List<Quize> getActiveQuizeService() throws QuizeExceptions {
		List<Quize> qList = qRepo.getActiveQuize();
		return qList;
	}


	@Override
	public Quize createQuize(Quize quize) throws QuizeExceptions {
		Optional<Quize> opt =  qRepo.findById(quize.getQuizeId());
		if(opt.isPresent()) {
			throw new QuizeExceptions("Quize does not exits with id : "+quize.getQuizeId());
		}else {
			return qRepo.save(quize);
		}
		
	}


	@Override
	public List<Quize> getAllQuize() throws QuizeExceptions {
		List<Quize> qList = qRepo.findAll();
		return qList;
	}


	@Override
	public Quize getByID(Integer id) throws QuizeExceptions {
		Optional<Quize> opt =  qRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new QuizeExceptions("Quize does not exits with id : "+id);
		}
	}

}
