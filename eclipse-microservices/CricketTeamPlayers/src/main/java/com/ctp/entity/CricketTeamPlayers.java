package com.ctp.entity;

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
public class CricketTeamPlayers {
	@Id
	private @Getter @Setter long playerId;
	private @Getter @Setter String playerName;
	private @Getter @Setter int playerAge;
	private @Getter @Setter String playerType;
	private @Getter @Setter double playerBiddingAmount;
	private @Getter @Setter long cricketTeamsId;
}
