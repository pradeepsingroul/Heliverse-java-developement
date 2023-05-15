package com.heliverse.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heliverse.Models.Quiz;
import com.heliverse.Models.Result;
import com.heliverse.Services.QuizeService;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/quizzes")
public class QuizeController {

	@Autowired
	private QuizeService qService;
	
	//getting the active quizes
	@GetMapping("/active") 
	public ResponseEntity<List<Quiz>> getActiveQuizeController(){
		List<Quiz> activeQuizelList = qService.getActiveQuizeService();
		return new ResponseEntity<>(activeQuizelList,HttpStatus.OK);
	}
	
	//creating new quize
	@PostMapping()
	public ResponseEntity<Quiz> createQuize(@Valid @RequestBody Quiz quize){
		Quiz qz = qService.createQuize(quize);
		return new ResponseEntity<Quiz>(qz,HttpStatus.OK);
	}
	
	//getting all quizes 
	@GetMapping("/all")
	public ResponseEntity<List<Quiz>> getAllQuizeController(){
		List<Quiz> allQuizeList = qService.getAllQuize();
		return new ResponseEntity<>(allQuizeList,HttpStatus.OK);
	}
	
	//getting the quize by id
	@GetMapping("/{id}")
	public ResponseEntity<Quiz> getByID(@PathVariable Integer id){
		Quiz quize = qService.getByID(id);
		return new ResponseEntity<>(quize,HttpStatus.OK);
	}
	
	//getting the quize result by id
	@GetMapping("/{id}/result")
	public ResponseEntity<Result> getResultById(@PathVariable Integer id){
		Result result = qService.getResultByID(id);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	

	
}
