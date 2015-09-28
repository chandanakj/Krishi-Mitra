package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class FarmerChoiceActivity extends AppCompatActivity implements View.OnClickListener{

    Button request,check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_choice);

        request= (Button) findViewById(R.id.request);
        check= (Button) findViewById(R.id.check);

        request.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

            Intent intent=new Intent(FarmerChoiceActivity.this,FarmerRequestActivity.class);
            startActivity(intent);

    }
}
