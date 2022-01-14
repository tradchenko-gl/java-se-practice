import section10.challenge.FootballPlayer;
import section10.challenge.League;
import section10.challenge.Team;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> ukraineLeague = new League<>("First One");
        Team<FootballPlayer> dinamo = new Team<>("Dinamo");
        Team<FootballPlayer> shachtar = new Team<>("Shachtar");
        Team<FootballPlayer> metallist = new Team<>("Metallist");

        ukraineLeague.addTeam(dinamo);
        ukraineLeague.addTeam(shachtar);
        ukraineLeague.addTeam(metallist);

        dinamo.matchResult(shachtar, 3, 2);
        dinamo.matchResult(metallist, 1, 1);
        shachtar.matchResult(metallist, 2, 0);

        ukraineLeague.printTeams();

    }
}
