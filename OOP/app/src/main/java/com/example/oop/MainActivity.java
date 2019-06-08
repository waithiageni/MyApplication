package com.example.oop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//        Car bmw = new Car("blue","saloon",2,80);
//        int bmwDoors = bmw.getDoors();
//        bmw.hoot();
//        bmw.hoot("lolalolaaaaaaaaa");
////        bmw.accelerate(10);
////        Log.d("Car","bmw new speed is "+bmw.getSpeed());
////        bmw.decelerate(70);
////        Log.d("Car","bmw new speed is "+bmw.getSpeed());
////        bmw.stop();
//
//        Taxi uber = new Taxi("gray","saloon",2,3);
//        uber.carryGoods();
//        uber.hoot();
//
//        Taxi taxify = new Taxi("white","demio",4,80,4);


        SportsCar sportsCar = new SportsCar("black","subaru",2,180);
        sportsCar.hoot();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
