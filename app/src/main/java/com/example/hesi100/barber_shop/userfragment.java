package com.example.hesi100.barber_shop;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class userfragment extends Fragment {
    public userfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_userfragment, container, false);
        LinearLayout my_wallet= (LinearLayout) v.findViewById(R.id.my_wallet);
        LinearLayout support= (LinearLayout) v.findViewById(R.id.support);
        LinearLayout setting= (LinearLayout) v.findViewById(R.id.setting);
        LinearLayout my_service= (LinearLayout) v.findViewById(R.id.my_service);
        LinearLayout work_days= (LinearLayout) v.findViewById(R.id.work_days);
        LinearLayout requests= (LinearLayout) v.findViewById(R.id.requests);
        LinearLayout exit= (LinearLayout) v.findViewById(R.id.exit);
        LinearLayout info= (LinearLayout) v.findViewById(R.id.info);
        LinearLayout frag= (LinearLayout) v.findViewById(R.id.frag);
        ImageView home= (ImageView) v.findViewById(R.id.home);
        LinearLayout setting_back= (LinearLayout) v.findViewById(R.id.setting_back);
        setting_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),changeback.class);
                startActivity(intent);
            }
        });
        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), requests.class);
                startActivity(intent);
            }
        });
        requests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                    Intent intent = new Intent(v.getContext(), requests.class);
                    startActivity(intent);
            }
        });
        my_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                    Intent intent = new Intent(v.getContext(), my_wallet.class);
                    startActivity(intent);

            }
        });
        work_days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), work_days.class);
                    startActivity(intent);


            }
        });
        my_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), my_service.class);
                    startActivity(intent);


            }
        });
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), support.class);
                    startActivity(intent);


            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), main.class);
                    startActivity(intent);


            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), setting.class);
                    startActivity(intent);


            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), login.class);
                startActivity(intent);
            }

        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), info.class);
                    startActivity(intent);

            }
        });
        // Inflate the layout for this fragment
        return v;

    }

}