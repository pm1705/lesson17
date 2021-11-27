package com.example.lesson17;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder firstKidney, secondKidney, allKidneys, color, whiteColors;
    LinearLayout back;
    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for albert -  I though it would be better to declare all the dialog box attributes in the 
        // On_create so it wont declare them on every on-click but i may be wrong...

        back = (LinearLayout) findViewById(R.id.back);

        firstKidney=new AlertDialog.Builder(this);
        firstKidney.setTitle("first KIDNEY sold!");
        firstKidney.setMessage("your kidney has been sold on the marketplace for 0.03$");

        secondKidney=new AlertDialog.Builder(this);
        secondKidney.setTitle("second KIDNEY sold!");
        secondKidney.setMessage("your kidney has been sold on the marketplace for 1.17$");
        secondKidney.setIcon(R.drawable.depositphotos_12820598_stock_illustration_human_kidney_vector);

        allKidneys=new AlertDialog.Builder(this);
        allKidneys.setTitle("ALL KIDNEY'S SOLD!!!");
        allKidneys.setMessage("you have sold all your kidneys for a total of 3.2$ be proud!");
        allKidneys.setIcon(R.drawable._aaf0d1752d16b6ac553c3db50ac20fe);
        allKidneys.setPositiveButton("Ok?!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        color=new AlertDialog.Builder(this);
        color.setTitle("Kidney colored background");
        color.setMessage("get in the Kidney mode with some fresh kidney backgrounds");
        color.setIcon(R.drawable.peppa);
        color.setPositiveButton("Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                back.setBackgroundColor(Color.rgb(rand.nextInt(100)+100, rand.nextInt(100), rand.nextInt(100)));
                dialog.dismiss();
            }
        });
        color.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        whiteColors=new AlertDialog.Builder(this);
        whiteColors.setTitle("For the lame people");
        whiteColors.setMessage("if you dislike our fresh colors you can reset for the nice yellow, or even generate a regular color!");
        whiteColors.setIcon(R.drawable.nftlol);
        whiteColors.setPositiveButton("Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                back.setBackgroundColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                dialog.dismiss();
            }
        });
        whiteColors.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        whiteColors.setNeutralButton("reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                back.setBackgroundColor(Color.rgb(255, 236, 179));
                dialog.dismiss();
            }
        });

    }

    public void first(View view) {
        AlertDialog ad1 = firstKidney.create();
        ad1.show();
    }

    public void second(View view) {
        AlertDialog ad2 = secondKidney.create();
        ad2.show();
    }

    public void all(View view) {
        AlertDialog ad3 = allKidneys.create();
        ad3.show();
    }

    public void colors(View view) {
        AlertDialog ad4 = color.create();
        ad4.show();
    }

    public void whiteColors(View view) {
        AlertDialog ad5 = whiteColors.create();
        ad5.show();
    }
}