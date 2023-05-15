package com.heliverse.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;

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
public class Quize {
	
	@Id
	private Integer quizeId;
	
	private String question;
	
	@ElementCollection
	private String[] options;
	
	@Max(value = 3,message = "please put the valid index")
	private Integer rightAnswer;
	
	private LocalDateTime startDateTime;
	
	private LocalDateTime endDateTime;
	
	private String status;
	
	
	

	
	

}
