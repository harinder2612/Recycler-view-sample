package com.harinder.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    String[] name={"Harinder","Pari","Jogi","Harsh"};
        ArrayList<object> mArray= new ArrayList<object>();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);
        LinearLayoutManager mlLinearLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mlLinearLayoutManager);
        recyclerView.setHasFixedSize(true);

        for(int i=0;i<name.length;i++)
        {
            mArray.add(new object(name[i]));
        }
        adapter mNewsAdapter  = new adapter(mArray);

        recyclerView.setAdapter(mNewsAdapter);

    }
}
