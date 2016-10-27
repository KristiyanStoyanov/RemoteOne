package kristiyan.wk4tut4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.*;

import java.io.IOException;

public class Wk4Tut4 extends AppCompatActivity implements View.OnClickListener {

    // Public properties to help data.
    public double total = 0;
    public double cm = 0.1;
    public double mm = 0.10;

    // Reference to objects.
    Button button;
    Button buttonMM;
    TextView textView;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wk4_tut4);

        button = (Button) findViewById(R.id.btnCMtoMM);
        buttonMM = (Button) findViewById(R.id.btnMMtoCM);
        button.setOnClickListener(this);
        buttonMM.setOnClickListener(this);

        textView = (TextView) findViewById(R.id.txtUserInput);
        textViewResult = (TextView) findViewById(R.id.txtViewResult);
    }

    public void onClick(View v)
    {
        int id = v.getId();
        try {
            if (id == R.id.btnCMtoMM) {
                // TO DO :
                textViewResult.setText("");
                // Reads user input
                String result = textView.getText().toString();
                // Converts cm to mm
                total = Double.parseDouble(result) / cm;
                // Display the result on the textViewResult object
                textViewResult.setText("Result CM to MM: " + total + " mm");
            }

            if (id == R.id.btnMMtoCM) {
                textViewResult.setText("");
                // TO DO:
                // Reads user input
                String result = textView.getText().toString();
                // Converts mm to cm
                total = Double.parseDouble(result) * mm;
                // Display the result on the textViewResult object
                textViewResult.setText("Result MM to CM: " + total + " cm");
            }
        }
        catch(Exception e){
        }

        finally {
        }
    }
}
