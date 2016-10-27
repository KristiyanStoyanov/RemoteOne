package kristiyan.wk5tutaex1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SpinnerTip extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner tipSpinner = null;
    TextView textViewTipAmount = null;
    EditText editTextBillAmount = null;
    DecimalFormat df = new DecimalFormat("£####.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_tip);

        tipSpinner = (Spinner)findViewById(R.id.mySpinner);
        editTextBillAmount = (EditText)findViewById(R.id.bill_amount);
        textViewTipAmount = (TextView)findViewById(R.id.myTextView);
        tipSpinner.setOnItemSelectedListener(this);
    }


    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        //Application logic goes here
        if(id==1){ textViewTipAmount.setText(df.format(Double.parseDouble
                (editTextBillAmount.getText().toString())*.10));
        }
        else // implement equivalent logic for other options else{
            textViewTipAmount.setText("0.00"); }

    public void onNothingSelected(AdapterView<?> parent){

        ArrayList<String> options = new ArrayList<String>(); // fill options
        ArrayAdapter<String> dataAdapter;
        Spinner spinnerOptions;
        spinnerOptions = (Spinner)findViewById(R.id.mySpinner);
        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
    }
}


