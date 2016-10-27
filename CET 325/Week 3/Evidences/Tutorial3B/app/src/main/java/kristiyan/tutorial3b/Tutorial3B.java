package kristiyan.tutorial3b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Package references
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class Tutorial3B extends AppCompatActivity implements View.OnClickListener {

    // References
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3b);
        //Instantiate objects
        button = (Button) findViewById(R.id.HomeButton);
        button.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText1);
        textView = (TextView) findViewById(R.id.textView1);

    }

    public void onClick(View v){

        int id = v.getId();
        if(id == R.id.HomeButton) {
            String name = editText.getText().toString();
            editText.getText().clear();
            textView.setText(name);

        }
    }
}
