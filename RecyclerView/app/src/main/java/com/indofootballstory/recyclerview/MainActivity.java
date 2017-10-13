package com.indofootballstory.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[],s3[];
    int imageResource[]={R.drawable.cara_membuat_donat,R.drawable.mie_goreng_large,R.drawable.resep_membuat_jus};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myRecycler);

        s1=getResources().getStringArray(R.array.Resep);
        s2=getResources().getStringArray(R.array.Bahan);
        s3=getResources().getStringArray(R.array.Cara_Membuat);

        ad=new MyOwnAdapter(this,s1,s2,s3,imageResource);
        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));


    }
}
