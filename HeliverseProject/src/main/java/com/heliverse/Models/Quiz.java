package com.heliverse.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
	
	@Id
	private Integer quizId;
	
	private String question;
	
//	@JsonProperty(access = Access.WRITE_ONLY)
	@ElementCollection
	private List<String> options;
	
	@Max(value = 3,message = "please put the valid index")
	private Integer rightAnswer;
	
	private LocalDateTime startDateTime;
	
	private LocalDateTime endDateTime;
	
	private String status;
	
	
	

	
	

}
