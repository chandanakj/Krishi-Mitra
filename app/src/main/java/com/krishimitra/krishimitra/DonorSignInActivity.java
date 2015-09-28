package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class DonorSignInActivity extends ActionBarActivity implements View.OnClickListener {

Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_sign_in);
        Intent intent2 = getIntent();

        signin= (Button) findViewById(R.id.button2);

        signin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent intent3=new Intent(DonorSignInActivity.this,Project_info.class);
        startActivity(intent3);

    }
}
