package com.burakkale.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameStartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start_screen);
    }

    public void playGame (View view) {
        Intent intent = new Intent(GameStartScreen.this,MainActivity.class);
        startActivity(intent);
    }

    public void quitGame (View view) {

        moveTaskToBack(true);
    }

    public void helpGame (View view) {
        Intent intent = new Intent(GameStartScreen.this,GameHelp.class);
        startActivity(intent);
    }

}