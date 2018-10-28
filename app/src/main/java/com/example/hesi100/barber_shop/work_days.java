package com.example.hesi100.barber_shop;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import org.json.JSONException;

import java.util.Calendar;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class work_days extends AppCompatActivity {
    View vi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_days);
        final ImageView back= (ImageView) findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView im= (ImageView) findViewById(R.id.navigation);
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.mDrawerLayout);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    mDrawerLayout.closeDrawer(Gravity.RIGHT);
                } else {
                    mDrawerLayout.openDrawer(Gravity.RIGHT);
                }
            }
        });
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
        //setwork();
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void settime(View v) {
        // TODO Auto-generated method stub
        begirV(v);
        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(work_days.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                String minute;
                if(selectedMinute<10)
                {
                    minute="0"+selectedMinute;
                }
                else
                {
                    minute=""+selectedMinute;
                }

                String s=""+selectedHour+" : "+minute;
                setwhichtext(bedeV(),s);

            }
        }, hour, minute, true);//Yes 24 hour time
        mTimePicker.setTitle("زمان خود را انتخاب کنید.");
        mTimePicker.show();

    }



    public void begirV(View v)
    {
        vi=v;
    }
    public View bedeV()
    {
        return vi;
    }
    public void setwhichtext(View v,String s)
    {
        TextView t;
        switch (v.getId()) {
            case R.id.saturday_shift1_1:
                t = (TextView) findViewById(R.id.saturday_shift1_1);
                t.setText(s);
                break;
            case R.id.saturday_shift1_2:
                t = (TextView) findViewById(R.id.saturday_shift1_2);
                t.setText(s);
                break;
            case R.id.saturday_shift2_1:
                t = (TextView) findViewById(R.id.saturday_shift2_1);
                t.setText(s);
                break;
            case R.id.saturday_shift2_2:
                t = (TextView) findViewById(R.id.saturday_shift2_2);
                t.setText(s);
                break;
            case R.id.sunday_shift1_1:
                t = (TextView) findViewById(R.id.sunday_shift1_1);
                t.setText(s);
                break;
            case R.id.sunday_shift1_2:
                t = (TextView) findViewById(R.id.sunday_shift1_2);
                t.setText(s);
                break;
            case R.id.sunday_shift2_1:
                t = (TextView) findViewById(R.id.sunday_shift2_1);
                t.setText(s);
                break;
            case R.id.sunday_shift2_2:
                t = (TextView) findViewById(R.id.sunday_shift2_2);
                t.setText(s);
                break;
            case R.id.monday_shift1_1:
                t = (TextView) findViewById(R.id.monday_shift1_1);
                t.setText(s);
                break;
            case R.id.monday_shift1_2:
                t = (TextView) findViewById(R.id.monday_shift1_2);
                t.setText(s);
                break;
            case R.id.monday_shift2_1:
                t = (TextView) findViewById(R.id.monday_shift2_1);
                t.setText(s);
                break;
            case R.id.monday_shift2_2:
                t = (TextView) findViewById(R.id.monday_shift2_2);
                t.setText(s);
                break;
            case R.id.tuesday_shift1_1:
                t = (TextView) findViewById(R.id.tuesday_shift1_1);
                t.setText(s);
                break;
            case R.id.tuesday_shift1_2:
                t = (TextView) findViewById(R.id.tuesday_shift1_2);
                t.setText(s);
                break;
            case R.id.tuesday_shift2_1:
                t = (TextView) findViewById(R.id.tuesday_shift2_1);
                t.setText(s);
                break;
            case R.id.tuesday_shift2_2:
                t = (TextView) findViewById(R.id.tuesday_shift2_2);
                t.setText(s);
                break;
            case R.id.wednesday_shift1_1:
                t = (TextView) findViewById(R.id.wednesday_shift1_1);
                t.setText(s);
                break;
            case R.id.wednesday_shift1_2:
                t = (TextView) findViewById(R.id.wednesday_shift1_2);
                t.setText(s);
                break;
            case R.id.wednesday_shift2_1:
                t = (TextView) findViewById(R.id.wednesday_shift2_1);
                t.setText(s);
                break;
            case R.id.wednesday_shift2_2:
                t = (TextView) findViewById(R.id.wednesday_shift2_2);
                t.setText(s);
                break;
            case R.id.thursday_shift1_1:
                t = (TextView) findViewById(R.id.thursday_shift1_1);
                t.setText(s);
                break;
            case R.id.thursday_shift1_2:
                t = (TextView) findViewById(R.id.thursday_shift1_2);
                t.setText(s);
                break;
            case R.id.thursday_shift2_1:
                t = (TextView) findViewById(R.id.thursday_shift2_1);
                t.setText(s);
                break;
            case R.id.thursday_shift2_2:
                t = (TextView) findViewById(R.id.thursday_shift2_2);
                t.setText(s);
                break;
            case R.id.friday_shift1_1:
                t = (TextView) findViewById(R.id.friday_shift1_1);
                t.setText(s);
                break;
            case R.id.friday_shift1_2:
                t = (TextView) findViewById(R.id.friday_shift1_2);
                t.setText(s);
                break;
            case R.id.friday_shift2_1:
                t = (TextView) findViewById(R.id.friday_shift2_1);
                t.setText(s);
                break;
            case R.id.friday_shift2_2:
                t = (TextView) findViewById(R.id.friday_shift2_2);
                t.setText(s);
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
    }
    public void setwork() throws JSONException {
        TextView sat1;
        TextView sat2;
        TextView sat3;
        TextView sat4;
        TextView sun1;
        TextView sun2;
        TextView sun3;
        TextView sun4;
        TextView mon1;
        TextView mon2;
        TextView mon3;
        TextView mon4;
        TextView thue1;
        TextView thue2;
        TextView thue3;
        TextView thue4;
        TextView wed1;
        TextView wed2;
        TextView wed3;
        TextView wed4;
        TextView thu1;
        TextView thu2;
        TextView thu3;
        TextView thu4;
        TextView fri1;
        TextView fri2;
        TextView fri3;
        TextView fri4;
        sat1= (TextView) findViewById(R.id.saturday_shift1_1);
        sat2= (TextView) findViewById(R.id.saturday_shift1_2);
        sat3= (TextView) findViewById(R.id.saturday_shift2_1);
        sat4= (TextView) findViewById(R.id.saturday_shift2_2);
        sun1= (TextView) findViewById(R.id.sunday_shift1_1);
        sun2= (TextView) findViewById(R.id.sunday_shift1_2);
        sun3= (TextView) findViewById(R.id.sunday_shift2_1);
        sun4= (TextView) findViewById(R.id.sunday_shift2_2);
        mon1= (TextView) findViewById(R.id.monday_shift1_1);
        mon2= (TextView) findViewById(R.id.monday_shift1_2);
        mon3= (TextView) findViewById(R.id.monday_shift2_1);
        mon4= (TextView) findViewById(R.id.monday_shift2_2);
        thue1= (TextView) findViewById(R.id.tuesday_shift1_1);
        thue2= (TextView) findViewById(R.id.tuesday_shift1_2);
        thue3= (TextView) findViewById(R.id.tuesday_shift2_1);
        thue4= (TextView) findViewById(R.id.tuesday_shift2_2);
        wed1= (TextView) findViewById(R.id.wednesday_shift1_1);
        wed2= (TextView) findViewById(R.id.wednesday_shift1_2);
        wed3= (TextView) findViewById(R.id.wednesday_shift2_1);
        wed4= (TextView) findViewById(R.id.wednesday_shift2_2);
        thu1= (TextView) findViewById(R.id.thursday_shift1_1);
        thu2= (TextView) findViewById(R.id.thursday_shift1_2);
        thu3= (TextView) findViewById(R.id.thursday_shift2_1);
        thu4= (TextView) findViewById(R.id.thursday_shift2_2);
        fri1= (TextView) findViewById(R.id.friday_shift1_1);
        fri2= (TextView) findViewById(R.id.friday_shift1_2);
        fri3= (TextView) findViewById(R.id.friday_shift2_1);
        fri4= (TextView) findViewById(R.id.friday_shift2_2);
        getclasses.setworkdays( sat1,  sat2,  sat3,  sat4,  sun1,  sun2,  sun3,  sun4,  mon1,  mon2,  mon3,  mon4,  thue1,  thue2,  thue3,  thue4,  wed1,  wed2,  wed3,  wed4,  thu1,  thu2,  thu3,  thu4,  fri1,  fri2,  fri3,  fri4);
    }
    public void sendworktime() throws JSONException {
        TextView sat1;
        TextView sat2;
        TextView sat3;
        TextView sat4;
        TextView sun1;
        TextView sun2;
        TextView sun3;
        TextView sun4;
        TextView mon1;
        TextView mon2;
        TextView mon3;
        TextView mon4;
        TextView thue1;
        TextView thue2;
        TextView thue3;
        TextView thue4;
        TextView wed1;
        TextView wed2;
        TextView wed3;
        TextView wed4;
        TextView thu1;
        TextView thu2;
        TextView thu3;
        TextView thu4;
        TextView fri1;
        TextView fri2;
        TextView fri3;
        TextView fri4;
        sat1= (TextView) findViewById(R.id.saturday_shift1_1);
        sat2= (TextView) findViewById(R.id.saturday_shift1_2);
        sat3= (TextView) findViewById(R.id.saturday_shift2_1);
        sat4= (TextView) findViewById(R.id.saturday_shift2_2);
        sun1= (TextView) findViewById(R.id.sunday_shift1_1);
        sun2= (TextView) findViewById(R.id.sunday_shift1_2);
        sun3= (TextView) findViewById(R.id.sunday_shift2_1);
        sun4= (TextView) findViewById(R.id.sunday_shift2_2);
        mon1= (TextView) findViewById(R.id.monday_shift1_1);
        mon2= (TextView) findViewById(R.id.monday_shift1_2);
        mon3= (TextView) findViewById(R.id.monday_shift2_1);
        mon4= (TextView) findViewById(R.id.monday_shift2_2);
        thue1= (TextView) findViewById(R.id.tuesday_shift1_1);
        thue2= (TextView) findViewById(R.id.tuesday_shift1_2);
        thue3= (TextView) findViewById(R.id.tuesday_shift2_1);
        thue4= (TextView) findViewById(R.id.tuesday_shift2_2);
        wed1= (TextView) findViewById(R.id.wednesday_shift1_1);
        wed2= (TextView) findViewById(R.id.wednesday_shift1_2);
        wed3= (TextView) findViewById(R.id.wednesday_shift2_1);
        wed4= (TextView) findViewById(R.id.wednesday_shift2_2);
        thu1= (TextView) findViewById(R.id.thursday_shift1_1);
        thu2= (TextView) findViewById(R.id.thursday_shift1_2);
        thu3= (TextView) findViewById(R.id.thursday_shift2_1);
        thu4= (TextView) findViewById(R.id.thursday_shift2_2);
        fri1= (TextView) findViewById(R.id.friday_shift1_1);
        fri2= (TextView) findViewById(R.id.friday_shift1_2);
        fri3= (TextView) findViewById(R.id.friday_shift2_1);
        fri4= (TextView) findViewById(R.id.friday_shift2_2);
        getclasses.sendworkdays( sat1,  sat2,  sat3,  sat4,  sun1,  sun2,  sun3,  sun4,  mon1,  mon2,  mon3,  mon4,  thue1,  thue2,  thue3,  thue4,  wed1,  wed2,  wed3,  wed4,  thu1,  thu2,  thu3,  thu4,  fri1,  fri2,  fri3,  fri4);
        finish();
    }
}
