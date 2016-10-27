package com.feistymoon.tasklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;



public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener{
    Toast myToast = null;
    EditText editTextTaskName;
    EditText editTextTaskDescription;
    Button submitButton = null;
    DatePicker dueDatePicker = null;
    Task task = null;

    String taskName = null;
    String taskDescription = null;
    Date dueDate = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToast = new Toast(this.getApplicationContext());
        editTextTaskName = (EditText)findViewById(R.id.taskNameInput);
        editTextTaskDescription = (EditText)findViewById(R.id.taskDescriptionInput);
        submitButton = (Button)findViewById(R.id.buttonSubmit);
        // The submit button code is different here
        // instead of having the activity implement onClickListener
        // We have created a new OnClickListener here and given details
        // of the onClick implementation
        submitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                createTask(v);
            }
        });
        dueDate = new Date();

        dueDatePicker = (DatePicker)findViewById(R.id.datePicker);
        // initialise the datePicker
        // Otherwise onDateChange events are not picked up
        dueDatePicker.init(dueDatePicker.getYear(), dueDatePicker.getMonth(),dueDatePicker.getDayOfMonth(),this );

    }

    public void createTask(View v) {

        //Get information from the editTextTaskName
        taskName = editTextTaskName.getText().toString();
        taskDescription = editTextTaskDescription.getText().toString();


        if( taskName.length()>0 & taskDescription.length()>0){
            // Add task
            task = new Task(taskName, taskDescription, dueDate);
            // to do - create string resources and move text
            myToast.makeText(this.getApplicationContext(), "Task created: Name: " + task.getTaskName(), Toast.LENGTH_SHORT).show();
        }
        else{

            myToast.makeText(this.getApplicationContext(), "Please Enter All Required Details", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
       // Calendar cal = Calendar.getInstance();
       // cal.set(year, monthOfYear, dayOfMonth);
        dueDate.setDate(dayOfMonth);
        dueDate.setYear(year);
        dueDate.setMonth(monthOfYear);
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
