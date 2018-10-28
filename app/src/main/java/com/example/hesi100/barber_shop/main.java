package com.example.hesi100.barber_shop;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mohamadamin.persianmaterialdatetimepicker.date.DatePickerDialog;
import com.mohamadamin.persianmaterialdatetimepicker.utils.PersianCalendar;

import java.util.ArrayList;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class main extends AppCompatActivity {
    TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<customer> list=getcustomer();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycle_customer);
        final adapter_today adapter = new adapter_today(getApplicationContext(),list);
        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);
        recyclerView.setAdapter(adapter);
        date= (TextView) findViewById(R.id.tarikh);
        settoday();
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
        final ImageView back= (ImageView) findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
    }
    public List<customer> getcustomer()
    {
        List<customer> list=new ArrayList<>();
        customer c1=new customer("1","حسام","1397/4/15","14:00","request");
        customer c2=new customer("2","علی","1397/4/15","18:00","confirm");
        list.add(c1);
        list.add(c2);
        return list;
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    public void setdate(View view)
    {
            final PersianCalendar now = new PersianCalendar();
            final DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
            Toast.makeText(main.this, "" + year + "/" + monthOfYear + "/" + dayOfMonth, Toast.LENGTH_SHORT).show();
            String dat="" + year + "/" + monthOfYear + "/" + dayOfMonth;
            date.setText(dat);
            }
            }, now.getPersianYear(),
                    now.getPersianMonth(),
                    now.getPersianDay());
            datePickerDialog.setThemeDark(true);
            datePickerDialog.show(getFragmentManager(), "tpd");
            datePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialogInterface) {
                    Log.d("TimePicker", "Dialog was cancelled");
                }
            });

        }
        public void settoday()
        {
            final PersianCalendar now = new PersianCalendar();
            int mYear = now.getPersianYear();
            int mMonth = now.getPersianMonth()+1;
            int mDay = now.getPersianDay();
            date.setText("" + mYear + "/" + mMonth + "/" + mDay);

        }

    @Override
    protected void onResume() {
        super.onResume();
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
    }
}
