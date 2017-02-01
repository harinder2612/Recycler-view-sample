package com.harinder.recycler;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by WIN8.1 on 24-01-2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    ArrayList<object> pArray;
    public adapter(ArrayList<object> mArray) {
        pArray=mArray;
    }

    @Override
    public adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardlayout, parent, false);

        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(adapter.MyViewHolder holder, int position) {
     object ob=pArray.get(position);
        holder.t1.setText(ob.getName());
        holder.cardView.setCardBackgroundColor(ob.getCol());
        Log.d("color_report", "onBindViewHolder: "+ob.getCol());
    }

    @Override
    public int getItemCount() {
       return pArray.size();
    }





    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView t1;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1= (TextView) itemView.findViewById(R.id.name);
            cardView= (CardView) itemView.findViewById(R.id.card_view);
        }
    }
}
