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

public class MainActivity6 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{

    private ImageView yanes1;
    private ImageView yanes1pre;
    private ImageView yanes2;
    private ImageView yanes2pre;
    private ImageView yankare;
    private ImageView yankarepre;
    private ImageView eskenarb;
    private ImageView eskenarbpre;
    private ImageView diku1;
    private ImageView diku1pre;
    private ImageView diku2;
    private ImageView diku2pre;
    private ImageView yamux;
    private ImageView yamuxpre;
    public Button next;

    private static final String YANES1 = "yanes1";
    private static final String YANES1PRE = "yanes1pre";
    private static final String YANES2 = "yanes2";
    private static final String YANES2PRE = "yanes2pre";
    private static final String YANKARE = "yankare2";
    private static final String YANKAREPRE = "yankare2pre";
    private static final String ESKENARB = "eskenarb";
    private static final String ESKENARBPRE = "eskenarb";
    private static final String DIKU1 = "diku1";
    private static final String DIKU1PRE = "diku1pre";
    private static final String DIKU2 = "diku2";
    private static final String DIKU2PRE = "diku2pre";
    private static final String YAMUX = "yamux";
    private static final String YAMUXPRE = "yamuxpre";

    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        next = findViewById(R.id.buttonNextSix);

        //Gri
        yanes1= findViewById(R.id.yanes1);
        yanes1.setTag(YANES1);
        yanes2= findViewById(R.id.yanes2);
        yanes2.setTag(YANES2);
        yankare= findViewById(R.id.yankare);
        yankare.setTag(YANKARE);
        eskenarb= findViewById(R.id.eskenarb);
        eskenarb.setTag(ESKENARB);
        diku1= findViewById(R.id.diku1);
        diku1.setTag(DIKU1);
        diku2= findViewById(R.id.diku2);
        diku2.setTag(DIKU2);
        yamux= findViewById(R.id.yamux);
        yamux.setTag(YAMUX);


        //Renkli
        yanes1pre= findViewById(R.id.yanes1pre);
        yanes1pre.setTag(YANES1PRE);
        yanes2pre= findViewById(R.id.yanes2pre);
        yanes2pre.setTag(YANES2PRE);
        yankarepre= findViewById(R.id.yankarepre);
        yankarepre.setTag(YANKAREPRE);
        eskenarbpre= findViewById(R.id.eskenarbpre);
        eskenarbpre.setTag(ESKENARBPRE);
        diku1pre= findViewById(R.id.diku1pre);
        diku1pre.setTag(DIKU1PRE);
        diku2pre= findViewById(R.id.diku2pre);
        diku2pre.setTag(DIKU2PRE);
        yamuxpre= findViewById(R.id.yamuxpre);
        yamuxpre.setTag(YAMUXPRE);

        //Sürüklenen Nesneler
        yanes1pre.setOnTouchListener(this);
        yanes2pre.setOnTouchListener(this);
        yankarepre.setOnTouchListener(this);
        eskenarbpre.setOnTouchListener(this);
        diku1pre.setOnTouchListener(this);
        diku2pre.setOnTouchListener(this);
        yamuxpre.setOnTouchListener(this);

    }

    public void nextButton (View view) {
        Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
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
                if(tag2.equals(YANES1))
                {
                    yanes1.setImageResource(R.drawable.one5);
                }
                if (tag2.equals(YANES2))
                {
                    yanes2.setImageResource(R.drawable.sekil3inci);
                }
                if (tag2.equals(YANKARE))
                {
                    yankare.setImageResource(R.drawable.kareyan);
                }
                if (tag2.equals(ESKENARB))
                {
                    eskenarb.setImageResource(R.drawable.one3);
                }
                if (tag2.equals(DIKU1))
                {
                    diku1.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(DIKU2))
                {
                    diku2.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(YAMUX))
                {
                    yamux.setImageResource(R.drawable.debum);
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
                        Toast.makeText(MainActivity6.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }

                    if (tag2.equals(YANES1))
                    {
                        yanes1pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANES2))
                    {
                        yanes2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANKARE))
                    {
                        yankarepre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(ESKENARB))
                    {
                        eskenarbpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DIKU1))
                    {
                        diku1pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DIKU2))
                    {
                        diku2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YAMUX))
                    {
                        yamuxpre.setVisibility(View.INVISIBLE);
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

                if (tag.equals(YANES1PRE)) {

                    yanes1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yanes1pre);

                }
                else
                    yanes1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANES2PRE)) {

                    yanes2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yanes2pre);

                }
                else
                    yanes2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANKAREPRE)) {

                    yankare.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yankarepre);

                }
                else
                    yankare.setOnDragListener((v1, event1) -> false);
                if (tag.equals(ESKENARBPRE)) {

                    eskenarb.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(eskenarbpre);

                }
                else
                    eskenarb.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DIKU1PRE)) {

                    diku1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(diku1pre);

                }
                else
                    diku1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DIKU2PRE)) {

                    diku2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(diku2pre);

                }
                else
                    diku2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YAMUXPRE)) {

                    yamux.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yamuxpre);

                }
                else
                    yamux.setOnDragListener((v1, event1) -> false);




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