package com.ctp.vo;

import com.ctp.entity.CricketTeamPlayers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	private CricketTeams ct;
    private CricketTeamPlayers ctp;
	}
