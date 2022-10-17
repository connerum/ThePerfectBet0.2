package edu.bsu.cs222.theperfectbet;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class SportsParser {

    //Parses the Inputstream and Returns the available in-season sports(excluding golf) as an ArrayList
    public ArrayList<String> sports(InputStream inputStream) throws IOException {
        JSONArray sportsArray = JsonPath.read(inputStream, "$..group");
        int listLength = sportsArray.size();
        ArrayList<String> sportsList = new ArrayList<>();

        for(int i=0; i < listLength; i++){
            if( !sportsList.contains(sportsArray.get(i)) ){
                sportsList.add(sportsArray.get(i).toString());
            }
        }
        sportsList.remove("Golf");
        return sportsList;
    }
}