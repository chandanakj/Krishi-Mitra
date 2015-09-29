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

        // --------------------------------
        // Card 1
        // --------------------------------
        Card card1 = new Card.Builder(this)
                .setTag("CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Fertilizers")
                .setLeftButtonText("More Details")
                .setRightButtonText("Donate Now")
                .setDrawable(R.drawable.fertilizers)
                .setDescription("Goal Amount: Rs. 200")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {

                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Details");
                        builder.setMessage(
                                "Product Type:  Fertilizer\n\n" +
                                        "Product Name:  Urea\n\n" +
                                        "Quantity:      5 kgs\n\n" +
                                        "Farmer Information:\n" +
                                        "Name:          Ramalinga Swamy\n\n" +
                                        "City:          Gulbarga\n\n" +
                                        "Contact:       +91 91231 23123\n\n\n" +
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

        mListView.add(card1);

        // --------------------------------
        // Card 2
        // --------------------------------
        Card card2 = new Card.Builder(this)
                .setTag("CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Pesticides")
                .setLeftButtonText("More Details")
                .setRightButtonText("Donate Now")
                .setDrawable(R.drawable.pesticides)
                .setDescription("Goal Amount: Rs. 600")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {

                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Details");
                        builder.setMessage(
                                "Product Type:  Pesticides\n\n" +
                                        "Product Name:  Rat Killer\n\n" +
                                        "Quantity:      1 litre\n\n" +
                                        "FARMER INFORMATION:\n" +
                                        "Name:          Keval\n\n" +
                                        "City:          Bangalore\n\n" +
                                        "Contact:       +91 91231 23123\n\n\n" +
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

        mListView.add(card2);

        // --------------------------------
        // Card 3
        // --------------------------------
        Card card3 = new Card.Builder(this)
                .setTag("CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Plough")
                .setLeftButtonText("More Details")
                .setRightButtonText("Donate Now")
                .setDrawable(R.drawable.plough)
                .setDescription("Goal Amount: Rs. 1600")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {

                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Details");
                        builder.setMessage(
                                "Product Type:  Plough\n\n" +
                                        "Product Name:  Wooden Plough\n\n" +
                                        "Quantity:      1 pc\n\n" +
                                        "FARMER INFORMATION:\n" +
                                        "Name:          Awneesh Kishore\n\n" +
                                        "City:          Bihar\n\n" +
                                        "Contact:       +91 91231 23123\n\n\n" +
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

        mListView.add(card3);

        // --------------------------------
        // Card 4
        // --------------------------------
        Card card4 = new Card.Builder(this)
                .setTag("CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Plough (Tractor)")
                .setLeftButtonText("More Details")
                .setRightButtonText("Donate Now")
                .setDrawable(R.drawable.ploughtractor)
                .setDescription("Goal Amount: Rs. 1600")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {

                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Details");
                        builder.setMessage(
                                "Product Type:  Plough\n\n" +
                                        "Product Name:  Mechanical Plough\n\n" +
                                        "Quantity:      1 pc\n\n" +
                                        "FARMER INFORMATION:\n" +
                                        "Name:          Abhayanna Dixit\n\n" +
                                        "City:          Hassan\n\n" +
                                        "Contact:       +91 91231 23123\n\n\n" +
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

        mListView.add(card4);

        // --------------------------------
        // Card 5
        // --------------------------------
        Card card5 = new Card.Builder(this)
                .setTag("CARD")
                .withProvider(BasicImageButtonsCardProvider.class)
                .setTitle("Seeds")
                .setLeftButtonText("More Details")
                .setRightButtonText("Donate Now")
                .setDrawable(R.drawable.seeds)
                .setDescription("Goal Amount: Rs. 400")
                .setOnLeftButtonClickListener(new OnButtonClickListener() {

                    @Override
                    public void onButtonClicked(View view, Card card) {

                        AlertDialog.Builder builder =
                                new AlertDialog.Builder(CardView.this, R.style.AppCompatAlertDialogStyle);
                        builder.setTitle("Details");
                        builder.setMessage(
                                "Product Type:  Seeds\n\n" +
                                        "Product Name:  Rice & Maize\n\n" +
                                        "Quantity:      1 quintal\\each\n\n" +
                                        "FARMER INFORMATION:\n" +
                                        "Name:          Ramalinga Swamy\n\n" +
                                        "City:          Gulbarga\n\n" +
                                        "Contact:       +91 91231 23123\n\n\n" +
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

        mListView.add(card5);
    }


}
