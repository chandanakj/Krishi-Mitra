package com.krishimitra.krishimitra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class FarmerChoiceActivity extends ActionBarActivity implements View.OnClickListener{

    Button request,check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_choice);

        request= (Button) findViewById(R.id.request);
        check= (Button) findViewById(R.id.check);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.request){
            Intent intent5=new Intent(FarmerChoiceActivity.this,FarmerRequestActivity.class);
            startActivity(intent5);
        }
    }
}
