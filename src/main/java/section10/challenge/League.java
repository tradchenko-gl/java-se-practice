package section10.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    private String leagueName;

    private ArrayList<T> teams = new ArrayList<>();


    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("Team " + team + " is already in the league");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void printTeams () {
        Collections.sort(teams);
        for (T team : teams) {
            System.out.println(team.getName() + ": " + team.ranking()) ;
        }
    }
}
