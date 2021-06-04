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

public class MainActivity7 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{

    private ImageView yankar;
    private ImageView yankarpre;
    private ImageView dikucg;
    private ImageView dikucgpre;
    private ImageView yamu;
    private ImageView yamupre;
    private ImageView dikucg2;
    private ImageView dikucg2pre;
    private ImageView esucg;
    private ImageView esucgpre;
    private ImageView esucg2;
    private ImageView esucg2pre;
    private ImageView dikucg3;
    private ImageView dikucg3pre;
    public Button next;

    private static final String YANKAR = "yankar";
    private static final String YANKARPRE = "yankarpre";
    private static final String DIKUCG = "dikucg";
    private static final String DIKUCGPRE = "dikucgpre";
    private static final String YAMU = "yamu";
    private static final String YAMUPRE = "yamupre";
    private static final String DIKUCG2 = "dikucg2";
    private static final String DIKUCG2PRE = "dikucg2pre";
    private static final String ESUCG = "esucg";
    private static final String ESUCGPRE = "esucgpre";
    private static final String ESUCG2 = "esucg2";
    private static final String ESUCG2PRE = "esucg2pre";
    private static final String DIKUCG3 = "dikucg3";
    private static final String DIKUCG3PRE = "dikucg3pre";


    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        next = findViewById(R.id.buttonNextSeven);

        //Gri
        yankar= findViewById(R.id.yankar);
        yankar.setTag(YANKAR);
        dikucg= findViewById(R.id.dikucg);
        dikucg.setTag(DIKUCG);
        yamu= findViewById(R.id.yamu);
        yamu.setTag(YAMU);
        dikucg2= findViewById(R.id.dikucg2);
        dikucg2.setTag(DIKUCG2);
        esucg= findViewById(R.id.esucg);
        esucg.setTag(ESUCG);
        esucg2= findViewById(R.id.esucg2);
        esucg2.setTag(ESUCG2);
        dikucg3= findViewById(R.id.dikucg3);
        dikucg3.setTag(DIKUCG3);


        //Renkli
        yankarpre= findViewById(R.id.yankarpre);
        yankarpre.setTag(YANKARPRE);
        dikucgpre= findViewById(R.id.dikucgpre);
        dikucgpre.setTag(DIKUCGPRE);
        yamupre= findViewById(R.id.yamupre);
        yamupre.setTag(YAMUPRE);
        dikucg2pre= findViewById(R.id.dikucg2pre);
        dikucg2pre.setTag(DIKUCG2PRE);
        esucgpre= findViewById(R.id.esucgpre);
        esucgpre.setTag(ESUCGPRE);
        esucg2pre= findViewById(R.id.esucg2pre);
        esucg2pre.setTag(ESUCG2PRE);
        dikucg3pre= findViewById(R.id.dikucg3pre);
        dikucg3pre.setTag(DIKUCG3PRE);

        //Sürüklenen Nesneler
        yankarpre.setOnTouchListener(this);
        dikucgpre.setOnTouchListener(this);
        yamupre.setOnTouchListener(this);
        dikucg2pre.setOnTouchListener(this);
        esucgpre.setOnTouchListener(this);
        esucg2pre.setOnTouchListener(this);
        dikucg3pre.setOnTouchListener(this);
    }

    public void nextButton (View view) {
        Intent intent = new Intent(MainActivity7.this,MainActivity8.class);
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

                // Olayı görmezden gelin
                return true;

            case DragEvent.ACTION_DRAG_EXITED:

                return true;

            case DragEvent.ACTION_DROP:
                if(tag2.equals(YANKAR))
                {
                    yankar.setImageResource(R.drawable.kareyan);
                }
                if (tag2.equals(DIKUCG))
                {
                    dikucg.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(YAMU))
                {
                    yamu.setImageResource(R.drawable.resimyamu22);
                }
                if (tag2.equals(DIKUCG2))
                {
                    dikucg2.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(ESUCG))
                {
                    esucg.setImageResource(R.drawable.one5);
                }
                if (tag2.equals(ESUCG2))
                {
                    esucg2.setImageResource(R.drawable.sekil3inci);
                }
                if (tag2.equals(DIKUCG3))
                {
                    dikucg3.setImageResource(R.drawable.resim1);
                }




                // Sürüklenen verileri içeren öğeyi alır
                ClipData dragData = event.getClipData();


                return true;


            case DragEvent.ACTION_DRAG_ENDED:
                final String adc = v.getTag().toString();

                // Sonucu kontrol edin
                if (event.getResult()) {
                    //Toast.makeText(MainActivity3.this, "Başarılı !", Toast.LENGTH_SHORT).show();

                    i++;
                    if(i==7)
                    {
                        Toast.makeText(MainActivity7.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }

                    if(tag2.equals(YANKAR))
                    {
                        yankarpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DIKUCG))
                    {
                        dikucgpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YAMU))
                    {
                        yamupre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DIKUCG2))
                    {
                        dikucg2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(ESUCG))
                    {
                        esucgpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(ESUCG2))
                    {
                        esucg2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DIKUCG3))
                    {
                        dikucg3pre.setVisibility(View.INVISIBLE);
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

                if (tag.equals(YANKARPRE)) {

                    yankar.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yankarpre);

                }
                else
                    yankar.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DIKUCGPRE)) {

                    dikucg.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(dikucgpre);

                }
                else
                    dikucg.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YAMUPRE)) {

                    yamu.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yamupre);

                }
                else
                    yamu.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DIKUCG2PRE)) {

                    dikucg2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(dikucg2pre);

                }
                else
                    dikucg2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(ESUCGPRE)) {

                    esucg.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(esucgpre);

                }
                else
                    esucg.setOnDragListener((v1, event1) -> false);
                if (tag.equals(ESUCG2PRE)) {

                    esucg2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(esucg2pre);

                }
                else
                    esucg2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DIKUCG3PRE)) {

                    dikucg3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(dikucg3pre);

                }
                else
                    dikucg3.setOnDragListener((v1, event1) -> false);




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