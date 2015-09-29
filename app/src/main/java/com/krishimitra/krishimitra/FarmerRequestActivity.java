package com.krishimitra.krishimitra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.provider.BasicImageButtonsCardProvider;
import com.dexafree.materialList.view.MaterialListView;

// Comment

public class FarmerRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_request);

        MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);

        Card cardFertilizers = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Fertilizers")
                .setDrawable(R.drawable.ic_launcher)
                .endConfig()
                .build();

        mListView.add(cardFertilizers);

        Card cardSeeds = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Seeds")
                .setDrawable(R.drawable.ic_launcher)
                .endConfig()
                .build();

        mListView.add(cardSeeds);


        Card cardTools = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Tools")
                .setDrawable(R.drawable.ic_launcher)
                .endConfig()
                .build();

        mListView.add(cardTools);

        Card cardWater = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setDrawable(R.drawable.ic_launcher)
                .setTitle("Water Can")
                .endConfig()
                .build();

        mListView.add(cardWater);

        Card cardMachinery = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setDrawable(R.drawable.ic_launcher)
                .setTitle("Machinery")
                .endConfig()
                .build();

        mListView.add(cardMachinery);
    }

}
