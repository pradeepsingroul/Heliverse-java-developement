package com.heliverse.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.heliverse.Models.Quize;

@Repository
public interface QuizeRepository extends JpaRepository<Quize, Integer>{
	
	

}
