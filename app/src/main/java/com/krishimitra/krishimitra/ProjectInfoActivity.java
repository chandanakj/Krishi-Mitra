package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProjectInfoActivity extends AppCompatActivity implements View.OnClickListener {

    Button DonationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        DonationButton = (Button) findViewById(R.id.donateButton);

        DonationButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ProjectInfoActivity.this, DonationActivity.class);
        startActivity(intent);
    }
}
