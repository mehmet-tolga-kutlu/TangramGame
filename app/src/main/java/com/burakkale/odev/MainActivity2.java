package com.burakkale.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{
    private ImageView duzucgen;
    private ImageView duzucgenpre;
    private ImageView kare1;
    private ImageView kare1pre;
    private ImageView yanucgen;
    private ImageView yanucgenpre;
    private ImageView duzucgen2;
    private ImageView duzucgen2pre;
    private ImageView doksanucgen2;
    private ImageView doksanucgen2pre;
    private ImageView yanucgen2;
    private ImageView yanucgen2pre;
    private ImageView ydikdortgen2;
    private ImageView ydikdortgen2pre;
    public Button next;

    private static final String DUZUCGEN ="duzucgen";
    private static final String DUZUCGENPRE ="duzucgenpre";
    private static final String KARE1 ="kare1";
    private static final String KARE1PRE="kare1pre";
    private static final String YANUCGEN="yanucgen";
    private static final String YANUCGENPRE="yanucgenpre";
    private static final String DUZUCGEN2="duzucgen2";
    private static final String DUZUCGEN2PRE="duzucgen2pre";
    private static final String DOKSANUCGEN2="doksanucgen2";
    private static final String DOKSANUCGEN2PRE="doksanucgen2pre";
    private static final String YANUCGEN2="yanucgen2";
    private static final String YANUCGEN2PRE="yanucgen2pre";
    private static final String YDIKDORTGEN2="ydikdortgen2";
    private static final String YDIKDORTGEN2PRE="ydikdortgenpre";


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next = findViewById(R.id.buttonNextTwo);
        //Gri
        duzucgen= findViewById(R.id.duzucgen);
        duzucgen.setTag(DUZUCGEN);
        kare1= findViewById(R.id.kare1);
        kare1.setTag(KARE1);
        yanucgen= findViewById(R.id.yanucgen);
        yanucgen.setTag(YANUCGEN);
        duzucgen2= findViewById(R.id.duzucgen2);
        duzucgen2.setTag(DUZUCGEN2);
        doksanucgen2= findViewById(R.id.doksanucgen2);
        doksanucgen2.setTag(DOKSANUCGEN2);
        yanucgen2= findViewById(R.id.yanucgen2);
        yanucgen2.setTag(YANUCGEN2);
        ydikdortgen2= findViewById(R.id.ydikdortgen2);
        ydikdortgen2.setTag(YDIKDORTGEN2);
        //Renkli
        duzucgenpre= findViewById(R.id.duzucgenpre);
        duzucgenpre.setTag(DUZUCGENPRE);
        kare1pre= findViewById(R.id.kare1pre);
        kare1pre.setTag(KARE1PRE);
        yanucgenpre= findViewById(R.id.yanucgenpre);
        yanucgenpre.setTag(YANUCGENPRE);
        duzucgen2pre= findViewById(R.id.duzucgen2pre);
        duzucgen2pre.setTag(DUZUCGEN2PRE);
        doksanucgen2pre= findViewById(R.id.doksanucgen2pre);
        doksanucgen2pre.setTag(DOKSANUCGEN2PRE);
        yanucgen2pre= findViewById(R.id.yanucgen2pre);
        yanucgen2pre.setTag(YANUCGEN2PRE);
        ydikdortgen2pre= findViewById(R.id.ydikdortgen2pre);
        ydikdortgen2pre.setTag(YDIKDORTGEN2PRE);
        //Sürüklenen Nesneler
        duzucgenpre.setOnTouchListener(this);
        kare1pre.setOnTouchListener(this);
        yanucgenpre.setOnTouchListener(this);
        duzucgen2pre.setOnTouchListener(this);
        doksanucgen2pre.setOnTouchListener(this);
        yanucgen2pre.setOnTouchListener(this);
        ydikdortgen2pre.setOnTouchListener(this);
    }

    public void nextButton (View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
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
                if(tag2.equals(DUZUCGEN))
                {
                    duzucgen.setImageResource(R.drawable.resim5);
                }
                if (tag2.equals(KARE1))
                {
                    kare1.setImageResource(R.drawable.resim6);
                }
                if (tag2.equals(YANUCGEN))
                {
                    yanucgen.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(DUZUCGEN2))
                {
                    duzucgen2.setImageResource(R.drawable.resim5);
                }
                if (tag2.equals(DOKSANUCGEN2))
                {
                    doksanucgen2.setImageResource(R.drawable.resim4);
                }
                if (tag2.equals(YANUCGEN2))
                {
                    yanucgen2.setImageResource(R.drawable.resim2);
                }
                if (tag2.equals(YDIKDORTGEN2))
                {
                    ydikdortgen2.setImageResource(R.drawable.resim3);
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
                        Toast.makeText(MainActivity2.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }


                    if (tag2.equals(DUZUCGEN))
                    {
                        duzucgenpre.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(KARE1))
                    {
                        kare1pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANUCGEN))
                    {
                        yanucgenpre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DUZUCGEN2))
                    {
                       duzucgen2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(DOKSANUCGEN2))
                    {
                        doksanucgen2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YANUCGEN2))
                    {
                        yanucgen2pre.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(YDIKDORTGEN2))
                    {
                        ydikdortgen2pre.setVisibility(View.INVISIBLE);
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

                if (tag.equals(DUZUCGENPRE)) {

                    duzucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(duzucgenpre);

                }
                else
                    duzucgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(KARE1PRE))
                {
                    kare1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(kare1pre);
                }
                else
                    kare1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANUCGENPRE))
                {
                    yanucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yanucgenpre);
                }
                else
                    yanucgen.setOnDragListener((v1, event1) -> false);

                if (tag.equals(DUZUCGEN2PRE))
                {
                    duzucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(duzucgen2pre);
                }
                else
                    duzucgen2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(DOKSANUCGEN2PRE))
                {
                    doksanucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(doksanucgen2pre);
                }
                else
                    doksanucgen2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YANUCGEN2PRE))
                {
                    yanucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(yanucgen2pre);
                }
                else
                    yanucgen2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(YDIKDORTGEN2PRE))
                {
                    ydikdortgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(ydikdortgen2pre);
                }
                else
                    ydikdortgen2.setOnDragListener((v1, event1) -> false);




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
