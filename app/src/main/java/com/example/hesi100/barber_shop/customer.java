package com.example.hesi100.barber_shop;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hesi100 on 2/9/2018.
 */

public class customer {
    String name;
    String date;
    String time;
    String modelmo;
    String modelrish;
    String reservation;
    String timespend;
    boolean shost;
    int hazine;
    String id;
    String phone;
    customer(String id,String name,String date,String time,String reservation)
    {
        this.reservation=reservation;
        this.id=id;
        this.date=date;
        this.name=name;
        this.time=time;

    }
    public void setOthers(String id)
    {
        modelmo="بوکسری";
        modelrish="ساده";
        shost=true;
        timespend="45";
        hazine=19000;
    }
    public void getinforeserv(String idreserve) throws JSONException {
        JSONObject jsonObject = null;
        modelmo=jsonObject.getString("mo");
        modelrish=jsonObject.getString("rish");
        shost=jsonObject.getBoolean("shost");
        timespend=jsonObject.getString("time");
        hazine=jsonObject.getInt("hazine");

    }
}
