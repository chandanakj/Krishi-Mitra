package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SignupActivity extends AppCompatActivity implements View.OnClickListener {
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = (Button) findViewById(R.id.button);
        signup.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Account created",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SignupActivity.this, DonorSignInActivity.class);
        startActivity(intent);

    }
}
