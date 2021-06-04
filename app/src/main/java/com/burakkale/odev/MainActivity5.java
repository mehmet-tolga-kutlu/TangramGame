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

public class MainActivity5 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener {

    private ImageView eskenar1;
    private ImageView eskenar1pre;
    private ImageView kare3;
    private ImageView kare3pre;
    private ImageView yandik1;
    private ImageView yandik1pre;
    private ImageView eskenar2;
    private ImageView eskenar2pre;
    private ImageView yandik2;
    private ImageView yandik2pre;
    private ImageView doksan;
    private ImageView doksanpre;
    private ImageView yamuk;
    private ImageView yamukpre;
    public Button next;



    private static final String ESKENAR1 = "eskenar1";
    private static final String ESKENAR1PRE = "eskenar1pre";
    private static final String KARE3 = "kare3";
    private static final String KARE3PRE = "kare3pre";
    private static final String YANDIK1 = "yandik1";
    private static final String YANDIK1PRE = "yandik1pre";
    private static final String ESKENAR2 = "eskenar2";
    private static final String ESKENAR2PRE = "eskenar2pre";
    private static final String YANDIK2 = "yandik2";
    private static final String YANDIK2PRE = "yandik2pre";
    private static final String DOKSAN = "doksan";
    private static final String DOKSANPRE = "doksanpre";
    private static final String YAMUK = "yamuk";
    private static final String YAMUKPRE = "yamukpre";

    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        next = findViewById(R.id.buttonNextFive);

        //Gri
        eskenar1=findViewById(R.id.eskenar1);
        eskenar1.setTag(ESKENAR1);
        kare3= findViewById(R.id.kare3);
        kare3.setTag(KARE3);
        yandik1= findViewById(R.id.yandik1);
        yandik1.setTag(YANDIK1);
        eskenar2= findViewById(R.id.eskenar2);
        eskenar2.setTag(ESKENAR2);
        yandik2= findViewById(R.id.yandik2);
        yandik2.setTag(YANDIK2);
        doksan= findViewById(R.id.doksan);
        doksan.setTag(DOKSAN);
        yamuk= findViewById(R.id.yamuk);
        yamuk.setTag(YAMUK);

        //Renkli
        eskenar1pre= findViewById(R.id.eskenar1pre);
        eskenar1pre.setTag(ESKENAR1PRE);
        kare3pre= findViewById(R.id.kare3pre);
        kare3pre.setTag(KARE3PRE);
        yandik1pre= findViewById(R.id.yandik1pre);
        yandik1pre.setTag(YANDIK1PRE);
        eskenar2pre= findViewById(R.id.eskenar2pre);
        eskenar2pre.setTag(ESKENAR2PRE);
        yandik2pre= findViewById(R.id.yandik2pre);
        yandik2pre.setTag(YANDIK2PRE);
        doksanpre= findViewById(R.id.doksanpre);
        doksanpre.setTag(DOKSANPRE);
        yamukpre= findViewById(R.id.yamukpre);
        yamukpre.setTag(YAMUKPRE);

        //Sürüklenen Nesneler
        eskenar1pre.setOnTouchListener(this);
        kare3pre.setOnTouchListener(this);
        yandik1pre.setOnTouchListener(this);
        eskenar2pre.setOnTouchListener(this);
        yandik2pre.setOnTouchListener(this);
        doksanpre.setOnTouchListener(this);
        yamukpre.setOnTouchListener(this);
    }

    public void nextButton (View view) {
        Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
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
                if(tag2.equals(ESKENAR1))
                {
                    eskenar1.setImageResource(R.drawable.resim5);
                }
                if (tag2.equals(KARE3))
                {
                    kare3.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(YANDIK1))
                {
                    yandik1.setImageResource(R.drawable.resimdiger);
                }
                if (tag2.equals(ESKENAR2))
                {
                    eskenar2.setImageResource(R.drawable.resim5);
                }
                if (tag2.equals(YANDIK2))
                {
                    yandik2.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(DOKSAN))
                {
                    doksan.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(YAMUK))
                {
                    yamuk.setImageResource(R.drawable.resimyamu22);
                }




                // Sürüklenen verileri içeren öğeyi alır
                ClipData dragData = event.getClipData();

                // Metin verilerini öğeden alır.
                final String tag = dragData.getItemAt(0).getText().toString();



                return true;


            case DragEvent.ACTION_DRAG_ENDED:
                final String adc = v.getTag().toString();
                // Tüm renk tonlarını kapatır
                ((ImageView) v).clearColorFilter();

                // Yeniden çizmeyi zorlamak için görünümü geçersiz kılar
                v.invalidate();

                // Sonucu kontrol edin
                if (event.getResult()) {
                    //Toast.makeText(MainActivity3.this, "Başarılı !", Toast.LENGTH_SHORT).show();

                    i++;
                    if(i==7)
                    {
                        Toast.makeText(MainActivity5.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }

                    if (tag2.equals(ESKENAR1))
                    {
                        eskenar1pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(KARE3))
                    {
                        kare3pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANDIK1))
                    {
                        yandik1pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(ESKENAR2))
                    {
                        eskenar2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANDIK2))
                    {
                        yandik2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DOKSAN))
                    {
                        doksanpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YAMUK))
                    {
                        yamukpre.setVisibility(View.INVISIBLE);
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

                if (tag.equals(ESKENAR1PRE)) {

                    eskenar1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(eskenar1pre);

                }
                else
                    eskenar1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(KARE3PRE)) {

                    kare3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(kare3pre);

                }
                else
                    kare3.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANDIK1PRE)) {

                    yandik1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yandik1pre);

                }
                else
                    yandik1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(ESKENAR2PRE)) {

                    eskenar2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(eskenar2pre);

                }
                else
                    eskenar2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANDIK2PRE)) {

                    yandik2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yandik2pre);

                }
                else
                    yandik2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DOKSANPRE)) {

                    doksan.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(doksanpre);

                }
                else
                    doksan.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YAMUKPRE)) {

                    yamuk.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yamukpre);

                }
                else
                    yamuk.setOnDragListener((v1, event1) -> false);




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