package com.harinder.recycler;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    String[] name={"H O M E","N E W S","B L O O D","H O S P I T A L", "P R O F I L E"};
        int [] col={0xFFFFBB33,0xFFFF605F,0xFF96D100,0xFF00A8FF,0xFFCF65F9};
        int [] img={R.drawable.home2,R.drawable.news,R.drawable.blood,R.drawable.hospital,R.drawable.profile};
        final ArrayList<object> mArray= new ArrayList<object>();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);
        LinearLayoutManager mlLinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        cardView= (CardView) findViewById(R.id.card_view);
               recyclerView.setLayoutManager(mlLinearLayoutManager);
        recyclerView.setHasFixedSize(true);

        for(int i=0;i<name.length;i++)
        {
            mArray.add(new object(name[i],col[i],img[i]));
        }
        adapter mNewsAdapter  = new adapter(mArray);

        recyclerView.setAdapter(mNewsAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Intent i = new Intent(MainActivity.this,sample_act.class);
                startActivity(i);
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }));

    }


}
