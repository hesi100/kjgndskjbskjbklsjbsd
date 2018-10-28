package com.example.hesi100.barber_shop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hesi100 on 8/27/2017.
 */

public class adapter_today extends RecyclerView.Adapter<adapter_today.myViewHolder> {
    Context context;
    List<customer> cust;

    public adapter_today(Context context,List<customer> c)
    {
        cust=c;
        this.context=context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_today_customer, parent  , false);
        return new myViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {
        holder.customername.setText(cust.get(position).name);
        holder.time.setText(cust.get(position).time);
        holder.date.setText(cust.get(position).date);
        holder.customer_reserve.setText(cust.get(position).reservation);
        LinearLayout b = (LinearLayout) holder.itemView.findViewById(R.id.li);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context , customer_detail.class);
                intent.putExtra("id",cust.get(position).id);
                intent.putExtra("name",cust.get(position).name);
                intent.putExtra("time",cust.get(position).time);
                intent.putExtra("date",cust.get(position).date);
                intent.putExtra("reservation",cust.get(position).reservation);//today
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });



    }
    public int getItemCount() {
        return cust.size();
    }

    static class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView customername;
        TextView time;
        TextView date;
        TextView customer_reserve;
        myViewHolder(View itemView) {

            super(itemView);
            customername= (TextView) itemView.findViewById(R.id.customername);
            time=(TextView) itemView.findViewById(R.id.time);
            date=(TextView) itemView.findViewById(R.id.date);
            customer_reserve= (TextView) itemView.findViewById(R.id.customer_reserve);
        }
    }

}