package com.example.almogrecycleview;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {



private ArrayList<DataModel> dataSet;

    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = (RecyclerView) findViewById(R.id.my_recycler_view);

        layoutManager = new LinearLayoutManager(this); // new GridLayoutManager
        recycleView.setLayoutManager(layoutManager);

        recycleView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<DataModel>();

        for(int i=0 ; i<MyData.nameArray.length ; i++)
        {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    //MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]


            ));
        }



        CustomAdapter addapter = new CustomAdapter(dataSet,this);
        recycleView.setAdapter(addapter);

    }


    @Override
    public void onItemClick(int pos) {
      switch (pos) {
          case 0:
              Intent intent = new Intent(MainActivity.this,Ed.class);
              startActivity(intent);
              break;
          case 1:
              Intent intent1 = new Intent(MainActivity.this,Edd.class);
              startActivity(intent1);
              break;
          case 2:
              Intent intent2 = new Intent(MainActivity.this,Eddy.class);
              startActivity(intent2);
              break;
          case 3:
              Intent intent3 = new Intent(MainActivity.this,Jimmy.class);
              startActivity(intent3);
              break;
          case 4:
              Intent intent4 = new Intent(MainActivity.this,Kevin.class);
              startActivity(intent4);
              break;
          case 5:
              Intent intent5 = new Intent(MainActivity.this,Sarah.class);
              startActivity(intent5);
              break;
      }
    }
}















































