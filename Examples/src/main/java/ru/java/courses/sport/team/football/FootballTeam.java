package ru.java.courses.sport.team.football;

import ru.java.courses.sport.Coach;
import ru.java.courses.sport.team.Team;
import java.util.List;
import java.util.ArrayList;

public class FootballTeam extends Team<FootballPlayer> {

    private Coach valera = new Coach("ValeraPoshly", 19);

    private List<Team> players = new ArrayList<Team>();

    public static final int MAX_PLAYERS_COUNT = 20;



    public FootballTeam(String name) {
        super(name);
    }


    @Override
    public int getMaxPlayersCount() {
        return MAX_PLAYERS_COUNT;
    }
}