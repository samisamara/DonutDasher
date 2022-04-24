package com.example.donutdasher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        EditText addressTyped = (EditText) findViewById(R.id.address);
        String addressText = addressTyped.getText().toString();
        Button donutCreator = (Button)findViewById(R.id.toDonutCreator);
        donutCreator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(location.this, donutCreator.class));
            }
        });

    }
}