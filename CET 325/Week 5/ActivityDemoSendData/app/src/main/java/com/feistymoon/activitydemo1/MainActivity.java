package com.feistymoon.activitydemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button switchToSecond = null;
    EditText mEditTextName = null;
    EditText mEditTextAge = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchToSecond = (Button)findViewById(R.id.buttonSwitchToSecond);
        switchToSecond.setOnClickListener(this);

        mEditTextName = (EditText)findViewById(R.id.editTextName);
        mEditTextAge = (EditText)findViewById(R.id.editTextAge);
    }

    @Override
    public void onClick(View v) {
        //Get the contents of our EditText components
        String name = mEditTextName.getText().toString();
        String age = mEditTextAge.getText().toString();
        //Create Intent
        Intent myIntent = new Intent(v.getContext(), SecondActivity.class);
        //Add key-value pairs to the intent
        myIntent.putExtra("name", name);
        myIntent.putExtra("age", age);
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
