package com.example.kathleenbenavides.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Setting up my buttons
    public Button firstapp, secondapp, thirdapp, fourthapp, fifthapp, myportfolio;

    Context context;
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        firstapp = (Button) findViewById(R.id.first_button);
        secondapp = (Button) findViewById(R.id.second_button);
        thirdapp = (Button) findViewById(R.id.third_button);
        fourthapp  = (Button) findViewById(R.id.fourth_button);
        fifthapp = (Button) findViewById(R.id.fifth_button);
        myportfolio = (Button) findViewById(R.id.myportfolio_button);

        setUpButtonListeners();

    }

    //This function sets up my on click listeners
    public void setUpButtonListeners() {
        firstapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my first app!", duration);
                toast.show();
            }
        });

        secondapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my second app!", duration);
                toast.show();
            }
        });

        thirdapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my third app!", duration);
                toast.show();
            }
        });

        fourthapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my fourth app!", duration);
                toast.show();
            }
        });

        fifthapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my fifth app!", duration);
                toast.show();
            }
        });

        myportfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my portfolio app!", duration);
                toast.show();
            }
        });
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
