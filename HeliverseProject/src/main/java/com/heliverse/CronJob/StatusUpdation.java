package com.heliverse.CronJob;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.heliverse.Models.Quize;
import com.heliverse.Repository.QuizeRepository;
import com.heliverse.Services.QuizeService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class StatusUpdation {
	
	@Autowired
	private QuizeRepository qRepository;
	
	LocalDateTime currentTime  = LocalDateTime.now();
	
	@Scheduled(cron = "0 * * * * *") // cron job it will update the status eveery minutes
	public void updateStatus() {
		List<Quize> az = qRepository.findAll();
		
		for(Quize q : az) {
			if (currentTime.isBefore(q.getStartDateTime())) { 
                q.setStatus("inactive");
            } else if (currentTime.isAfter(q.getStartDateTime()) && currentTime.isBefore(q.getEndDateTime())) {
                q.setStatus("active");
            } else if (currentTime.isAfter(q.getEndDateTime())) {
                q.setStatus("finished");
            }
			
			qRepository.save(q);
			
		}
		
		
	}

}
