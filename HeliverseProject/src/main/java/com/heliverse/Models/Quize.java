package com.heliverse.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	
	@Embedded
	private String[] options;
	
	private Integer rightAnswer;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endtDate;

}
