package com.example.yamuna.yamunaclasstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;

public class Randomize extends AppCompatActivity {
    TextView random;
    TextView sorted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomize);

        random = (TextView) findViewById(R.id.textView4);
        sorted = (TextView) findViewById(R.id.textView5);
    }

    public void randomize(View view) {
        int[] num = new int[5];
        for(int i = 0; i<num.length; i++){
            num[i] = (int)(Math.random()*10 + 1);
        }
        random.setText(Arrays.toString(num));
        sorted.setText(Arrays.toString(sortArray(num)));
    }
    static int[] sortArray(int[] sortMe) {
        int j;
        for (int i=0; i<sortMe.length-1; i++) {
            j = findMinIndex(sortMe,i);
            swapArrayElements(sortMe,i,j);
        }
        return sortMe;
    }
    static int findMinIndex(int[] scanMe, int start) {
        int minIndex = start;
        for (int i=start + 1; i<scanMe.length; i++) {
            if (scanMe[i] < scanMe[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    static void swapArrayElements(int[] intArray, int i, int j) {
        int tmp;

        tmp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = tmp;
    }

    public void clear(View view) {
        random.setText(" ");
        sorted.setText(" ");
    }
}
