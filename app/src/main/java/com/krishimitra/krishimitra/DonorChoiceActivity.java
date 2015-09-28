package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class DonorChoiceActivity extends ActionBarActivity implements View.OnClickListener {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_choice);
        Intent intent1 = getIntent();

        btn1 = (Button) findViewById(R.id.DonorSignUpButton);
        btn2 = (Button) findViewById(R.id.DonorSignInButton);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.DonorSignUpButton) {
            Intent intent1 = new Intent(DonorChoiceActivity.this, SignupActivity.class);
            startActivity(intent1);
        }
        else if (v.getId() == R.id.DonorSignInButton) {
            Intent intent2 = new Intent(DonorChoiceActivity.this, DonorSignInActivity.class);
            startActivity(intent2);
        }
    }
}
