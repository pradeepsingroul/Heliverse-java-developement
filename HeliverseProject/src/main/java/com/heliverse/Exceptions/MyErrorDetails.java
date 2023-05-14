package com.heliverse.Exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorDetails{
	
	
	private String message;
	
	private LocalDateTime lcdt;
	
	private String description;

}
