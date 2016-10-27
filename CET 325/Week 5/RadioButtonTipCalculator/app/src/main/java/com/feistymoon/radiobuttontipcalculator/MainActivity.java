package com.feistymoon.radiobuttontipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText editTextBillAmount = null;
    TextView textViewTipAmount = null;
    RadioButton radioButtonTipTen = null;
    RadioButton radioButtonTipFifteen = null;
    RadioButton radioButtonTipTwenty = null;
    RadioGroup rg = null;
    DecimalFormat df = new DecimalFormat("£####.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBillAmount = (EditText) findViewById(R.id.bill_amount);
        textViewTipAmount = (TextView) findViewById(R.id.tip_amount);
        radioButtonTipTen = (RadioButton)findViewById(R.id.ten);
        radioButtonTipFifteen = (RadioButton)findViewById(R.id.fifteen);
        radioButtonTipTwenty = (RadioButton)findViewById(R.id.twenty);
        rg = (RadioGroup) findViewById(R.id.tip_choices);
        rg.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup rg, int i){
        if(i==radioButtonTipTen.getId())
            textViewTipAmount.setText(df.format(Double.parseDouble(editTextBillAmount.getText().toString())*.10));
        else if(i==radioButtonTipFifteen.getId())
            textViewTipAmount.setText(df.format(Double.parseDouble(editTextBillAmount.getText().toString())*.15));
        else if(i==radioButtonTipTwenty.getId())
            textViewTipAmount.setText(df.format(Double.parseDouble(editTextBillAmount.getText().toString())*.20));

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
