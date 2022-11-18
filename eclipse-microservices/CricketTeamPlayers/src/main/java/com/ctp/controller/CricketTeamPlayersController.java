package com.ctp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ctp.entity.CricketTeamPlayers;
import com.ctp.service.CricketTeamPlayersService;
import com.ctp.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/players")
@Slf4j
public class CricketTeamPlayersController {
	@Autowired
    private  CricketTeamPlayersService ctpService;

    @PostMapping("/")
    public CricketTeamPlayers savePlayer(@RequestBody  CricketTeamPlayers player) {
        log.info("Inside savePlayer of  CricketTeamPlayersController");
        return ctpService.savePlayer(player);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getPlayerWithCricketTeams(@PathVariable("id") Long playerId) {
        log.info("Inside getPlayerWithCricketTeams of CricketTeamPlayersController");
        return ctpService.getCricketTeamPlayersWithTeam(playerId);
    }
    @GetMapping("/")
    public List<CricketTeamPlayers> getCricketTeams(CricketTeamPlayers ctp) {
    	log.info("Inside getCricketTeams method of CricketTeamPlayersController");
        return  ctpService.getCricketTeamPlayers();
    }
    
    @PutMapping("/{id}")
    public CricketTeamPlayers updatePlayer(@RequestBody CricketTeamPlayers ctp,@PathVariable("id") Long playerId) {
    	log.info("Inside updatePlayer of CricketTeamPlayersController");
        return ctpService.updatePlayer(playerId,ctp);
    }

}
