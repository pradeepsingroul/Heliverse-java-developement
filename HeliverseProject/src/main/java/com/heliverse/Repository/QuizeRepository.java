package com.heliverse.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.heliverse.Models.Quize;

@Repository
public interface QuizeRepository extends JpaRepository<Quize, Integer>{
	
	@Query(value = "SELECT * from quize q where CURRENT_DATE() BETWEEN start_Date AND end_Date AND CURRENT_TIME() BETWEEN start_Time AND end_Time;",nativeQuery = true)
	List<Quize> getActiveQuize();
	
	@Query(value = "Select TIMESTAMPDIFF(MINUTE,end_Time,CURRENT_TIME()) from quize q where q.quize_Id = :id",nativeQuery = true)
	Integer getTimeDiff( Integer id);

}
