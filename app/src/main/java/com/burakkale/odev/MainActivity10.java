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

public class MainActivity10 extends AppCompatActivity implements View.OnDragListener, View.OnTouchListener{

    private ImageView main10_ucgen;
    private ImageView main10_kucgen;
    private ImageView main10_kucgen2;
    private ImageView main10_oucgen;
    private ImageView main10_dortgen;
    private ImageView main10_bdortgen;

    private ImageView main10_ucgen_REV;
    private ImageView main10_kucgen_REV;
    private ImageView main10_kucgen2_REV;
    private ImageView main10_oucgen_REV;
    private ImageView main10_dortgen_REV;
    private ImageView main10_bdortgen_REV;
    public Button end;


    private static final String MAIN10_UCGEN= "main10_ucgen";
    private static final String MAIN10_KUCGEN = "main10_kucgen";
    private static final String MAIN10_KUCGEN2 = "main10_kucgen2";
    private static final String MAIN10_OUCGEN = "main10_oucgen";
    private static final String MAIN10_DORTGEN = "main10_dortgen";
    private static final String MAIN10_BDORTGEN = "main10_bdortgen";

    private static final String MAIN10_UCGEN_REV = "main10_ucgen_REV";
    private static final String MAIN10_KUCGEN_REV = "main10_kucgen_REV";
    private static final String MAIN10_KUCGEN2_REV = "main10_kucgen2_REV";
    private static final String MAIN10_OUCGEN_REV = "main10_oucgen_REV";
    private static final String MAIN10_DORTGEN_REV = "main10_dortgen_REV";
    private static final String MAIN10_BDORTGEN_REV = "main10_bdortgen_REV";


    public void onBackPressed() {
        super.onBackPressed();
        Intent intentToMain = new Intent(this,MainActivity.class);
        startActivity(intentToMain);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        end = findViewById(R.id.buttonFinish);

        //Gri
        main10_ucgen= findViewById(R.id.main10_ucgen);
        main10_ucgen.setTag(MAIN10_UCGEN);
        main10_kucgen= findViewById(R.id.main10_kucgen);
        main10_kucgen.setTag(MAIN10_KUCGEN);
        main10_kucgen2= findViewById(R.id.main10_kucgen2);
        main10_kucgen2.setTag(MAIN10_KUCGEN2);
        main10_oucgen= findViewById(R.id.main10_oucgen);
        main10_oucgen.setTag(MAIN10_OUCGEN);
        main10_dortgen= findViewById(R.id.main10_dortgen);
        main10_dortgen.setTag(MAIN10_DORTGEN);
        main10_bdortgen= findViewById(R.id.main10_bdortgen);
        main10_bdortgen.setTag(MAIN10_BDORTGEN);



        //Renkli
        main10_ucgen_REV= findViewById(R.id.main10_ucgen_REV);
        main10_ucgen_REV.setTag(MAIN10_UCGEN_REV);
        main10_kucgen_REV= findViewById(R.id.main10_kucgen_REV);
        main10_kucgen_REV.setTag(MAIN10_KUCGEN_REV);
        main10_kucgen2_REV= findViewById(R.id.main10_kucgen2_REV);
        main10_kucgen2_REV.setTag(MAIN10_KUCGEN2_REV);
        main10_oucgen_REV= findViewById(R.id.main10_oucgen_REV);
        main10_oucgen_REV.setTag(MAIN10_OUCGEN_REV);
        main10_dortgen_REV= findViewById(R.id.main10_dortgen_REV);
        main10_dortgen_REV.setTag(MAIN10_DORTGEN_REV);
        main10_bdortgen_REV= findViewById(R.id.main10_bdortgen_REV);
        main10_bdortgen_REV.setTag(MAIN10_BDORTGEN_REV);


        //Sürüklenen Nesneler
        main10_ucgen_REV.setOnTouchListener(this);
        main10_kucgen_REV.setOnTouchListener(this);
        main10_kucgen2_REV.setOnTouchListener(this);
        main10_oucgen_REV.setOnTouchListener(this);
        main10_dortgen_REV.setOnTouchListener(this);
        main10_bdortgen_REV.setOnTouchListener(this);

    }

    public void buttonEnd (View view) {
        Intent intent = new Intent(MainActivity10.this,MainActivity.class);
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
                if(tag2.equals(MAIN10_UCGEN))
                {
                    main10_ucgen.setImageResource(R.drawable.resim1);
                }
                if (tag2.equals(MAIN10_KUCGEN))
                {
                    main10_kucgen.setImageResource(R.drawable.one5);
                }
                if (tag2.equals(MAIN10_KUCGEN2))
                {
                    main10_kucgen2.setImageResource(R.drawable.one4);
                }
                if (tag2.equals(MAIN10_OUCGEN))
                {
                    main10_oucgen.setImageResource(R.drawable.ucgen45);
                }
                if (tag2.equals(MAIN10_DORTGEN))
                {
                    main10_dortgen.setImageResource(R.drawable.kareyan);
                }
                if (tag2.equals(MAIN10_BDORTGEN))
                {
                    main10_bdortgen.setImageResource(R.drawable.resimyamu22);
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
                    if(i==6)
                    {
                        Toast.makeText(MainActivity10.this, "Tamamlandı!", Toast.LENGTH_SHORT).show();
                        end.setVisibility(View.VISIBLE);

                    }

                    if(tag2.equals(MAIN10_UCGEN))
                    {
                        main10_ucgen_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN10_KUCGEN))
                    {
                        main10_kucgen_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN10_KUCGEN2))
                    {
                        main10_kucgen2_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN10_OUCGEN))
                    {
                        main10_oucgen_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN10_DORTGEN))
                    {
                        main10_dortgen_REV.setVisibility(View.INVISIBLE);
                    }
                    if (tag2.equals(MAIN10_BDORTGEN))
                    {
                        main10_bdortgen_REV.setVisibility(View.INVISIBLE);
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

                if (tag.equals(MAIN10_UCGEN_REV)) {

                    main10_ucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main10_ucgen_REV);

                }
                else
                    main10_ucgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN10_KUCGEN_REV)) {

                    main10_kucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main10_kucgen_REV);

                }
                else
                    main10_kucgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN10_KUCGEN2_REV)) {

                    main10_kucgen2.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main10_kucgen2_REV);

                }
                else
                    main10_kucgen2.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN10_OUCGEN_REV)) {

                    main10_oucgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main10_oucgen_REV);

                }
                else
                    main10_oucgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN10_DORTGEN_REV)) {

                    main10_dortgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main10_dortgen_REV);

                }
                else
                    main10_dortgen.setOnDragListener((v1, event1) -> false);
                if (tag.equals(MAIN10_BDORTGEN_REV)) {

                    main10_bdortgen.setOnDragListener(this);
                    mShadow = new View.DragShadowBuilder(main10_bdortgen_REV);

                }
                else
                    main10_bdortgen.setOnDragListener((v1, event1) -> false);





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
