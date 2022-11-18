package com.ctp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctp.entity.CricketTeamPlayers;


@Repository
public interface CricketTeamPlayersRepository extends JpaRepository<CricketTeamPlayers,Long>  {

	CricketTeamPlayers findByPlayerId(Long playerId);

	CricketTeamPlayers save(Long playerId);
	

}
