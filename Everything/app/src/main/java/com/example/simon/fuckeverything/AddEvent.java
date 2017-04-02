<<<<<<< HEAD
package com.example.simon.fuckeverything;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AddEvent extends AppCompatActivity {

=======
package com.example.raymond.ecomap;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEvent extends AppCompatActivity {

    Button button;
    String event;
    String location;
    String creator;

>>>>>>> 194cf29279fbd017cd1d96f8da28878d4b74abfe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
<<<<<<< HEAD
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
=======
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final Context context = this;

        event =  findViewById(R.id.event).toString();
        location = findViewById(R.id.location).toString();
        creator = findViewById(R.id.creator).toString();

        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
>>>>>>> 194cf29279fbd017cd1d96f8da28878d4b74abfe
            }
        });
    }

<<<<<<< HEAD



=======
>>>>>>> 194cf29279fbd017cd1d96f8da28878d4b74abfe
}
