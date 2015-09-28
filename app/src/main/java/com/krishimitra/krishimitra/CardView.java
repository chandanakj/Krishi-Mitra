package com.krishimitra.krishimitra;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
                .setLeftButtonText("Left")
                .setRightButtonText("Right")
                .setDescription("Description")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Title");
                        builder.setMessage("Description");
                        builder.setPositiveButton("OK", null);//second parameter used for onclicklistener
                        builder.setNegativeButton("Cancel", null);
                        builder.show();
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
