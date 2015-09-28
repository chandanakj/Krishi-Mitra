package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class FarmerSignInActivity extends AppCompatActivity implements View.OnClickListener {
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_sign_in);

        signin= (Button) findViewById(R.id.signin);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(FarmerSignInActivity.this,FarmerChoiceActivity.class);
        startActivity(intent);
    }
}
