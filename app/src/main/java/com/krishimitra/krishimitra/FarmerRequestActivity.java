package com.krishimitra.krishimitra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.OnButtonClickListener;
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
                .setDrawable(R.drawable.fertilizers)
                .setRightButtonText("Need")
                .setOnRightButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(FarmerRequestActivity.this, FarmerItemRequestActivity.class);
                        startActivity(intent);
                    }
                })
                .endConfig()
                .build();

        mListView.add(cardFertilizers);

        Card cardSeeds = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Seeds")
                .setDrawable(R.drawable.seeds)
                .setRightButtonText("Need")
                .setOnRightButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(FarmerRequestActivity.this, FarmerItemRequestActivity.class);
                        startActivity(intent);
                    }
                })
                .endConfig()
                .build();

        mListView.add(cardSeeds);


        Card cardTools = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Tools")
                .setDrawable(R.drawable.plough)
                .setRightButtonText("Need")
                .setOnRightButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(FarmerRequestActivity.this, FarmerItemRequestActivity.class);
                        startActivity(intent);
                    }
                })
                .endConfig()
                .build();

        mListView.add(cardTools);

        Card cardPesticides = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setDrawable(R.drawable.pesticides)
                .setTitle("Pesticides")
                .setRightButtonText("Need")
                .setOnRightButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(FarmerRequestActivity.this, FarmerItemRequestActivity.class);
                        startActivity(intent);
                    }
                })
                .endConfig()
                .build();

        mListView.add(cardPesticides);

        Card cardMachinery = new Card.Builder(this)
                .setTag("BASIC_IMAGE_BUTTONS_CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setDrawable(R.drawable.ploughtractor)
                .setTitle("Machinery")
                .setRightButtonText("Need")
                .setOnRightButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(FarmerRequestActivity.this, FarmerItemRequestActivity.class);
                        startActivity(intent);
                    }
                })
                .endConfig()
                .build();

        mListView.add(cardMachinery);
    }

}
