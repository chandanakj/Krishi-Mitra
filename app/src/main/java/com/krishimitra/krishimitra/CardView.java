package com.krishimitra.krishimitra;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.OnButtonClickListener;
import com.dexafree.materialList.card.provider.BasicImageButtonsCardProvider;
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
                .setLeftButtonText("More Details")
                .setRightButtonText("Donate Now")
                .setDrawable(R.drawable.ic_launcher)
                .setDescription("Description")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {

                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Details");
                        builder.setMessage("Product Type:  Fertilizer\n\n" +
                                "Product Name: Urea\n\n" +
                                "Quantity:       5kgs\n\n" +
                                "FARMER INFORMATION:\n" +
                                "Name:  Ramalinga Swamy\n\n" +
                                "City:  Gulbarga\n\n" +
                                "Contact: 9123123123\n\n\n" +
                                "\t\tARE YOU UP FOR DONATION?");
                        builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(CardView.this, DonationActivity.class);
                                startActivity(intent);
                            }
                        });//second parameter used for onclicklistener
                        builder.setPositiveButton("Cancel", null);
                        builder.show();
                    }
                })
                .setOnRightButtonClickListener(new OnButtonClickListener() {
                    @Override
                    public void onButtonClicked(View view, Card card) {
                        Intent intent = new Intent(CardView.this, DonationActivity.class);
                        startActivity(intent);
                    }
                })

                .endConfig()
                .build();
        for (int i = 0; i < 8; i++) {
            mListView.add(card);
        }
    }


}
