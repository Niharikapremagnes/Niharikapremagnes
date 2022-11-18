package com.ct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.entity.CricketTeams;
import com.ct.repository.CricketTeamsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CricketTeamsService {
	
	  	@Autowired
	    private CricketTeamsRepository ctRepository;

	    public CricketTeams saveCricketTeams(CricketTeams ct) {
	        log.info("Inside saveCricketTeams of CricketTeamsService");
	        return  ctRepository.save(ct);
	    }

	    public CricketTeams findCricketTeamsById(Long ct_id) {
	        log.info("Inside saveCricketTeamsById of CricketTeamsService");
	        return ctRepository.findByCricketTeamsId(ct_id);
	    }

		public List<CricketTeams> getCricketTeams() {
			log.info("Inside getCricketTeams of CricketTeamsService");
	        return ctRepository.findAll();
			
		}

		public CricketTeams findCricketTeamsByName(String ct_name) {
			 log.info("Inside findCricketTeamsByName of CricketTeamsService");
		        return ctRepository.findByCricketTeamsName(ct_name);
		}

}
