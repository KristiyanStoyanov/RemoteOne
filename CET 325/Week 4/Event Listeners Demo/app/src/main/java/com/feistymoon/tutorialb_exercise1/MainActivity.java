package com.feistymoon.tutorialb_exercise1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    Button buttonRegisterListener;
    Button buttonInnerClass;
    Button buttonImplementInXML;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Approach 1.
        // Implement Interface, set onClickListener, and
        // override the interface's onClick() method
        buttonRegisterListener= (Button) findViewById(R.id.button_register_listener);
        buttonRegisterListener.setOnClickListener(this);


        // Approach 2.
        // Implement an Anonymous Inner Event Listener Class
        buttonInnerClass = (Button) findViewById(R.id.button_inner_class);
        buttonInnerClass.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0) {
               displayMessage();
                    }});


        // Approach 3
        // Do the work in XMl
        buttonImplementInXML = (Button) findViewById(R.id.button_implement_in_xml);

    }

    public void displayMessage() {
        Toast.makeText(this,"Inner Anonymous Class",
                Toast.LENGTH_SHORT).show();
    }

    public void onClickXml(View v){
        Toast.makeText(this,"Set Listener in XML",
                Toast.LENGTH_SHORT).show();
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

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Implements onClickListener",
                Toast.LENGTH_SHORT).show();
    }
}
