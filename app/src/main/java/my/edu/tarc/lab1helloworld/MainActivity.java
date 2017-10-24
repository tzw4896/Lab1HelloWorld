package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Globar or module level variable
    private EditText editTextName, editTextAge;
    {}
    private TextView textViewMessage;
    {}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //linking UI to program
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void displayMessage (View view)
    {
        String name = editTextName.getText().toString();
        int age = Integer.parseInt(editTextAge.getText().toString());
        age++;

        textViewMessage.setText("Hi " + name + ", you will be " + age + " years old in 2018.");
    }

    public void resetMessage (View view)
    {
        textViewMessage.setText("Hello World!");
    }


}
