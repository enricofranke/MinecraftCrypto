package de.enrico.minecraftcrypto.rest;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;



public class getCryptoCurrencys {


    public static void main(String[] args) throws Exception {
        System.out.println(getCurrency("Xrp"));
    }


        public static String getCurrency(String URL) throws Exception {
            URL url = new URL("https://api.nomics.com/v1/currencies/ticker?key=demo-b5d84e505a11969a7184f899fbb40ae1&ids="+URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            
            in.close();
            con.disconnect();

            return "tets";

        }

}
