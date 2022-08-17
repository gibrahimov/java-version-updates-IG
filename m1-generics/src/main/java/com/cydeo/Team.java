package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player>{
// so general idea is I want Team only accept from class Player.
    // <T> is generic T - can be soccer player, football player , baseball player
    // if just <SoccerPlayer> instead of <T>, then this will accept soccer-player only
    //if <T> then this T is any class, any class you can pass( Like String, Integer, SoccerPlayer etc
    //our T should accept only Player class and subclasses(soccer, baseball and football
    //that's why instead of <T> we do <T extends Player>
    //T should be child class of Player classes
    //So this is the generic we need to know
// So we are putting type restriction on class or interface with<>
    private String name;
    private List<T>members = new ArrayList<T>();
// so general idea is I want Team only accept from class Player and when I store into List I want to
//store only from Player class

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(((Player)player).getName() + "picked for team" + this.name);
            return true;
        }
    }

}