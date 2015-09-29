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
                .setTitle("Title")
                .setLeftButtonText("info")
                .setRightButtonText("Donate")
                .setDescription("Description")
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
                        Intent intent1 = new Intent(CardView.this, DonationActivity.class);
                        startActivity(intent1);
                    }
                })

                .endConfig()
                .build();
        for(int i=0;i<8;i++)
         {
             mListView.add(card);
         }

        mListView.addOnItemTouchListener(new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(Card card, int position) {

            }

            @Override
            public void onItemLongClick(Card card, int position) {

            }
        });
    }


}
