package com.example.yamuna.yamunaclasstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Website extends AppCompatActivity implements FragmentB.Tracker{
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
    }

    @Override
    public void goUrl(String s) {
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentB.gourl(s);
    }

    @Override
    public void backUrl() {
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentB.backurl();
    }

    @Override
    public void fwdUrl() {
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentB.fwdurl();
    }
}
