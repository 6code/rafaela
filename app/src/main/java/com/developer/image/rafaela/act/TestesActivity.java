package com.developer.image.rafaela.act;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;

import com.developer.image.rafaela.R;

public class TestesActivity extends AppCompatActivity {

    //botoes stop
    private ImageButton s1;
    private ImageButton s2;
    private ImageButton s3;
    private ImageButton s4;
    private ImageButton s5;

    //botoes pause
    private ImageButton p1;
    private ImageButton p2;
    private ImageButton p3;
    private ImageButton p4;
    private ImageButton p5;

    //cronometros
    private Chronometer c1;
    private Chronometer c2;
    private Chronometer c3;
    private Chronometer c4;
    private Chronometer c5;

    //armazena os milisegundos
    private long l1;
    private long l2;
    private long l3;
    private long l4;
    private long l5;

    //botoes de navegacoes de tela
    private Button indice;
    private Button reiniciar;

    //strung de permisao
    private String[] MinhasPermissoes = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};


    //oncreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //veririfca se o ususario ja deu a permissao
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED){

        } else {
            //pede a permissao para o usuario
            ActivityCompat.requestPermissions(this, MinhasPermissoes, 1);
        }


        //recuperando os elementos pelo id
        s1 = (ImageButton)findViewById(R.id.s1);
        s2 = (ImageButton)findViewById(R.id.s2);
        s3 = (ImageButton)findViewById(R.id.s3);
        s4 = (ImageButton)findViewById(R.id.s4);
        s5 = (ImageButton)findViewById(R.id.s5);


        p1 = (ImageButton)findViewById(R.id.p1);
        p2 = (ImageButton)findViewById(R.id.p2);
        p3 = (ImageButton)findViewById(R.id.p3);
        p4 = (ImageButton)findViewById(R.id.p4);
        p5 = (ImageButton)findViewById(R.id.p5);


        c1 = (Chronometer)findViewById(R.id.c1);
        c2 = (Chronometer)findViewById(R.id.c2);
        c3 = (Chronometer)findViewById(R.id.c3);
        c4 = (Chronometer)findViewById(R.id.c4);
        c5 = (Chronometer)findViewById(R.id.c5);

        indice = (Button)findViewById(R.id.indice);
        reiniciar =(Button)findViewById(R.id.reiniciar);

        final int[] is1 = {0};
        final int[] is2 = {0};
        final int[] is3 = {0};
        final int[] is4 = {0};
        final int[] is5 = {0};

        final int[] ip1 = {0};
        final int[] ip2 = {0};
        final int[] ip3 = {0};
        final int[] ip4 = {0};
        final int[] ip5 = {0};

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                c1.setBase(SystemClock.elapsedRealtime());
                c1.start();
                s1.setImageResource(R.drawable.recarregar);
                s1.setBackgroundResource(R.color.colorPrimary);

                if(is1[0] ==1){

                    s1.setBackgroundResource(R.color.colorPrimaryDark);
                    is1[0] = 0;
                }else {

                    is1[0] = 1;
                }

            }
        });


        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c2.setBase(SystemClock.elapsedRealtime());
                c2.start();
                s2.setImageResource(R.drawable.recarregar);
                s2.setBackgroundResource(R.color.colorPrimary);


                if(is2[0] ==1){

                    s2.setBackgroundResource(R.color.colorPrimaryDark);
                    is2[0] = 0;
                }else {

                    is2[0] = 1;
                }

            }
        });


        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c3.setBase(SystemClock.elapsedRealtime());
                c3.start();
                s3.setImageResource(R.drawable.recarregar);
                s3.setBackgroundResource(R.color.colorPrimary);

                if(is3[0] ==1){

                    s3.setBackgroundResource(R.color.colorPrimaryDark);
                    is3[0] = 0;
                }else {

                    is3[0] = 1;
                }

            }
        });


        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c4.setBase(SystemClock.elapsedRealtime());
                c4.start();
                s4.setImageResource(R.drawable.recarregar);
                s4.setBackgroundResource(R.color.colorPrimary);

                if(is4[0] ==1){

                    s4.setBackgroundResource(R.color.colorPrimaryDark);
                    is4[0] = 0;
                }else {

                    is4[0] = 1;
                }

            }
        });


        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c5.setBase(SystemClock.elapsedRealtime());
                c5.start();
                s5.setImageResource(R.drawable.recarregar);
                s5.setBackgroundResource(R.color.colorPrimary);

                if(is5[0] ==1){

                    s5.setBackgroundResource(R.color.colorPrimaryDark);
                    is5[0] = 0;
                }else {

                    is5[0] = 1;
                }

            }
        });


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                l1 = SystemClock.elapsedRealtime() - c1.getBase();
                c1.stop();
                p1.setBackgroundResource(R.color.colorPrimary);

                if(ip1[0] ==1){

                    p1.setBackgroundResource(R.color.colorPrimaryDark);

                    ip1[0]=0;
                }else {

                    ip1[0] = 1;
                }

            }
        });


        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                l2 = SystemClock.elapsedRealtime() - c2.getBase();
                c2.stop();
                p2.setBackgroundResource(R.color.colorPrimary);

                if(ip2[0] ==1){

                    p2.setBackgroundResource(R.color.colorPrimaryDark);

                    ip2[0]=0;
                }else {

                    ip2[0] = 1;
                }
            }
        });


        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                l3 = SystemClock.elapsedRealtime() - c3.getBase();
                c3.stop();
                p3.setBackgroundResource(R.color.colorPrimary);

                if(ip3[0] ==1){

                    p3.setBackgroundResource(R.color.colorPrimaryDark);

                    ip3[0]=0;
                }else {

                    ip3[0] = 1;
                }
            }
        });


        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                l4 = SystemClock.elapsedRealtime() - c4.getBase();
                c4.stop();
                p4.setBackgroundResource(R.color.colorPrimary);

                if(ip4[0] ==1){

                    p4.setBackgroundResource(R.color.colorPrimaryDark);

                    ip4[0]=0;
                }else {

                    ip4[0] = 1;
                }
            }
        });


        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                l5 = SystemClock.elapsedRealtime() - c5.getBase();
                c5.stop();
                p5.setBackgroundResource(R.color.colorPrimary);

                if(ip5[0] ==1){

                    p5.setBackgroundResource(R.color.colorPrimaryDark);

                    ip5[0]=0;
                }else {

                    ip5[0] = 1;
                }

            }
        });



        indice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TestesActivity.this, ResultadoActivity.class);

                Bundle bundle = new Bundle();

                bundle.putLong("resultado1", l1);
                bundle.putLong("resultado2", l2);
                bundle.putLong("resultado3", l3);
                bundle.putLong("resultado4", l4);
                bundle.putLong("resultado5", l5);

                intent.putExtras(bundle);

                startActivity(intent);
                finish();


            }
        });


        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TestesActivity.this, TestesActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
