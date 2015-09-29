package com.krishimitra.krishimitra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.OnButtonClickListener;
import com.dexafree.materialList.card.provider.BasicImageButtonsCardProvider;
import com.dexafree.materialList.listeners.RecyclerItemClickListener;
import com.dexafree.materialList.view.MaterialListView;

public class CardView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);

        Card card = new Card.Builder(this)
                .setTag("CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Project Number #1")
                .setLeftButtonText("Project Info")
                .setRightButtonText("Donate Now")
                .setDescription("This is a sample description of the project at hand!")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(CardView.this, ProjectInfoActivity.class);
                        startActivity(intent);
                    }
                })
                .setOnRightButtonClickListener(new OnButtonClickListener(){
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(CardView.this, DonationActivity.class);
                        startActivity(intent);
                    }
                })

                .endConfig()
                .build();

        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);
        mListView.add(card);

    }


}
