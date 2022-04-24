package com.example.donutdasher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class menu extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] options = {"Create Order", "Listen to DonutDasher's theme"};
        setListAdapter(new ArrayAdapter(this, R.layout.activity_menu, R.id.menuOptions, options));
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(menu.this, location.class));
                break;

            case 1:
                startActivity(new Intent(menu.this, music.class));
                break;
        }
    }
}