package com.example.donutdasher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class donutCreator extends AppCompatActivity {

    String donutType;
    double typePrice = 0.0;
    double icingPrice = 0.0;
    double glazePrice = 0.0;
    double toppingCost = 0.0;
    double total = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_creator);

        final RadioButton glaze = (RadioButton)findViewById(R.id.radGlaze);
        final RadioButton noGlaze = (RadioButton)findViewById(R.id.radNoGlaze);
        final CheckBox sprinkles = (CheckBox) findViewById(R.id.checkSprinkles);
        final CheckBox nuts = (CheckBox) findViewById(R.id.checkNuts);
        final CheckBox candy = (CheckBox) findViewById(R.id.checkCandy);
        final Spinner spin = (Spinner) findViewById(R.id.txtDonutTypeGroup);
        final Spinner spin2 = (Spinner) findViewById(R.id.txtIcingGroup);
        TextView cost = (TextView) findViewById(R.id.txtPrice);


        Button calculate = (Button)findViewById(R.id.btnConfirm);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typePrice = 0.0;
                icingPrice = 0.0;
                glazePrice = 0.0;
                toppingCost = 0.0;
                total = 0.0;
                String spinValue = spin.getSelectedItem().toString();
                switch (spinValue) {
                    case "Vanilla":
                        typePrice = 1.0;
                        break;
                    case "Chocolate":
                        typePrice = 1.0;
                        break;
                    case "Blueberry":
                        typePrice = 1.5;
                        break;
                    case "Boston Cream":
                        typePrice = 1.5;
                        break;
                    case "Long John":
                        typePrice = 2.0;
                        break;
                    case "Jelly":
                        typePrice = 1.75;
                        break;
                    case "French":
                        typePrice = 1.25;
                        break;
                }

                if (glaze.isChecked()) {
                    glazePrice = 0.3;
                }
                else {
                    glazePrice = 0.0;
                }

                String spinValue2 = spin2.getSelectedItem().toString();
                switch (spinValue2) {
                    case "Vanilla":
                        icingPrice = 0.2;
                        break;
                    case "Chocolate":
                        icingPrice = 0.2;
                        break;
                    case "Strawberry":
                        icingPrice = 0.2;
                        break;
                    case "Vanilla Marble":
                        icingPrice = 0.25;
                        break;
                    case "Chocolate Marble":
                        icingPrice = 0.25;
                        break;
                    case "No Icing":
                        icingPrice = 0.0;
                        break;
                }

                if (sprinkles.isChecked()) {
                    toppingCost += .1;
                }
                if (nuts.isChecked()) {
                    toppingCost += .1;
                }
                if (candy.isChecked()) {
                    toppingCost += .1;
                }

            total = (typePrice + icingPrice + glazePrice + toppingCost);
            DecimalFormat currency = new DecimalFormat("$###,###.00");
            cost.setText("Price: " + currency.format(total));
            }
        });


    }
}