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

public class MainActivity4 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{
    private ImageView duzucgen3;
    private ImageView duzucgen3pre;
    private ImageView kare2;
    private ImageView kare2pre;
    private ImageView yanduzucgen2;
    private ImageView yanduzucgen2pre;
    private ImageView ydikdortgen3;
    private ImageView ydikdortgen3pre;
    private ImageView dikucgen3;
    private ImageView dikucgen3pre;
    private ImageView eskenarucgen;
    private ImageView eskenarucgenpre;
    private ImageView eskenarucgen2;
    private ImageView eskenarucgen2pre;
    public Button next;

    private static final String DUZUCGEN3="duzucgen3";
    private static final String DUZUCGEN3PRE="duzucgen3pre";
    private static final String KARE2="kare2";
    private static final String KARE2PRE="kare2pre";
    private static final String YANDUZUCGEN2="yanduzucgen2";
    private static final String YANDUZUCGEN2PRE="yanduzucgen2pre";
    private static final String YDIKDORTGEN3="ydikdortgen3";
    private static final String YDIKDORTGEN3PRE="ydikdortgen3pre";
    private static final String DIKUCGEN3="dikucgen3";
    private static final String DIKUCGEN3PRE="dikucgen3pre";
    private static final String ESKENARUCGEN="eskenarucgen";
    private static final String ESKENARUCGENPRE="eskenarucgenpre";
    private static final String ESKENARUCGEN2="eskenarucgen2";
    private static final String ESKENARUCGEN2PRE="eskenarucgen2pre";


    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        next = findViewById(R.id.buttonNextFor);

        //Gri
        duzucgen3= findViewById(R.id.duzucgen3);
        duzucgen3.setTag(DUZUCGEN3);
        kare2= findViewById(R.id.kare2);
        kare2.setTag(KARE2);
        yanduzucgen2= findViewById(R.id.yanduzucgen2);
        yanduzucgen2.setTag(YANDUZUCGEN2);
        ydikdortgen3=findViewById(R.id.ydikdortgen3);
        ydikdortgen3.setTag(YDIKDORTGEN3);
        dikucgen3= findViewById(R.id.dikucgen3);
        dikucgen3.setTag(DIKUCGEN3);
        eskenarucgen=findViewById(R.id.eskenarucgen);
        eskenarucgen.setTag(ESKENARUCGEN);
        eskenarucgen2=findViewById(R.id.eskenarucgen2);
        eskenarucgen2.setTag(ESKENARUCGEN2);
        //Renkli
        duzucgen3pre=findViewById(R.id.duzucgen3pre);
        duzucgen3pre.setTag(DUZUCGEN3PRE);
        kare2pre= findViewById(R.id.kare2pre);
        kare2pre.setTag(KARE2PRE);
        yanduzucgen2pre= findViewById(R.id.yanduzucgen2pre);
        yanduzucgen2pre.setTag(YANDUZUCGEN2PRE);
        ydikdortgen3pre=findViewById(R.id.ydikdortgen3pre);
        ydikdortgen3pre.setTag(YDIKDORTGEN3PRE);
        dikucgen3pre= findViewById(R.id.dikucgen3pre);
        dikucgen3pre.setTag(DIKUCGEN3PRE);
        eskenarucgenpre=findViewById(R.id.eskenarucgenpre);
        eskenarucgenpre.setTag(ESKENARUCGENPRE);
        eskenarucgen2pre=findViewById(R.id.eskenarucgen2pre);
        eskenarucgen2pre.setTag(ESKENARUCGEN2PRE);

        //Sürüklenen Nesneler
        duzucgen3pre.setOnTouchListener(this);
        kare2pre.setOnTouchListener(this);
        yanduzucgen2pre.setOnTouchListener(this);
        ydikdortgen3pre.setOnTouchListener(this);
        dikucgen3pre.setOnTouchListener(this);
        eskenarucgenpre.setOnTouchListener(this);
        eskenarucgen2pre.setOnTouchListener(this);

    }

    public void nextButton (View view) {
        Intent intent = new Intent(MainActivity4.this,MainActivity2.class);
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

                // Kullanıcıyı sürüklemenin başladığını bildirmek için, görüntülemeye sarı tonu uyguluyoruz
                ((ImageView) v).setColorFilter(Color.YELLOW);

                // Yeni renk tonunda yeniden çizimi zorlamak için görünümü geçersiz kılın
                v.invalidate();

                // Görünümün kabul edebileceğini belirtmek için true döndürür
                // sürüklenen veriler.
                return true;

            case DragEvent.ACTION_DRAG_ENTERED:

                // Görünüme gri bir ton uygulayın
                ((ImageView) v).setColorFilter(Color.LTGRAY);

                // Yeni renk tonunda yeniden çizimi zorlamak için görünümü geçersiz kılın
                v.invalidate();
                return true;

            case DragEvent.ACTION_DRAG_LOCATION:

                // Olayı görmezden gelin
                return true;

            case DragEvent.ACTION_DRAG_EXITED:


                // Renk tonunu sarı olarak yeniden ayarlar
                ((ImageView) v).setColorFilter(Color.YELLOW);

                // Yeni renk tonunda yeniden çizimi zorlamak için görünümü geçersiz kılın
                v.invalidate();

                return true;

            case DragEvent.ACTION_DROP:
                if(tag2.equals(DUZUCGEN3))
                {
                    duzucgen3.setImageResource(R.drawable.resim5);
                }
                if (tag2.equals(KARE2))
                {
                    kare2.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(YANDUZUCGEN2))
                {
                    yanduzucgen2.setImageResource(R.drawable.sekil3inci);
                }
                if (tag2.equals(YDIKDORTGEN3))
                {
                    ydikdortgen3.setImageResource(R.drawable.resim3inci2);
                }
                if (tag2.equals(DIKUCGEN3))
                {
                    dikucgen3.setImageResource(R.drawable.one1);
                }
                if (tag2.equals(ESKENARUCGEN))
                {
                    eskenarucgen.setImageResource(R.drawable.sekil3inci);
                }
                if (tag2.equals(ESKENARUCGEN2))
                {
                    eskenarucgen2.setImageResource(R.drawable.sekil3inci);
                }



                // Sürüklenen verileri içeren öğeyi alır
                ClipData dragData = event.getClipData();
                // Metin verilerini öğeden alır.
                final String tag = dragData.getItemAt(0).getText().toString();

                // Tüm renk tonlarını kapatır
                ((ImageView) v).clearColorFilter();

                // Yeniden çizmeyi zorlamak için görünümü geçersiz kılar
                v.invalidate();

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
                        Toast.makeText(MainActivity4.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }

                    if (tag2.equals(DUZUCGEN3))
                    {
                        duzucgen3pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(KARE2))
                    {
                        kare2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANDUZUCGEN2))
                    {
                        yanduzucgen2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YDIKDORTGEN3))
                    {
                        ydikdortgen3pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DIKUCGEN3))
                    {
                        dikucgen3pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(ESKENARUCGEN))
                    {
                        eskenarucgenpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(ESKENARUCGEN2))
                    {
                        eskenarucgen2pre.setVisibility(View.INVISIBLE);
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

                if (tag.equals(DUZUCGEN3PRE)) {

                    duzucgen3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(duzucgen3pre);

                }
                else
                    duzucgen3.setOnDragListener((v1, event1) -> false);
                if (tag.equals(KARE2PRE))
                {
                    kare2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(kare2pre);
                }
                else
                    kare2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANDUZUCGEN2PRE))
                {
                    yanduzucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yanduzucgen2pre);
                }
                else
                    yanduzucgen2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YDIKDORTGEN3PRE))
                {
                    ydikdortgen3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(ydikdortgen3pre);
                }
                else
                    ydikdortgen3.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DIKUCGEN3PRE))
                {
                    dikucgen3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(dikucgen3pre);
                }
                else
                    dikucgen3.setOnDragListener((v1, event1) -> false);
                if (tag.equals(ESKENARUCGENPRE))
                {
                    eskenarucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(eskenarucgenpre);
                }
                else
                    eskenarucgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(ESKENARUCGEN2PRE))
                {
                    eskenarucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(eskenarucgen2pre);
                }
                else
                    eskenarucgen2.setOnDragListener((v1, event1) -> false);




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