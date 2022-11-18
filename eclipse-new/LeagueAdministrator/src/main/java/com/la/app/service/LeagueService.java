package com.la.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.la.app.model.League;

@Service
public class LeagueService {
    private static List<League> leagues = new ArrayList<League>();
    private static int leagueCount = 3;

    static {
        leagues.add(new League(1, "in28Minutes", "Learn Spring MVC", new Date(),
                false));
        leagues.add(new League(2, "in28Minutes", "Learn Struts", new Date(), false));
        leagues.add(new League(3, "in28Minutes", "Learn Hibernate", new Date(),
                false));
    }

    public List<League> retrieveLeagues(String user) {
        List<League> filteredLeagues = new ArrayList<League>();
        for (League league : leagues) {
            if (league.getUser().equalsIgnoreCase(user)) {
                filteredLeagues.add(league);
            }
        }
        return filteredLeagues;
    }
    
    public League retrieveLeague(int id) {
        for (League league : leagues) {
            if (league.getId()==id) {
                return league;
            }
        }
        return null;
    }

    public void updateLeague(League league){
    		leagues.remove(league);
    		leagues.add(league);
    }

    public void addLeague(String name, String desc, Date targetDate,
            boolean isDone) {
        leagues.add(new League(++leagueCount, name, desc, targetDate, isDone));
    }

    public void deleteLeague(int id) {
        Iterator<League> iterator = leagues.iterator();
        while (iterator.hasNext()) {
            League league = iterator.next();
            if (league.getId() == id) {
                iterator.remove();
            }
        }
    }
}
