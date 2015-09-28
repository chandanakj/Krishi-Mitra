package com.krishimitra.krishimitra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.provider.BasicImageButtonsCardProvider;
import com.dexafree.materialList.view.MaterialListView;


public class FarmerRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_request);

        MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);

        Card card = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("I'm new")
                .setDescription("I've been generated on runtime!")
                .endConfig()
                .build();

        mListView.add(card);
    }

}
