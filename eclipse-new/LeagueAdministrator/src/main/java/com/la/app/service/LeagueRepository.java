package com.la.app.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.la.app.model.League;

public interface LeagueRepository extends JpaRepository<League, Integer>{
	List<League> findByUser(String user);
}

