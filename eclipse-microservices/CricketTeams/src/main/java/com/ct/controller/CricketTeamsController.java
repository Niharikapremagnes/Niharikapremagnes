package com.ct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ct.entity.CricketTeams;
import com.ct.service.CricketTeamsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cts")
@Slf4j
public class CricketTeamsController {
	 	@Autowired
	    private  CricketTeamsService ctService;

	    @PostMapping("/")
	    public CricketTeams saveCricketTeams(@RequestBody CricketTeams ct) {
	        log.info("Inside saveCricketTeams method of CricketTeamsController");
	        return  ctService.saveCricketTeams(ct);
	    }

	    @GetMapping("/{id}")
	    public CricketTeams findCricketTeamsById(@PathVariable("id") Long ct_Id) {
	        log.info("Inside findCricketTeamsById method of CricketTeamsController");
	        return ctService.findCricketTeamsById(ct_Id);
	    }
	    @GetMapping("/{name}")
	    public CricketTeams findCricketTeamsByName(@PathVariable("name") String ct_name) {
	        log.info("Inside findCricketTeamsByName method of CricketTeamsController");
	        return ctService.findCricketTeamsByName(ct_name);
	    }
	    
	    @GetMapping("/")
	    public List<CricketTeams> getCricketTeams(CricketTeams ct) {
	    	log.info("Inside getCricketTeams method of CricketTeamsController");
	        return  ctService.getCricketTeams();
	    }

}
