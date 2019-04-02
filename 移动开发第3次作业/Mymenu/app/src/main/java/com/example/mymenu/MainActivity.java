package com.example.mymenu;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
       // int id = item.getItemId();

        TextView tv = (TextView) findViewById(R.id.tv1);
        switch (item.getItemId()) {
            case R.id.f1: tv.setTextSize(10);  return true;
            case R.id.f2: tv.setTextSize(16);  return true;
            case R.id.f3: tv.setTextSize(20);  return true;

            case R.id.red: tv.setTextColor(Color.RED);  return true;
            case R.id.blue: tv.setTextColor(Color.BLUE);  return true;

            case R.id.item3:
                Toast.makeText(this, "selected " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

           // default:
               // Toast.makeText(this, "selected " + item.getTitle(), Toast.LENGTH_SHORT).show();
               // return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }
}
