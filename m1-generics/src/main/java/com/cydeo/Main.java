package com.cydeo;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer(("Pat"));
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //  Team liverpool = new Team("Liverpool");// Team accepting any object which I don't want
        // we will use generic
        Team<SoccerPlayer> liverpool = new Team("Liverpool");
        // liverpool.addPlayer(joe);
        // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        // Team<String> brokenTeam = new Team<>("what kind of team is this?");
        // T accept any class if you do like this <T>
        // Team<Integer> t2 = new Team<>("Very weird");
        // T accept any class if you do like this <T>

    }
}


