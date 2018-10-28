package com.example.hesi100.barber_shop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class customer_detail extends AppCompatActivity {
    TextView cust_name;
    TextView time;
    TextView date;
    TextView modelmo;
    TextView modelrish;
    CheckBox wash;
    TextView reserve;
    EditText worktime;
    Button button;
    Button buttonlaghv;
    TextView end_time;
    LinearLayout reject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);
        cust_name= (TextView) findViewById(R.id.cust_name);
        reject= (LinearLayout) findViewById(R.id.lay_reject);
        time= (TextView) findViewById(R.id.time);
        date= (TextView) findViewById(R.id.date);
        modelmo= (TextView) findViewById(R.id.modelmo);
        modelrish= (TextView) findViewById(R.id.modelrish);
        wash= (CheckBox) findViewById(R.id.wash);
        reserve= (TextView) findViewById(R.id.reserve);
        worktime= (EditText) findViewById(R.id.worktime);
        end_time= (TextView) findViewById(R.id.end_time);
        button= (Button) findViewById(R.id.button);
        buttonlaghv= (Button) findViewById(R.id.buttonlaghv);
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        String id= b.getString("id","");
        String name=b.getString("name");
        String begin_time=b.getString("time");
        String date_cust=b.getString("date");
        String reserv=b.getString("reservation");
        customer c=new customer(id,name,date_cust,begin_time,reserv);
        c.setOthers(id);
        cust_name.setText(name);
        time.setText(begin_time);
        date.setText(date_cust);
        reserve.setText(reserv);
        modelrish.setText(c.modelrish);
        modelmo.setText(c.modelmo);
        wash.setChecked(c.shost);
        switch (reserv) {
            case "request" :
                button.setText(" تایید ");
                reject.setVisibility(View.VISIBLE);
                buttonlaghv.setVisibility(View.VISIBLE);
                reserve.setText(" در انتظار تایید ");
                break;
            case "confirm" :
                worktime.setEnabled(false);
                button.setText(" اتمام ");
                reserve.setText(" اصلاح نشده ");
                worktime.setText(c.timespend);
                break;
            case "finish" :
                worktime.setEnabled(false);
                button.setText(" ok ");
                reserve.setText(" اصلاح شده ");
                worktime.setText(c.timespend);
                break;
        }
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
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    @Override
    protected void onResume() {
        super.onResume();
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));

    }
}
