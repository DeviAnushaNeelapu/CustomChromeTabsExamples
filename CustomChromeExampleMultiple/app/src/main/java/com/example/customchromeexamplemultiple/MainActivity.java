package com.example.customchromeexamplemultiple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button openlinkbutton,java,python,android,datascience,javascripts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openlinkbutton=findViewById(R.id.button);
        java=findViewById(R.id.java);
        android=findViewById(R.id.android);
        datascience=findViewById(R.id.datascience);
        python=findViewById(R.id.python);
        javascripts=findViewById(R.id.javascripts);


        final String url="https://www.google.com";
        openlinkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencustomTab(url);
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String javas="https://www.journaldev.com/";
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
                builder.addDefaultShareMenuItem();
                CustomTabsIntent customTabsIntent=builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(javas));

            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String python="https://www.python.org/";
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
                builder.addDefaultShareMenuItem();
                CustomTabsIntent customTabsIntent=builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(python ));

            }
        });
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String javas="https://www.journaldev.com/";
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
                builder.addDefaultShareMenuItem();
                CustomTabsIntent customTabsIntent=builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(javas));

            }
        });
        datascience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String javas="https://www.journaldev.com/";
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
                builder.addDefaultShareMenuItem();
                CustomTabsIntent customTabsIntent=builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(javas));

            }
        });
        javascripts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String javas="https://www.journaldev.com/";
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
                builder.addDefaultShareMenuItem();
                CustomTabsIntent customTabsIntent=builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(javas));

            }
        });
    }

    public void opencustomTab(String url) {
        CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.colorPrimary));
        builder.addDefaultShareMenuItem();
        //builder.setActionButton(R.mipmap.ic_launcher,"welcome",0,true);
      //  final Bitmap backButton = BitmapFactory.decodeResource(getResources(), R.drawable.ic_arrow_back_black_48dp);
        CustomTabsIntent customTabsIntent=builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

}