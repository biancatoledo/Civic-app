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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
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
            }
        });
    }

}
