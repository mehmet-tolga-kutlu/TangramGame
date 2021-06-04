package com.burakkale.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToHomePage = new Intent(this,GameStartScreen.class);
        startActivity(intentToHomePage);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void changeActivity(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);




    }
    public void droped(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);




    }
    public void drone(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity5.class);
        startActivity(intent); }

    public void done(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity6.class);
        startActivity(intent); }

    public void bolum2(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent); }
    public void bolum7(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity7.class);
        startActivity(intent); }
    public void main8(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity8.class);
        startActivity(intent); }
    public void main9(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity9.class);
        startActivity(intent); }
    public void main10(View view){

        Intent intent = new Intent(MainActivity.this,MainActivity10.class);
        startActivity(intent); }
}