package com.ct.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CricketTeams {
	@Id
	private long cricketTeamsId;
	private String cricketTeamsName;
	private int cricketTeamsBudget;

}
