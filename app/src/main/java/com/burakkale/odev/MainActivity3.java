package com.burakkale.odev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener {
    private ImageView ydikdortgen;
    private ImageView solucgen;
    private ImageView sagucgen;
    private ImageView duzuzgen;
    private ImageView kare;
    private ImageView yanduzucgen;
    private ImageView saguc;

    private ImageView ydpre;
    private ImageView ydupre;
    private ImageView supre;
    private ImageView dupre;
    private ImageView supre2;
    private ImageView kpre;
    private ImageView sugpre;
    //Gri Nesneler
    private static final String RESIM_ETIKET2 = "ydikdortgen";
    private static final String RESIM_ETIKET3 = "solucgen";
    private static final String RESIM_ETIKET4 = "sagucgen";
    private static final String RESIM_ETIKET5 = "duzuzgen";
    private static final String RESIM_ETIKET6 = "kare";
    private static final String RESIM_ETIKET7 = "yanduzucgen";
    private static final String RESIM_ETIKET8 = "saguc";
    //Renkli Nesneler
    private static final String RESIM_ETIKET9 = "ydpre";
    private static final String RESIM_ETIKET10 = "ydupre";
    private static final String RESIM_ETIKET11 = "supre";
    private static final String RESIM_ETIKET12 = "dupre";
    private static final String RESIM_ETIKET13 = "supre2";
    private static final String RESIM_ETIKET14 = "kpre";
    private static final String RESIM_ETIKET15 = "sugpre";
    private ViewGroup.LayoutParams layoutParams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //Gri Nesneler
        ydikdortgen = findViewById(R.id.ydikdortgen);
        ydikdortgen.setTag(RESIM_ETIKET2);
        solucgen = findViewById(R.id.solucgen);
        solucgen.setTag(RESIM_ETIKET3);
        sagucgen = findViewById(R.id.sagucgen);
        sagucgen.setTag(RESIM_ETIKET4);
        duzuzgen = findViewById(R.id.duzuzgen);
        duzuzgen.setTag(RESIM_ETIKET5);
        kare = findViewById(R.id.kare);
        kare.setTag(RESIM_ETIKET6);
        yanduzucgen= findViewById(R.id.yanduzucgen);
        yanduzucgen.setTag(RESIM_ETIKET7);
        saguc = findViewById(R.id.saguc);
        saguc.setTag(RESIM_ETIKET8);
        //Renkli Nesneler
        ydpre = findViewById(R.id.ydpre);
        ydpre.setTag(RESIM_ETIKET9);
        ydupre =findViewById(R.id.ydupre);
        ydupre.setTag(RESIM_ETIKET10);
        supre =findViewById(R.id.supre);
        supre.setTag(RESIM_ETIKET11);
        dupre =findViewById(R.id.dupre);
        dupre.setTag(RESIM_ETIKET12);
        supre2 = findViewById(R.id.supre2);
        supre2.setTag(RESIM_ETIKET13);
        kpre = findViewById(R.id.kpre);
        kpre.setTag(RESIM_ETIKET14);
        sugpre = findViewById(R.id.sugpre);
        sugpre.setTag(RESIM_ETIKET15);

        //Sürüklenen nesneler
        ydpre.setOnTouchListener(this);
        ydupre.setOnTouchListener(this);
        supre.setOnTouchListener(this);
        dupre.setOnTouchListener(this);
        supre2.setOnTouchListener(this);
        kpre.setOnTouchListener(this);
        sugpre.setOnTouchListener(this);
        //Bırakılan Yerler
       /* ydikdortgen.setOnDragListener(this);
        solucgen.setOnDragListener(this);
        sagucgen.setOnDragListener(this);
        duzuzgen.setOnDragListener(this);
        kare.setOnDragListener(this);
        yanduzucgen.setOnDragListener(this);
        saguc.setOnDragListener(this);*/
    }
    public void next(View view){
        Intent intent=new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(intent);
    }
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
                if(tag2.equals(RESIM_ETIKET2))
                {
                    ydikdortgen.setImageResource(R.drawable.one2);
                }
                if(tag2.equals(RESIM_ETIKET6))
                {
                    kare.setImageResource(R.drawable.resim6);
                }
                if(tag2.equals(RESIM_ETIKET3))
                {
                    solucgen.setImageResource(R.drawable.one1);
                }
                if(tag2.equals(RESIM_ETIKET8))
                {
                    saguc.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(RESIM_ETIKET5))
                {
                    duzuzgen.setImageResource(R.drawable.one3);
                }
                if (tag2.equals(RESIM_ETIKET7))
                {
                    yanduzucgen.setImageResource(R.drawable.one5);
                }
                if(tag2.equals(RESIM_ETIKET4))
                {
                    sagucgen.setImageResource(R.drawable.resim2);
                }

                // Sürüklenen verileri içeren öğeyi alır
                ClipData dragData = event.getClipData();

                // Metin verilerini öğeden alır.
                final String tag = dragData.getItemAt(0).getText().toString();

                // Sürüklenen verileri içeren bir mesaj görüntüler.
                Toast.makeText(MainActivity3.this, "The dragged image is " + tag, Toast.LENGTH_SHORT).show();

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
                    Toast.makeText(MainActivity3.this, "Başarılı !", Toast.LENGTH_SHORT).show();
                    if (tag2.equals(RESIM_ETIKET6))
                    {
                    kpre.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(RESIM_ETIKET2))
                    {
                    ydpre.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(RESIM_ETIKET3))
                    {
                        supre.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(RESIM_ETIKET8))
                    {
                        supre2.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(RESIM_ETIKET5))
                    {
                        dupre.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(RESIM_ETIKET7))
                    {
                        ydupre.setVisibility(View.INVISIBLE);

                    }
                    if (tag2.equals(RESIM_ETIKET4))
                    {
                        sugpre.setVisibility(View.INVISIBLE);

                    }

                }

                else {
                    Toast.makeText(MainActivity3.this, "Tekrar Deneyin !", Toast.LENGTH_SHORT).show();

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

               if (tag.equals(RESIM_ETIKET9)) {

                   ydikdortgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(ydpre);

               }
               else
                   ydikdortgen.setOnDragListener((v1, event1) -> false);

                if (tag.equals(RESIM_ETIKET11)) {

                    solucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(supre);

                }
                else
                    solucgen.setOnDragListener(((v1, event1) -> false));

                if (tag.equals(RESIM_ETIKET13)) {

                    saguc.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(supre2);

                }
                else
                    saguc.setOnDragListener((v1, event1) -> false);

                if (tag.equals(RESIM_ETIKET12)) {

                    duzuzgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(dupre);

                }
                else
                    duzuzgen.setOnDragListener((v1, event1) -> false);

                if (tag.equals(RESIM_ETIKET10))
                {
                    yanduzucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(ydupre);

                }
                else
                    yanduzucgen.setOnDragListener((v1, event1) -> false);

                if (tag.equals(RESIM_ETIKET14))
                {
                    kare.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(kpre);

                }
                else
                    kare.setOnDragListener((v1, event1) -> false);

                if (tag.equals(RESIM_ETIKET15))
                {

                    sagucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(sugpre);
                }
                else
                    sagucgen.setOnDragListener((v1, event1) -> false);


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
