package edu.bsu.cs222.theperfectbet;

public class SportsNameFormatter {

    //Reformats the selected sport name to be able to work through the API url and returns as String
    public String NameReformatted(String userChoice) {
        if (userChoice.contains("American Football")) {
            return "americanfootball";
        }
        else if (userChoice.contains("Baseball")){
            return "baseball_mlb";
        }
        else if (userChoice.contains("Ice Hockey")) {
            return "icehockey";
        }
        else if (userChoice.contains("Mixed Martial Arts")) {
            return "mma_mixed_martial_arts";
        }
        else {
            return userChoice;
        }
    }
}
