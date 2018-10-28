package com.example.hesi100.barber_shop;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class my_service extends AppCompatActivity {
    List<Service> listhair;
    List<Service> listbarber;
    RecyclerView recyclerView;
    RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_service);
        listhair=gethair();
        recyclerView= (RecyclerView) findViewById(R.id.recycle_hair);
        final adapter_hair adapter = new adapter_hair(getApplicationContext(),listhair);
        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);
        recyclerView.setAdapter(adapter);
        recyclerView1= (RecyclerView) findViewById(R.id.recycle_rish);
        listbarber=getbarber();
        final adapter_hair adapterbarber = new adapter_hair(getApplicationContext(),listbarber);
        LinearLayoutManager mLinearLayoutManagerVertical1 = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManagerVertical1.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(mLinearLayoutManagerVertical1);
        recyclerView1.setAdapter(adapterbarber);
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
    public List<Service> gethair()
    {
        List<Service> list=new ArrayList<>();
        Service c1=new Service(" دیزلی ","5000");
        Service c2=new Service(" آلمانی ","4000");
        Service c3=new Service("","");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        return list;
    }
    public List<Service> getbarber()
    {
        List<Service> list=new ArrayList<>();
        Service c1=new Service(" پروفسوری ","2000");
        Service c2=new Service(" ته ریش ","1000");
        Service c3=new Service("","");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        return list;
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    public void addmo(View v)
    {
        listhair.add(new Service("",""));
        final adapter_hair adapter = new adapter_hair(getApplicationContext(),listhair);
        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);
        recyclerView.setAdapter(adapter);
    }
    public void addrish(View v)
    {
        listbarber.add(new Service("",""));
        final adapter_hair adapterbarber = new adapter_hair(getApplicationContext(),listbarber);
        LinearLayoutManager mLinearLayoutManagerVertical1 = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManagerVertical1.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(mLinearLayoutManagerVertical1);
        recyclerView1.setAdapter(adapterbarber);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Setting_person.setTheme((LinearLayout) findViewById(R.id.background));
    }
}
