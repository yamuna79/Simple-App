package com.example.yamuna.yamunaclasstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

/**
 * Created by Yamuna on 8/24/2016.
 */
public class TopRatedd extends AppCompatActivity {
    ImageView imageView;
    SeekBar seekBar;
    Button Back;
    Button Next;
    int index=6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_rated);

        imageView = (ImageView) findViewById(R.id.imageView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        Next = (Button) findViewById(R.id.button);
        Back = (Button) findViewById(R.id.button2);
        seekBar.setProgress(index);
        setPic(index);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                switch (i){
                    case 1:
                        imageView.setImageResource(R.drawable.img1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.img2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.img3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.img4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.img5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.img6);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.img7);
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.img8);
                        break;
                    case 9:
                        imageView.setImageResource(R.drawable.img9);
                        break;
                    case 10:
                        imageView.setImageResource(R.drawable.img10);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                setPic(index);
                seekBar.setProgress(index);
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                setPic(index);
                seekBar.setProgress(index);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_rated, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.tablerated:
                Intent intent = new Intent(this,Table.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void setPic(int index){
        switch (index){
            case 1:
                imageView.setImageResource(R.drawable.img1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.img2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.img3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.img4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.img5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.img6);
                break;
            case 7:
                imageView.setImageResource(R.drawable.img7);
                break;
            case 8:
                imageView.setImageResource(R.drawable.img8);
                break;
            case 9:
                imageView.setImageResource(R.drawable.img9);
                break;
            case 10:
                imageView.setImageResource(R.drawable.img10);
                break;
        }
    }
}
