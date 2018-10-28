package com.example.hesi100.barber_shop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }
    public void signin(View view)
    {
        Intent intent=new Intent(this,main.class);
        startActivity(intent);
    }
    public void forgotpass(View view)
    {
        Intent intent=new Intent(this,forgot_pass.class);
        startActivity(intent);
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
