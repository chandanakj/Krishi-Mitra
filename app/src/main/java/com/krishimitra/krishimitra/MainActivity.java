package com.krishimitra.krishimitra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    Button donor,farmer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donor = (Button) findViewById(R.id.bt1);
        farmer = (Button) findViewById(R.id.bt2);

        donor.setOnClickListener(this);
        farmer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.bt1) {
            Intent intent1 = new Intent(MainActivity.this, DonorChoiceActivity.class);
            startActivity(intent1);
        } else if (v.getId() == R.id.bt2) {
            Intent intent1 = new Intent(MainActivity.this, FarmerSignInActivity.class);
            startActivity(intent1);
        }

    }
}
