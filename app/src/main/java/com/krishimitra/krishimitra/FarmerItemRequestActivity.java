package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FarmerItemRequestActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_item_request);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Request is being processed!", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(FarmerItemRequestActivity.this, FarmerRequestActivity.class);
        startActivity(intent);
    }
}
