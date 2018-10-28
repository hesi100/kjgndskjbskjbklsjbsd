package com.example.hesi100.barber_shop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by hesi100 on 8/27/2017.
 */

public class adapter_hair extends RecyclerView.Adapter<adapter_hair.myViewHolder> {
    Context context;
    List<Service> service;

    public adapter_hair(Context context,List<Service> c)
    {
        service=c;
        this.context=context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_service, parent  , false);
        return new myViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {
        holder.model.setText(service.get(position).name, TextView.BufferType.EDITABLE);
        holder.cost.setText(""+service.get(position).cost, TextView.BufferType.EDITABLE);

        holder.minus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                service.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position,service.size());
                Toast.makeText(context,"Removed : ", Toast.LENGTH_SHORT).show();
            }
        });



    }
    public int getItemCount() {
        return service.size();
    }

    static class myViewHolder extends RecyclerView.ViewHolder
    {
        EditText model;
        EditText cost;

        ImageView minus;
        myViewHolder(View itemView) {

            super(itemView);
            model= (EditText) itemView.findViewById(R.id.model);
            cost= (EditText) itemView.findViewById(R.id.cost);

            minus= (ImageView) itemView.findViewById(R.id.minus);
            
        }
    }

}
