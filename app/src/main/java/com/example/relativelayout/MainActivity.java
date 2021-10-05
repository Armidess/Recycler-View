package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.relativelayout.Adapter.Adapter;
import com.example.relativelayout.Model.models;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerview);
        ArrayList<models> list= new ArrayList<>();
        list.add(new models(R.drawable.a,"A"));
        list.add(new models(R.drawable.b,"B"));
        list.add(new models(R.drawable.c,"C"));
        list.add(new models(R.drawable.d,"D"));
        list.add(new models(R.drawable.e,"E"));
        list.add(new models(R.drawable.f,"F"));
        list.add(new models(R.drawable.g,"G"));
        list.add(new models(R.drawable.h,"H"));
        list.add(new models(R.drawable.i,"I"));
        list.add(new models(R.drawable.j,"j"));

        Adapter adapter = new Adapter(list,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        StaggeredGridLayoutManager stagg=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(stagg);
    }
}