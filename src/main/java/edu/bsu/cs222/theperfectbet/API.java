package edu.bsu.cs222.theperfectbet;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class API {
    public InputStream activeSports() {
        String ApiUrl = "https://api.the-odds-api.com/v4/sports?apiKey=2446fc3219989c3e2fe587845e6ed627";
        try {
            URL url = new URL(ApiUrl);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            return inputStream;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InputStream activeGames(String sportChoice) {
        String BaseApiUrl = "https://api.the-odds-api.com/v4/sports/";
        String EndApiUrl = "/odds/?apiKey=2446fc3219989c3e2fe587845e6ed627&regions=us&markets=h2h&bookmakers=draftkings,spreads&oddsFormat=american";
        String CombinedUrl = BaseApiUrl + sportChoice + EndApiUrl;
        try {
            URL url = new URL(CombinedUrl);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            return inputStream;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public InputStream activeOdds(String Sport, String GameId) {
        String BaseApiUrl = "https://api.the-odds-api.com/v4/sports/";
        String MidApiUrl = "/odds/?apiKey=2446fc3219989c3e2fe587845e6ed627&regions=us&markets=h2h&bookmakers=draftkings,spreads&eventIds=";
        String EndApiUrl = "&oddsFormat=american";
        String CombinedUrl = BaseApiUrl + Sport + MidApiUrl + GameId + EndApiUrl;
        try {
            URL url = new URL(CombinedUrl);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            return inputStream;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
