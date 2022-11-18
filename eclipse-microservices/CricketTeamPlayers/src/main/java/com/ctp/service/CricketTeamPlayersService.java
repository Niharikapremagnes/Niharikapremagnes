package com.ctp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ctp.entity.CricketTeamPlayers;
import com.ctp.repository.CricketTeamPlayersRepository;
import com.ctp.vo.CricketTeams;
import com.ctp.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CricketTeamPlayersService {

	@Autowired
    private CricketTeamPlayersRepository ctpRepository;

    @Autowired
    private RestTemplate restTemplate;

       
	public CricketTeamPlayers savePlayer(CricketTeamPlayers player) {
		log.info("Inside savePlayer of CricketTeamPlayersService");
        return ctpRepository.save(player);
	}

	public ResponseTemplateVO getCricketTeamPlayersWithTeam(Long playerId) {
		 log.info("Inside getPlayerWithCricketTeams of CricketTeamPlayersService");
	        ResponseTemplateVO vo = new ResponseTemplateVO();
	        CricketTeamPlayers ctp = ctpRepository.findByPlayerId(playerId);

	        CricketTeams ct =  
	               //restTemplate.getForObject("http://localhost:7070/cts/" + ctp.getCricketTeamsId(),CricketTeams.class);
	        restTemplate.getForObject("http://CRICKETTEAMS-SERVICE/cts/" + ctp.getCricketTeamsId(),CricketTeams.class);
	        vo.setCtp(ctp);
	        vo.setCt(ct);
	        return  vo;
	}

	public List<CricketTeamPlayers> getCricketTeamPlayers() {
		log.info("Inside getCricketTeamPlayers of CricketTeamPlayersService");
        return ctpRepository.findAll();
		
	}

	public CricketTeamPlayers updatePlayer(Long playerId, CricketTeamPlayers ctp) {
		log.info("Inside updatePlayer of CricketTeamPlayersService");
        return ctpRepository.save(playerId);
	}


}
