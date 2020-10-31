package com.company;

public class Main {

    public static void main(String[] args) {
        LeagueTable<Team> ncaa = new LeagueTable<>();
        ncaa.addTeam(new Team("Texas Longhorns"));
        ncaa.addTeam(new Team("Oklahoma Sooners"));
        ncaa.printTeams();
    }
}
