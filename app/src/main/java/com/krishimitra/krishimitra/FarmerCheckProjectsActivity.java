package com.krishimitra.krishimitra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.provider.BasicButtonsCardProvider;
import com.dexafree.materialList.view.MaterialListView;


public class FarmerCheckProjectsActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_check_projects);

        MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);

        Card cardA = new Card.Builder(this)
                .setTag("BASIC_BUTTONS_CARD")
                .withProvider(BasicButtonsCardProvider.class)
                .setTitle("Fertilizer Request")
                .setDescription("Requested on 29th September 2015\nProject Goal: Rs. 230\nFunded Amount: Rs. 180")
                .endConfig()
                .build();

        mListView.add(cardA);

        Card cardB = new Card.Builder(this)
                .setTag("BASIC_BUTTONS_CARD")
                .withProvider(BasicButtonsCardProvider.class)
                .setTitle("Seeds Request")
                .setDescription("Requested on 16th September 2015\nProject Goal: Rs. 80\nFunded Amount: Rs. 70")
                .endConfig()
                .build();

        mListView.add(cardB);
    }


}
