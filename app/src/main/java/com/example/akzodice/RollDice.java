package com.example.akzodice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RollDice extends AppCompatActivity {

    AnimationDrawable diceAnimationFour, diceAnimationSix, diceAnimationEight, diceAnimationTen, diceAnimationTwelve, diceAnimationTwenty;
    ImageView imageViewFour, imageViewSix, imageViewEight, imageViewTen, imageViewTwelve, imageViewTwenty;
    TextView textView, diceExtraNumber, diceExtraRoll;
    Timer timer;
    String diceExtraRollString, diceExtraNumberString;
    int score, number;

    public void init(){
        imageViewFour = findViewById(R.id.imageFour);
        imageViewSix = findViewById(R.id.imageSix);
        imageViewEight = findViewById(R.id.imageEight);
        imageViewTen = findViewById(R.id.imageTen);
        imageViewTwelve = findViewById(R.id.imageTwelve);
        imageViewTwenty = findViewById(R.id.imageTwenty);
        textView = findViewById(R.id.number);
        diceExtraNumber = findViewById(R.id.diceExtraNumber);
        diceExtraRoll = findViewById(R.id.diceExtraRoll);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_dice);

        init();
        ChangeImage();

        imageViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.INVISIBLE);
                if (imageViewFour.getBackground() != null){
                    DiceAnimationFour();
                }
                else if (imageViewSix.getBackground() != null){
                    DiceAnimationSix();
                }
                else if (imageViewEight.getBackground() != null){
                    DiceAnimationEight();
                }
                else if (imageViewTen.getBackground() != null){
                    DiceAnimationTen();
                }
                else if (imageViewTwelve.getBackground() != null){
                    DiceAnimationTwelve();
                }
                else if (imageViewTwenty.getBackground() != null){
                    DiceAnimationTwenty();
                }
            }
        });
    }

    public void ChangeImage(){
        Bundle bundleFour = getIntent().getExtras();
        if (bundleFour != null)
        {
            int res_image_four = bundleFour.getInt("diceFour");
            imageViewFour.setBackgroundResource(res_image_four);
        }

        Bundle bundleSix = getIntent().getExtras();
        if (bundleSix != null)
        {
            int res_image_six = bundleSix.getInt("diceSix");
            imageViewSix.setBackgroundResource(res_image_six);
        }

        Bundle bundleEight = getIntent().getExtras();
        if (bundleEight != null)
        {
            int res_image_eight = bundleEight.getInt("diceEight");
            imageViewEight.setBackgroundResource(res_image_eight);
        }

        Bundle bundleTen = getIntent().getExtras();
        if (bundleTen != null)
        {
            int res_image_ten = bundleTen.getInt("diceTen");
            imageViewTen.setBackgroundResource(res_image_ten);
        }

        Bundle bundleTwelve = getIntent().getExtras();
        if (bundleTwelve != null)
        {
            int res_image_twelve = bundleTwelve.getInt("diceTwelve");
            imageViewTwelve.setBackgroundResource(res_image_twelve);
        }

        Bundle bundleTwenty = getIntent().getExtras();
        if (bundleTwenty != null)
        {
            int res_image_twenty = bundleTwenty.getInt("diceTwenty");
            imageViewTwenty.setBackgroundResource(res_image_twenty);
        }
    }

    public void DiceAnimationFour(){
        score = 0;
        imageViewFour.setBackgroundResource(R.drawable.animationdicefour);
        diceAnimationFour = (AnimationDrawable) imageViewFour.getBackground();
        diceAnimationFour.start();
        Intent intent = getIntent();
        diceExtraRollString = intent.getExtras().getString("diceRollExtra");
        diceExtraRoll.setText(diceExtraRollString);
        diceExtraNumberString = intent.getExtras().getString("diceNumberExtra");
        diceExtraNumber.setText(diceExtraNumberString);
        int extraNumber = Integer.parseInt(diceExtraNumberString);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                diceAnimationFour.stop();
                imageViewFour.setBackgroundResource(R.drawable.aa);
            }
        }, 2800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();

                for (int i=0; i<Integer.parseInt(diceExtraRollString);i++)
                {
                    number = random.nextInt(4) + 1;
                    score = score+number;
                }
                textView.setText(String.valueOf(score+extraNumber));
                textView.setVisibility(View.VISIBLE);
            }
        }, 2800);
    }

    public void DiceAnimationSix(){
        score = 0;
        imageViewSix.setBackgroundResource(R.drawable.animationdicesix);
        diceAnimationSix = (AnimationDrawable) imageViewSix.getBackground();
        diceAnimationSix.start();
        Intent intent = getIntent();
        diceExtraRollString = intent.getExtras().getString("diceRollExtra");
        diceExtraRoll.setText(diceExtraRollString);
        diceExtraNumberString = intent.getExtras().getString("diceNumberExtra");
        diceExtraNumber.setText(diceExtraNumberString);
        int extraNumber = Integer.parseInt(diceExtraNumberString);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                diceAnimationSix.stop();
                imageViewSix.setBackgroundResource(R.drawable.aaa);
            }
        }, 2800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i=0; i<Integer.parseInt(diceExtraRollString); i++)
                {
                    number = random.nextInt(6)+1;
                    score = score+number;
                }
                textView.setText(String.valueOf(score+extraNumber));
                textView.setVisibility(View.VISIBLE);
            }
        }, 2800);
    }

    public void DiceAnimationEight(){
        score = 0;
        imageViewEight.setBackgroundResource(R.drawable.animationdiceeight);
        diceAnimationEight = (AnimationDrawable) imageViewEight.getBackground();
        diceAnimationEight.start();
        Intent intent = getIntent();
        diceExtraRollString = intent.getExtras().getString("diceRollExtra");
        diceExtraRoll.setText(diceExtraRollString);
        diceExtraNumberString = intent.getExtras().getString("diceNumberExtra");
        diceExtraNumber.setText(diceExtraNumberString);
        int extraNumber = Integer.parseInt(diceExtraNumberString);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                diceAnimationEight.stop();
                imageViewEight.setBackgroundResource(R.drawable.aaaa);

            }
        }, 2800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i=0; i<Integer.parseInt(diceExtraRollString); i++)
                {
                    number = random.nextInt(8)+1;
                    score = score+number;
                }
                textView.setText(String.valueOf(score+extraNumber));
                textView.setVisibility(View.VISIBLE);
            }
        }, 2800);
    }

    public void DiceAnimationTen(){
        score = 0;
        imageViewTen.setBackgroundResource(R.drawable.animationdiceten);
        diceAnimationTen = (AnimationDrawable) imageViewTen.getBackground();
        diceAnimationTen.start();
        Intent intent = getIntent();
        diceExtraRollString = intent.getExtras().getString("diceRollExtra");
        diceExtraRoll.setText(diceExtraRollString);
        diceExtraNumberString = intent.getExtras().getString("diceNumberExtra");
        diceExtraNumber.setText(diceExtraNumberString);
        int extraNumber = Integer.parseInt(diceExtraNumberString);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                diceAnimationTen.stop();
                imageViewTen.setBackgroundResource(R.drawable.aaaaa);

            }
        }, 2800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i=0; i<Integer.parseInt(diceExtraRollString); i++)
                {
                    number = random.nextInt(10)+1;
                    score = score+number;
                }
                textView.setText(String.valueOf(score+extraNumber));
                textView.setVisibility(View.VISIBLE);
            }
        }, 2800);
    }

    public void DiceAnimationTwelve(){
        score = 0;
        imageViewTwelve.setBackgroundResource(R.drawable.animationdicetwelve);
        diceAnimationTwelve = (AnimationDrawable) imageViewTwelve.getBackground();
        diceAnimationTwelve.start();
        Intent intent = getIntent();
        diceExtraRollString = intent.getExtras().getString("diceRollExtra");
        diceExtraRoll.setText(diceExtraRollString);
        diceExtraNumberString = intent.getExtras().getString("diceNumberExtra");
        diceExtraNumber.setText(diceExtraNumberString);
        int extraNumber = Integer.parseInt(diceExtraNumberString);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                diceAnimationTwelve.stop();
                imageViewTwelve.setBackgroundResource(R.drawable.aaaaaa);

            }
        }, 2800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i=0; i<Integer.parseInt(diceExtraRollString); i++)
                {
                    number = random.nextInt(12)+1;
                    score = score+number;
                }
                textView.setText(String.valueOf(score+extraNumber));
                textView.setVisibility(View.VISIBLE);
            }
        }, 2800);
    }

    public void DiceAnimationTwenty(){
        score = 0;
        imageViewTwenty.setBackgroundResource(R.drawable.animationdicetwenty);
        diceAnimationTwenty = (AnimationDrawable) imageViewTwenty.getBackground();
        diceAnimationTwenty.start();
        Intent intent = getIntent();
        diceExtraRollString = intent.getExtras().getString("diceRollExtra");
        diceExtraRoll.setText(diceExtraRollString);
        diceExtraNumberString = intent.getExtras().getString("diceNumberExtra");
        diceExtraNumber.setText(diceExtraNumberString);
        int extraNumber = Integer.parseInt(diceExtraNumberString);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                diceAnimationTwenty.stop();
                imageViewTwenty.setBackgroundResource(R.drawable.aaaaaaa);

            }
        }, 2800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i=0; i<Integer.parseInt(diceExtraRollString); i++)
                {
                    number = random.nextInt(20)+1;
                    score = score+number;
                }
                textView.setText(String.valueOf(score+extraNumber));
                textView.setVisibility(View.VISIBLE);
            }
        }, 2800);
    }
}