package com.feistymoon.activitydemo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kathy on 24/08/2015.
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener{


    Button switchToFirst = null;
    TextView textViewSecondActivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        // Get handle to TextView where we will display text passed from Intent
        textViewSecondActivity = (TextView)findViewById(R.id.textViewSecondActivity);
        //Create an intent
        Intent intent = getIntent();
        //Retrieve data
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        //Update the TextView
        textViewSecondActivity.setText("Your name is " + name + " and you are " + age + " years old");
        switchToFirst = (Button)findViewById(R.id.buttonSwitchToMain);
        switchToFirst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(v.getContext(), MainActivity.class);
        startActivity(myIntent);

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
