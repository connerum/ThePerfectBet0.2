package edu.bsu.cs222.theperfectbet;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class GameParser{
    public JSONArray gameJsonArray;
    public void gamesJson(InputStream inputStream) throws IOException {
        JSONArray gamesJsonObject = JsonPath.read(inputStream, "$");
        this.gameJsonArray = gamesJsonObject;
    }
    public ArrayList<String> HomeTeams() {
        JSONArray homeTeamArray = JsonPath.read(gameJsonArray, "$..home_team");
        int listLength = homeTeamArray.size();
        ArrayList<String> homeTeamList = new ArrayList<>();

        for (int i = 0; i < listLength; i++) {
            homeTeamList.add(homeTeamArray.get(i).toString());
        }
        return homeTeamList;
    }


    //Parses the Inputstream and Returns all the Away Teams as an ArrayList
    public ArrayList<String> AwayTeams() {
        JSONArray awayTeamArray = JsonPath.read(gameJsonArray, "$..away_team");
        int listLength = awayTeamArray.size();
        ArrayList<String> awayTeamList = new ArrayList<>();

        for (int i = 0; i < listLength; i++) {
            awayTeamList.add(awayTeamArray.get(i).toString());
        }
        return awayTeamList;
    }


    //Parses the Inputstream and Returns all the Game IDs for the selected sport as an ArrayList
    public ArrayList<String> GameId() {
        JSONArray gameIdArray = JsonPath.read(gameJsonArray, "$..id");
        int listLength = gameIdArray.size();
        ArrayList<String> gameIdList = new ArrayList<>();

        for (int i = 0; i < listLength; i++) {
            gameIdList.add(gameIdArray.get(i).toString());
        }
        return gameIdList;
    }
}



