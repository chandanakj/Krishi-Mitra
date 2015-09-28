package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Project_info extends ActionBarActivity implements View.OnClickListener {

    TextView tv6;
    String str = "<u>underline</u>";

    Button DonationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        Intent intent3 = getIntent();

        DonationButton = (Button) findViewById(R.id.donateButton);

        DonationButton.setOnClickListener(this);
      
    }

    @Override
    public void onClick(View view) {
        Intent intent4 = new Intent(Project_info.this, donation.class);
        startActivity(intent4);
    }
}
