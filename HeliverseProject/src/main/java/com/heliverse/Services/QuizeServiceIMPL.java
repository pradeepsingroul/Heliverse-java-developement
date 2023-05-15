package com.heliverse.Services;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliverse.Exceptions.QuizeExceptions;
import com.heliverse.Models.Quize;
import com.heliverse.Models.Result;
import com.heliverse.Repository.QuizeRepository;

@Service
public class QuizeServiceIMPL implements QuizeService{

	
	@Autowired
	private QuizeRepository qRepo;
	
	
	@Override
	public List<Quize> getActiveQuizeService() throws QuizeExceptions {
		List<Quize> qList = qRepo.getActiveQuize(); //finding the quizes
		return qList; //returning
	}


	@Override
	public Quize createQuize(Quize quize) throws QuizeExceptions {
		Optional<Quize> opt =  qRepo.findById(quize.getQuizeId()); //finding the quize
		if(opt.isPresent()) { //checking it exist or not
			throw new QuizeExceptions("Quize already exits with id : "+quize.getQuizeId());
		}else {
			return qRepo.save(quize); //returning
		}
		
	}


	@Override
	public List<Quize> getAllQuize() throws QuizeExceptions {
		List<Quize> qList = qRepo.findAll(); //finding the quizes
		return qList; //returning
	}


	@Override
	public Quize getByID(Integer id) throws QuizeExceptions {
		Optional<Quize> opt =  qRepo.findById(id); //finding the quize
		if(opt.isPresent()) {  //checking it exist or not
			return opt.get(); //returning
		}else {
			throw new QuizeExceptions("Quize does not exits with id : "+id);
		}
	}


	@Override
	public Result getResultByID(Integer id) throws QuizeExceptions {
		// TODO Auto-generated method stub
		Optional<Quize> opt =  qRepo.findById(id);                       		//finding the quize
		
		if(opt.isPresent()) {                                             		//checking it exist or not
			Quize resultQuize =  opt.get();                              		 //get quize
			int minutesDiff = qRepo.getTimeDiff(resultQuize.getQuizeId());      //calculating the minute difference between end time and current time
			if(minutesDiff>=5) {                                               
				String answer = resultQuize.getOptions()[resultQuize.getRightAnswer()]; //finding the answer of quize question
				Result result = new Result(resultQuize.getQuestion(),answer );			//creating result class
				return result;															//returnig result class
			}else {
				throw new QuizeExceptions("Quize in in runnig state/inactive state so we can't produce the result");
			}
	
			
		}else {
			throw new QuizeExceptions("Quize does not exits with id : "+id);
		}
		
	}

}
