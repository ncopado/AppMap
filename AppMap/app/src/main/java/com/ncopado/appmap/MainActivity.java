package com.ncopado.appmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void goMapLocation1(View view){
        Intent intent=new Intent(this,MapsActivity.class);
        intent.putExtra("lat",19.1400446f);
        intent.putExtra("lon",-96.1081946f);

        startActivity(intent);
    }


    public  void goMapLocation2(View view){
        Intent intent=new Intent(this,MapsActivity.class);
        intent.putExtra("lat",19.138993f);
        intent.putExtra("lon",-96.1047671f);

        startActivity(intent);
    }

    public  void goMapLocation3(View view){
        Intent intent=new Intent(this,MapsActivity.class);
        intent.putExtra("lat",19.0955124f);
        intent.putExtra("lon",-96.1076843f);

        startActivity(intent);
    }
}
