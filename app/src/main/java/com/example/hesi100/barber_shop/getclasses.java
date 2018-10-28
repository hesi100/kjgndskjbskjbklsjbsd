package com.example.hesi100.barber_shop;

import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hesi100 on 6/24/2018.
 */

public class getclasses {
    public static List<customer> setcustomer(int id)
    {
        JSONObject jsonObject=null;
        List <customer> customers;
        JSONObject jcustomer;
        customers = new ArrayList<>();
        int i=0;

        try {
            jcustomer=jsonObject.getJSONObject("customer0");
            while(jcustomer!=null)
            {
                customer b=new customer(jcustomer.getString("id"), jcustomer.getString("name") , jcustomer.getString("date") , jcustomer.getString("time") , jcustomer.getString("reservation") );
                customers.add(b);
                i++;
                jcustomer=jsonObject.getJSONObject("customer"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return customers;
    }
    public static List<customer> setcustomerotherday(int id,String day)
    {
        JSONObject jsonObject=null;
        List <customer> customers;
        JSONObject jcustomer;
        customers = new ArrayList<>();
        int i=0;

        try {
            jcustomer=jsonObject.getJSONObject("customer0");
            while(jcustomer!=null)
            {
                customer b=new customer(jcustomer.getString("id"), jcustomer.getString("name") , jcustomer.getString("date") , jcustomer.getString("time") , jcustomer.getString("reservation") );
                customers.add(b);
                i++;
                jcustomer=jsonObject.getJSONObject("customer"+i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return customers;
    }
    public static void setworkdays(TextView sat1, TextView sat2, TextView sat3, TextView sat4, TextView sun1, TextView sun2, TextView sun3, TextView sun4, TextView mon1, TextView mon2, TextView mon3, TextView mon4, TextView thue1, TextView thue2, TextView thue3, TextView thue4, TextView wed1, TextView wed2, TextView wed3, TextView wed4, TextView thu1, TextView thu2, TextView thu3, TextView thu4, TextView fri1, TextView fri2, TextView fri3, TextView fri4) throws JSONException {
        if(Internet.isInternetOn()) {
            JSONObject jsonObject = null;
            sat1.setText(jsonObject.getString("saturday_shift1_1"));
            sat2.setText(jsonObject.getString("saturday_shift1_2"));
            sat3.setText(jsonObject.getString("saturday_shift2_1"));
            sat4.setText(jsonObject.getString("saturday_shift2_2"));
            sun1.setText(jsonObject.getString("sunday_shift1_1"));
            sun2.setText(jsonObject.getString("sunday_shift1_2"));
            sun3.setText(jsonObject.getString("sunday_shift2_1"));
            sun4.setText(jsonObject.getString("sunday_shift2_2"));
            mon1.setText(jsonObject.getString("monday_shift1_1"));
            mon2.setText(jsonObject.getString("monday_shift1_2"));
            mon3.setText(jsonObject.getString("monday_shift2_1"));
            mon4.setText(jsonObject.getString("monday_shift2_2"));
            thue1.setText(jsonObject.getString("tuesday_shift1_1"));
            thue2.setText(jsonObject.getString("tuesday_shift1_2"));
            thue3.setText(jsonObject.getString("tuesday_shift2_1"));
            thue4.setText(jsonObject.getString("tuesday_shift2_2"));
            wed1.setText(jsonObject.getString("wednesday_shift1_1"));
            wed2.setText(jsonObject.getString("wednesday_shift1_2"));
            wed3.setText(jsonObject.getString("wednesday_shift2_1"));
            wed4.setText(jsonObject.getString("wednesday_shift2_2"));
            thu1.setText(jsonObject.getString("thursday_shift1_1"));
            thu2.setText(jsonObject.getString("thursday_shift1_2"));
            thu3.setText(jsonObject.getString("thursday_shift2_1"));
            thu4.setText(jsonObject.getString("thursday_shift2_2"));
            fri1.setText(jsonObject.getString("friday_shift1_1"));
            fri2.setText(jsonObject.getString("friday_shift1_2"));
            fri3.setText(jsonObject.getString("friday_shift2_1"));
            fri4.setText(jsonObject.getString("friday_shift2_2"));
        }
        else
        {
            Toast.makeText(app.context, "اینترنت خود را باز کنید", Toast.LENGTH_SHORT).show();
        }
    }
    public static void sendworkdays(TextView sat1, TextView sat2, TextView sat3, TextView sat4, TextView sun1, TextView sun2, TextView sun3, TextView sun4, TextView mon1, TextView mon2, TextView mon3, TextView mon4, TextView thue1, TextView thue2, TextView thue3, TextView thue4, TextView wed1, TextView wed2, TextView wed3, TextView wed4, TextView thu1, TextView thu2, TextView thu3, TextView thu4, TextView fri1, TextView fri2, TextView fri3, TextView fri4) throws JSONException
    {
        if (Internet.isInternetOn()) {
            JSONObject jsonObject = new JSONObject("work_days");
            jsonObject.put("saturday_shift1_1", sat1.getText().toString());
            jsonObject.put("saturday_shift1_2", sat2.getText().toString());
            jsonObject.put("saturday_shift2_1", sat3.getText().toString());
            jsonObject.put("saturday_shift2_2", sat4.getText().toString());
            jsonObject.put("sunday_shift1_1", sun1.getText().toString());
            jsonObject.put("sunday_shift1_2", sun2.getText().toString());
            jsonObject.put("sunday_shift2_1", sun3.getText().toString());
            jsonObject.put("sunday_shift2_2", sun4.getText().toString());
            jsonObject.put("monday_shift1_1", mon1.getText().toString());
            jsonObject.put("monday_shift1_2", mon2.getText().toString());
            jsonObject.put("monday_shift2_1", mon3.getText().toString());
            jsonObject.put("monday_shift2_2", mon4.getText().toString());
            jsonObject.put("tuesday_shift1_1", thue1.getText().toString());
            jsonObject.put("tuesday_shift1_2", thue2.getText().toString());
            jsonObject.put("tuesday_shift2_1", thue3.getText().toString());
            jsonObject.put("tuesday_shift2_2", thue4.getText().toString());
            jsonObject.put("wednesday_shift1_1", wed1.getText().toString());
            jsonObject.put("wednesday_shift1_2", wed2.getText().toString());
            jsonObject.put("wednesday_shift2_1", wed3.getText().toString());
            jsonObject.put("wednesday_shift2_2", wed4.getText().toString());
            jsonObject.put("thursday_shift1_1", thu1.getText().toString());
            jsonObject.put("thursday_shift1_2", thu2.getText().toString());
            jsonObject.put("thursday_shift2_1", thu3.getText().toString());
            jsonObject.put("thursday_shift2_2", thu4.getText().toString());
            jsonObject.put("friday_shift1_1", fri1.getText().toString());
            jsonObject.put("friday_shift1_2", fri2.getText().toString());
            jsonObject.put("friday_shift2_1", fri3.getText().toString());
            jsonObject.put("friday_shift2_2", fri4.getText().toString());
            //send
        }
        else
        {
            Toast.makeText(app.context, "اینترنت خود را باز کنید", Toast.LENGTH_SHORT).show();
        }
    }

}
