package com.ct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.entity.CricketTeams;

@Repository
public interface CricketTeamsRepository extends JpaRepository<CricketTeams, Long> {

	CricketTeams findByCricketTeamsId(Long ct_id);

	CricketTeams findByCricketTeamsName(String ct_name);

}
