package com.udacity.oasisaac.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Context context;
    int duration = Toast.LENGTH_SHORT;
    Toast toast;
    StringBuilder text = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        context = getApplicationContext();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

    public void openApp(View view){
        text = new StringBuilder();
        text.append("This button will launch my ");

        switch (view.getId()) {
            case (R.id.button1):
                text.append(getString(R.string.btn_spotify));
                break;
            case (R.id.button2):
                text.append(getString(R.string.btn_scores));
                break;
            case (R.id.button3):
                text.append(getString(R.string.btn_library));
                break;
            case (R.id.button4):
                text.append(getString(R.string.btn_build));
                break;
            case (R.id.button5):
                text.append(getString(R.string.btn_bacon));
                break;
            case (R.id.button6):
                text.append(getString(R.string.btn_capstone));
                break;
            default:
                text.append("... ");
        }

        toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
