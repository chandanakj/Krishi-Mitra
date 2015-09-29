package com.krishimitra.krishimitra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class DonationActivity extends AppCompatActivity {

    Button btnDonateNow;
    Spinner spinner;
    TextView donateAmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        donateAmt = (TextView) findViewById(R.id.donateAmt);

        addItemsOnSpinner();
        addListenerOnButton();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner() {
        spinner = (Spinner) findViewById(R.id.denom_spinner);
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }

    // get the selected dropdown list value
    public void addListenerOnButton() {
        spinner = (Spinner) findViewById(R.id.denom_spinner);

        btnDonateNow = (Button) findViewById(R.id.denomDonateButton);
        btnDonateNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donateAmt.setText("Donation Amount: Rs. " + (10 * Integer.parseInt(String.valueOf(spinner.getSelectedItem()))));
                Toast.makeText(getApplicationContext(),"You have successfully donated",
                        Toast.LENGTH_LONG).show();

            }
        });
    }

}
