package com.burakkale.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{

    private ImageView img_1;
    private ImageView img_2;
    private ImageView img_3;
    private ImageView img_4;
    private ImageView img_5;
    private ImageView img_6;
    private ImageView img_7;
    private ImageView img_1_REV;
    private ImageView img_2_REV;
    private ImageView img_3_REV;
    private ImageView img_4_REV;
    private ImageView img_5_REV;
    private ImageView img_6_REV;
    private ImageView img_7_REV;
    public Button next;

    private static final String IMG_1 = "img_1";
    private static final String IMG_2 = "img_2";
    private static final String IMG_3 = "img_3";
    private static final String IMG_4 = "img_4";
    private static final String IMG_5 = "img_5";
    private static final String IMG_6 = "img_6";
    private static final String IMG_7 = "img_7";
    private static final String IMG_1_REV = "img_1_REV";
    private static final String IMG_2_REV = "img_2_REV";
    private static final String IMG_3_REV = "img_3_REV";
    private static final String IMG_4_REV = "img_4_REV";
    private static final String IMG_5_REV = "img_5_REV";
    private static final String IMG_6_REV = "img_6_REV";
    private static final String IMG_7_REV = "img_7_REV";


    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        next = findViewById(R.id.buttonNextEight);

        //Gri
        img_1= findViewById(R.id.img_1);
        img_1.setTag(IMG_1);
        img_2= findViewById(R.id.img_2);
        img_2.setTag(IMG_2);
        img_3= findViewById(R.id.img_3);
        img_3.setTag(IMG_3);
        img_4= findViewById(R.id.img_4);
        img_4.setTag(IMG_4);
        img_5= findViewById(R.id.img_5);
        img_5.setTag(IMG_5);
        img_6= findViewById(R.id.img_6);
        img_6.setTag(IMG_6);
        img_7= findViewById(R.id.img_7);
        img_7.setTag(IMG_7);


        //Renkli
        img_1_REV= findViewById(R.id.img_1_REV);
        img_1_REV.setTag(IMG_1_REV);
        img_2_REV= findViewById(R.id.img_2_REV);
        img_2_REV.setTag(IMG_2_REV);
        img_3_REV= findViewById(R.id.img_3_REV);
        img_3_REV.setTag(IMG_3_REV);
        img_4_REV= findViewById(R.id.img_4_REV);
        img_4_REV.setTag(IMG_4_REV);
        img_5_REV= findViewById(R.id.img_5_REV);
        img_5_REV.setTag(IMG_5_REV);
        img_6_REV= findViewById(R.id.img_7_REV);
        img_6_REV.setTag(IMG_6_REV);
        img_7_REV= findViewById(R.id.img_6_REV);
        img_7_REV.setTag(IMG_7_REV);

        //Sürüklenen Nesneler
        img_1_REV.setOnTouchListener(this);
        img_2_REV.setOnTouchListener(this);
        img_3_REV.setOnTouchListener(this);
        img_4_REV.setOnTouchListener(this);
        img_5_REV.setOnTouchListener(this);
        img_6_REV.setOnTouchListener(this);
        img_7_REV.setOnTouchListener(this);
    }

    public void nextButton (View view) {
        Intent intent = new Intent(MainActivity8.this,MainActivity9.class);
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
                if(tag2.equals(IMG_1))
                {
                    img_1.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(IMG_2))
                {
                    img_2.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(IMG_3))
                {
                    img_3.setImageResource(R.drawable.one1);
                }
                if (tag2.equals(IMG_4))
                {
                    img_4.setImageResource(R.drawable.resim36);
                }
                if (tag2.equals(IMG_5))
                {
                    img_5.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(IMG_6))
                {
                    img_6.setImageResource(R.drawable.resim4);
                }
                if (tag2.equals(IMG_7))
                {
                    img_7.setImageResource(R.drawable.resim6);
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
                        Toast.makeText(MainActivity8.this, "Tamamlandı !", Toast.LENGTH_SHORT).show();
                        next.setVisibility(View.VISIBLE);

                    }

                    if(tag2.equals(IMG_1))
                    {
                        img_1_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(IMG_2))
                    {
                        img_2_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(IMG_3))
                    {
                        img_3_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(IMG_4))
                    {
                        img_4_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(IMG_5))
                    {
                        img_5_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(IMG_6))
                    {
                        img_6_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(IMG_7))
                    {
                        img_7_REV.setVisibility(View.INVISIBLE);
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

                if (tag.equals(IMG_1_REV)) {

                    img_1.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_1_REV);

                }
                else
                    img_1.setOnDragListener((v1, event1) -> false);
                if (tag.equals(IMG_2_REV)) {

                    img_2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_2_REV);

                }
                else
                    img_2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(IMG_3_REV)) {

                    img_3.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_3_REV);

                }
                else
                    img_3.setOnDragListener((v1, event1) -> false);
                if (tag.equals(IMG_4_REV)) {

                    img_4.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_4_REV);

                }
                else
                    img_4.setOnDragListener((v1, event1) -> false);
                if (tag.equals(IMG_5_REV)) {

                    img_5.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_5_REV);

                }
                else
                    img_5.setOnDragListener((v1, event1) -> false);
                if (tag.equals(IMG_6_REV)) {

                    img_6.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_6_REV);

                }
                else
                    img_6.setOnDragListener((v1, event1) -> false);
                if (tag.equals(IMG_7_REV)) {

                    img_7.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(img_7_REV);

                }
                else
                    img_7.setOnDragListener((v1, event1) -> false);




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
