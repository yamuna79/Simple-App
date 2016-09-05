package com.example.yamuna.yamunaclasstest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView textView;
    int colors;
    int i1;
    int i2;
    int i3;
    int i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        SharedPreferences pref = getSharedPreferences("MyPref",MODE_PRIVATE);
        i1 = pref.getInt("red",0);
        i2 = pref.getInt("green",0);
        i3 = pref.getInt("blue",0);
        i4 = pref.getInt("black",0);
        textView.setTextColor(pref.getInt("color",0));
    }

    public void red(View view) {
        i1 = Color.rgb(200,0,0);
        colors = i1;
        setColor();
        //textView.setTextColor(Color.RED);
    }

    public void green(View view) {
        i2 = Color.rgb(0,200,0);
        colors = i2;
        setColor();
        //textView.setTextColor(Color.rgb(0,200,0));
    }

    public void blue(View view) {
        i3 = Color.rgb(0,0,200);
        colors = i3;
        setColor();
        //textView.setTextColor(Color.rgb(0,0,200));
    }

    public void reset(View view) {
        i4 = Color.rgb(0,0,0);
        colors = i4;
        setColor();
        //textView.setTextColor(Color.rgb(0,0,0));
    }
    public void setColor(){
        SharedPreferences pref = getSharedPreferences("MyPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("color",colors);
        textView.setTextColor(colors);
        editor.commit();
    }

    public void topRated(View view) {
        Intent intent = new Intent(this,TopRatedd.class);
        startActivity(intent);
    }

    public void random(View view) {
        Intent intent = new Intent(this,Randomize.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.mainmenu:
                Intent intent = new Intent(this,Website.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
