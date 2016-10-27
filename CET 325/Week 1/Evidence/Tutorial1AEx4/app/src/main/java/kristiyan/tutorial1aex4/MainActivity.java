package kristiyan.tutorial1aex4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Object references to Person class
    Person student;
    Person staff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate new objects of class Student, Staff
        student = new Student("Kristiyan", "Sunderland", "Computing", 4, 5800);
        staff = new Staff("Andrew", "Sunderland", "UoS", 50000);
        student.toString();
        staff.toString();

    }
}
