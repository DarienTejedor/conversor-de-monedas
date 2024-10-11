package com.darien.conversor.principal;
import com.google.gson.Gson;
import java.util.Map;

public class JSONobj {
    public static double parseRate(String json, String toCurrency) {
        Gson gson = new Gson();
        gson.fromJson(json);
    }
}