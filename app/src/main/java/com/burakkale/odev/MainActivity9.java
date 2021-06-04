package com.burakkale.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{

    private ImageView main9_kare1;
    private ImageView main9_kare2;
    private ImageView main9_kare3;
    private ImageView main9_kose;
    private ImageView main9_ucgen;
    private ImageView main9_kare4;
    private ImageView main9_kare5;
    private ImageView main9_kose2;
    private ImageView main9_ucgen2;
    public Button next;

    private ImageView main9_kare1_REV;
    private ImageView main9_kare2_REV;
    private ImageView main9_kare3_REV;
    private ImageView main9_kose_REV;
    private ImageView main9_ucgen_REV;
    private ImageView main9_kare4_REV;
    private ImageView main9_kare5_REV;
    private ImageView main9_kose2_REV;
    private ImageView main9_ucgen2_REV;



    private static final String MAIN9_KARE1 = "main9_kare1";
    private static final String MAIN9_KARE2 = "main9_kare2";
    private static final String MAIN9_KARE3 = "main9_kare3";
    private static final String MAIN9_KOSE = "main9_kose";
    private static final String MAIN9_UCGEN = "main9_ucgen";
    private static final String MAIN9_KARE4 = "main9_kare4";
    private static final String MAIN9_KARE5 = "main9_kare5";
    private static final String MAIN9_KOSE2 = "main9_kose2";
    private static final String MAIN9_UCGEN2 = "main9_ucgen2";


    private static final String MAIN9_KARE1_REV = "main9_kare1_REV";
    private static final String MAIN9_KARE2_REV = "main9_kare2_REV";
    private static final String MAIN9_KARE3_REV = "main9_kare3_REV";
    private static final String MAIN9_KOSE_REV = "main9_kose_REV";
    private static final String MAIN9_UCGEN_REV = "main9_ucgen_REV";
    private static final String MAIN9_KARE4_REV = "main9_kare4_REV";
    private static final String MAIN9_KARE5_REV = "main9_kare5_REV";
    private static final String MAIN9_KOSE2_REV = "main9_kose2_REV";
    private static final String MAIN9_UCGEN2_REV = "main9_ucgen2_REV";


    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        next = findViewById(R.id.buttonNextNine);

        //Gri
        main9_kare1= findViewById(R.id.main9_kare1);
        main9_kare1.setTag(MAIN9_KARE1);
        main9_kare2= findViewById(R.id.main9_kare2);
        main9_kare2.setTag(MAIN9_KARE2);
        main9_kare3= findViewById(R.id.main9_kare3);
        main9_kare3.setTag(MAIN9_KARE3);
        main9_kose= findViewById(R.id.main9_kose);
        main9_kose.setTag(MAIN9_KOSE);
        main9_ucgen= findViewById(R.id.main9_ucgen);
        main9_ucgen.setTag(MAIN9_UCGEN);
        main9_kare4= findViewById(R.id.main9_kare4);
        main9_kare4.setTag(MAIN9_KARE4);
        main9_kare5= findViewById(R.id.main9_kare5);
        main9_kare5.setTag(MAIN9_KARE5);
        main9_kose2= findViewById(R.id.main9_kose2);
        main9_kose2.setTag(MAIN9_KOSE2);
        main9_ucgen2= findViewById(R.id.main9_ucgen2);
        main9_ucgen2.setTag(MAIN9_UCGEN2);


        //Renkli
        main9_kare1_REV= findViewById(R.id.main9_kare1_REV);
        main9_kare1_REV.setTag(MAIN9_KARE1_REV);
        main9_kare2_REV= findViewById(R.id.main9_kare2_REV);
        main9_kare2_REV.setTag(MAIN9_KARE2_REV);
        main9_kare3_REV= findViewById(R.id.main9_kare3_REV);
        main9_kare3_REV.setTag(MAIN9_KARE3_REV);
        main9_kose_REV= findViewById(R.id.main9_kose_REV);
        main9_kose_REV.setTag(MAIN9_KOSE_REV);
        main9_ucgen_REV= findViewById(R.id.main9_ucgen_REV);
        main9_ucgen_REV.setTag(MAIN9_UCGEN_REV);
        main9_kare4_REV= findViewById(R.id.main9_kare4_REV);
        main9_kare4_REV.setTag(MAIN9_KARE4_REV);
        main9_kare5_REV= findViewById(R.id.main9_kare5_REV);
        main9_kare5_REV.setTag(MAIN9_KARE5_REV);
        main9_kose2_REV= findViewById(R.id.main9_kose2_REV);
        main9_kose2_REV.setTag(MAIN9_KOSE2_REV);
        main9_ucgen2_REV= findViewById(R.id.main9_ucgen2_REV);
        main9_ucgen2_REV.setTag(MAIN9_UCGEN2_REV);

        //Sürüklenen Nesneler
        main9_kare1_REV.setOnTouchListener(this);
        main9_kare2_REV.setOnTouchListener(this);
        main9_kare3_REV.setOnTouchListener(this);
        main9_kose_REV.setOnTouchListener(this);
        main9_ucgen_REV.setOnTouchListener(this);
        main9_kare4_REV.setOnTouchListener(this);
        main9_kare5_REV.setOnTouchListener(this);
        main9_kose2_REV.setOnTouchListener(this);
        main9_ucgen2_REV.setOnTouchListener(this);

    }

    public void buttonNext (View view) {
        Intent intent = new Intent(MainActivity9.this,MainActivity10.class);
        startActivity(intent);
    }

    int i = 0;

    @Override
    public boolean onDrag(View v, DragEvent event) {

        // Gelen olay için eylem türünü saklayın
        final int action = event.getAction();
        String tag2 = v.getTag().toString();

        // Hbeklenen olayların her birini andlar
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:

                return true;

            case DragEvent.ACTION_DRAG_ENTERED:

                return true;

            case DragEvent.ACTION_DRAG_LOCATION:

                // Olayı gormezden gelin
                return true;

            case DragEvent.ACTION_DRAG_EXITED:


                return true;

            case DragEvent.ACTION_DROP:
                if(tag2.equals(MAIN9_KARE1))
                {
                    main9_kare1.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(MAIN9_KARE2))
                {
                    main9_kare2.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(MAIN9_KARE3))
                {
                    main9_kare3.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(MAIN9_KOSE))
                {
                    main9_kose.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(MAIN9_UCGEN))
                {
                    main9_ucgen.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(MAIN9_KARE4))
                {
                    main9_kare4.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(MAIN9_KARE5))
                {
                    main9_kare5.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(MAIN9_KOSE2))
                {
                    main9_kose2.setImageResource(R.drawable.resimdiger);
                }
                if (tag2.equals(MAIN9_UCGEN2))
                {
                    main9_ucgen2.setImageResource(R.drawable.one1);
                }




                // Sürüklenen verileri içeren oğeyi alır
                ClipData dragData = event.getClipData();

                return true;


            case DragEvent.ACTION_DRAG_ENDED:
                final String adc = v.getTag().toString();

                // Sonucu kontrol edin
                if (event.getResult()) {
                    //Toast.makeText(MainActivity3.this, "Başarılı !", Toast.LENGTH_SHORT).show();

                    i++;
                    if(i==9)
                    {
                        Toast.makeText(MainActivity9.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }

                    if(tag2.equals(MAIN9_KARE1))
                    {
                        main9_kare1_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_KARE2))
                    {
                        main9_kare2_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_KARE3))
                    {
                        main9_kare3_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_KOSE))
                    {
                        main9_kose_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_UCGEN))
                    {
                        main9_ucgen_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_KARE4))
                    {
                        main9_kare4_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_KARE5))
                    {
                        main9_kare5_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_KOSE2))
                    {
                        main9_kose2_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN9_UCGEN2))
                    {
                        main9_ucgen2_REV.setVisibility(View.INVISIBLE);
                    }

                }

                else {
                    // Toast.makeText(MainActivity3.this, "Tekrar Deneyin !", Toast.LENGTH_SHORT).show();

                    // if (adc.equals(RESIM_ETIKET3)) {
                    //   ydpre.setImageBitmap(null);
                    //  }// else {
                    //  supre.setImageBitmap(null);
                    //  }
                }

                return true;

            default:
                break;
        }

        return false;

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        String tag = v.getTag().toString();

        View.DragShadowBuilder mShadow = null;
        //v.setVisibility(View.INVISIBLE);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                ClipData data = ClipData.newPlainText("some label", tag);

                if (tag.equals(MAIN9_KARE1_REV)) {

                    main9_kare1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kare1_REV);

                }
                else
                    main9_kare1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_KARE2_REV)) {

                    main9_kare2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kare2_REV);

                }
                else
                    main9_kare2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_KARE3_REV)) {

                    main9_kare3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kare3_REV);

                }
                else
                    main9_kare3.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_KOSE_REV)) {

                    main9_kose.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kose_REV);

                }
                else
                    main9_kose.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_UCGEN_REV)) {

                    main9_ucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_ucgen_REV);

                }
                else
                    main9_ucgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_KARE4_REV)) {

                    main9_kare4.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kare4_REV);

                }
                else
                    main9_kare4.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_KARE5_REV)) {

                    main9_kare5.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kare5_REV);

                }
                else
                    main9_kare5.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_KOSE2_REV)) {

                    main9_kose2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_kose2_REV);

                }
                else
                    main9_kose2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN9_UCGEN2_REV)) {

                    main9_ucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main9_ucgen2_REV);

                }
                else
                    main9_ucgen2.setOnDragListener((v1, event1) -> false);




                v.startDrag(data, mShadow, null, 0);
                break;

            case MotionEvent.ACTION_UP:
                v.performClick();

                break;

            default:
                break;
        }

        return false;
    }

}
