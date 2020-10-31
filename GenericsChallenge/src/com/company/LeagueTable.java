package com.company;

import java.util.ArrayList;
import com.sun.net.httpserver.HttpServer;
import org.w3c.dom.Node;

import java.util.Collections;

public class LeagueTable<T extends Team> {

    Node node = null;
    private final ArrayList<T> leaderboard;

    public LeagueTable() {
        this.leaderboard = new ArrayList<>();
    }

    public void addTeam(T team) {
        this.leaderboard.add(team);
    }

    public void printTeams() {
        Collections.sort(leaderboard);
        for (T i : this.leaderboard) {
            System.out.println(i.getName());
        }
    }
}
