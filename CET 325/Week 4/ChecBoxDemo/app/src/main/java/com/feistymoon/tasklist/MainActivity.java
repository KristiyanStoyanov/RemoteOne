package com.feistymoon.tasklist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText editTextTask1 = null;
    CheckBox checkBoxTask1 = null;
    EditText editTextTask2 = null;
    CheckBox checkBoxTask2 = null;
    EditText editTextTask3 = null;
    CheckBox checkBoxTask3 = null;
    EditText editTextTask4 = null;
    CheckBox checkBoxTask4 = null;
    EditText editTextTask5 = null;
    CheckBox checkBoxTask5 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTask1 = (EditText)findViewById(R.id.editTextTask1);
        checkBoxTask1 = (CheckBox)findViewById(R.id.checkBoxTask1);
        checkBoxTask1.setOnClickListener(this);
        checkBoxTask1.setChecked(false);

        editTextTask2 = (EditText)findViewById(R.id.editTextTask2);
        checkBoxTask2 = (CheckBox)findViewById(R.id.checkBoxTask2);
        checkBoxTask2.setOnClickListener(this);
        checkBoxTask2.setChecked(false);

        editTextTask3 = (EditText)findViewById(R.id.editTextTask3);
        checkBoxTask3 = (CheckBox)findViewById(R.id.checkBoxTask3);
        checkBoxTask3.setOnClickListener(this);
        checkBoxTask3.setChecked(false);

        editTextTask4 = (EditText)findViewById(R.id.editTextTask4);
        checkBoxTask4 = (CheckBox)findViewById(R.id.checkBoxTask4);
        checkBoxTask4.setOnClickListener(this);
        checkBoxTask4.setChecked(false);

        editTextTask5 = (EditText)findViewById(R.id.editTextTask5);
        checkBoxTask5 = (CheckBox)findViewById(R.id.checkBoxTask5);
        checkBoxTask5.setOnClickListener(this);
        checkBoxTask5.setChecked(false);
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

    public void onClick(View v){
        TextView done = (TextView)findViewById(R.id.done);
        if(checkBoxTask1.isChecked() &
                checkBoxTask2.isChecked() &
                checkBoxTask3.isChecked() &
                checkBoxTask4.isChecked() &
                checkBoxTask5.isChecked()){

            //Update Text using String Reference
            done.setText(R.string.done);
        }
        else{
            done.setText("");

        }
    }
}
