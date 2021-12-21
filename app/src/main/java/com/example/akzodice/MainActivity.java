package com.example.akzodice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewToFour, imageViewToSix, imageViewToEight, imageViewToTen, imageViewToTwelve, imageViewToTwenty;
    TextView dDiceNumber, diceSymbol;
    Button minus, plus, dminus, dplus;
    int dDiceNumberInt, diceSymbolInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dDiceNumberInt = 1;

        imageViewToFour = findViewById(R.id.DiceRollFour);
        imageViewToSix = findViewById(R.id.DiceRollSix);
        imageViewToEight = findViewById(R.id.DiceRollEight);
        imageViewToTen = findViewById(R.id.DiceRollTen);
        imageViewToTwelve = findViewById(R.id.DiceRollTwelve);
        imageViewToTwenty = findViewById(R.id.DiceRollTwenty);
        dDiceNumber = findViewById(R.id.dDiceNumber);
        diceSymbol = findViewById(R.id.diceSymbol);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        dminus = findViewById(R.id.dminus);
        dplus = findViewById(R.id.dplus);

        dminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(String.valueOf(dDiceNumber)) != 1) {
                    dDiceNumberInt--;
                    dDiceNumber.setText(String.valueOf(dDiceNumberInt));
                }
            }
        });
        dplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dDiceNumberInt++;
                dDiceNumber.setText(String.valueOf(dDiceNumberInt));
            }
        });



        imageViewToFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RollDice.class);
                intent.putExtra("diceFour", R.drawable.aa);
                intent.putExtra("diceRollExtra", dDiceNumber.getText());
                startActivity(intent);
            }
        });

        imageViewToSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RollDice.class);
                intent.putExtra("diceSix", R.drawable.aaa);
                startActivity(intent);
            }
        });

        imageViewToEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RollDice.class);
                intent.putExtra("diceEight", R.drawable.aaaa);
                startActivity(intent);
            }
        });

        imageViewToTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RollDice.class);
                intent.putExtra("diceTen", R.drawable.aaaaa);
                startActivity(intent);
            }
        });

        imageViewToTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RollDice.class);
                intent.putExtra("diceTwelve", R.drawable.aaaaaa);
                startActivity(intent);
            }
        });

        imageViewToTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RollDice.class);
                intent.putExtra("diceTwenty", R.drawable.aaaaaaa);
                startActivity(intent);
            }
        });
    }
}