package com.example.android.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import static android.R.attr.fragment;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1  , btn3 ,btn4 ;
    Fragment fr1 , fr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);

        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(this);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCuZ880Zcmt6vwf85oSW3Uvg"));
                startActivity(intent);
            }
        }) ;


        btn4.setOnClickListener(this);



        fr1= new fragment1();


        fr4 = new fragment4();

    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(v == btn1){
            ft.replace(R.id.fragment_place,fr1);

        }

        else if (v==btn4){
            ft.replace(R.id.fragment_place,fr4);


        }
        ft.commit();

    }

}
