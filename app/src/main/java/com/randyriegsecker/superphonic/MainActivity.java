package com.randyriegsecker.superphonic;

/*
Author: Randy Riegsecker
Date: 2022/12/17
SuperPhonic is a fun soundboard for both kids and immature adults.
The app demonstrates a simple view with buttons and playing audio files.
 */

import android.media.AudioAttributes;
import android.media.SoundPool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;
    // Simultaneous sounds that can be played.  More is more annoying.
    private final int MAX_STREAMS = 20;

    private SoundPool mSoundPool;

    private int burpId;
    private int car_hornId;
    private int doorbellId;
    private int fartId;
    private int law_and_orderId;
    private int nelson_ha_haId;
    private int rimshotId;
    private int trump_firedId;
    private int sad_tromboneId;
    private int whistleId;
    private int cow_mooId;
    private int price_is_right_loseId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Create a new SoundPool

        AudioAttributes audioAttributes = new AudioAttributes
                .Builder()
                .setUsage(
                        AudioAttributes.USAGE_MEDIA)
                .setContentType(
                        AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool = new SoundPool
                .Builder()
                .setMaxStreams(MAX_STREAMS)
                .setAudioAttributes(audioAttributes)
                .build();

        // Load and get the resource IDs to identify the sounds
        burpId = mSoundPool.load(getApplicationContext(), R.raw.burp, 1);
        car_hornId = mSoundPool.load(getApplicationContext(), R.raw.car_horn, 1);
        doorbellId = mSoundPool.load(getApplicationContext(), R.raw.doorbell, 1);
        fartId = mSoundPool.load(getApplicationContext(), R.raw.fart, 1);
        law_and_orderId = mSoundPool.load(getApplicationContext(), R.raw.law_and_order, 1);
        nelson_ha_haId = mSoundPool.load(getApplicationContext(), R.raw.nelson_ha_ha, 1);
        rimshotId = mSoundPool.load(getApplicationContext(), R.raw.rimshot, 1);
        trump_firedId = mSoundPool.load(getApplicationContext(), R.raw.trump_fired, 1);
        sad_tromboneId = mSoundPool.load(getApplicationContext(), R.raw.sad_trombone, 1);
        whistleId = mSoundPool.load(getApplicationContext(), R.raw.whistle, 1);
        cow_mooId = mSoundPool.load(getApplicationContext(), R.raw.cow_moo, 1);
        price_is_right_loseId = mSoundPool.load(getApplicationContext(), R.raw.price_is_right_lose,1);

        // Link buttons to resource file
        final Button playSadTrombone = this.findViewById(R.id.sadTrombone);
        final Button playNelsonHaHa = this.findViewById(R.id.haha);

        final Button playLawAndOrder = this.findViewById(R.id.lawAndOrder);
        final Button playFart = this.findViewById(R.id.fart);

        final Button playTrumpFired = this.findViewById(R.id.trumpFired);
        final Button playBurp = this.findViewById(R.id.burp);

        final Button playRimshot = this.findViewById(R.id.rimshot);
        final Button playWhistle = this.findViewById(R.id.whistle);

        final Button playDoorbell = this.findViewById(R.id.doorbell);
        final Button playCarHorn = this.findViewById(R.id.carHorn);

        final Button playCowMoo = this.findViewById(R.id.cowMoo);
        final Button playFoghorn = this.findViewById(R.id.priceIsRightLose);


        // Callbacks to play audio when button is clicked

        playSadTrombone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sadTromboneMP.start();
                mSoundPool.play(sad_tromboneId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playNelsonHaHa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(nelson_ha_haId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(fartId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playLawAndOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(law_and_orderId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playTrumpFired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(trump_firedId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playBurp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(burpId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playWhistle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(whistleId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playRimshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(rimshotId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playDoorbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(doorbellId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playCarHorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(car_hornId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playCowMoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(cow_mooId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        playFoghorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(price_is_right_loseId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
    }
}
