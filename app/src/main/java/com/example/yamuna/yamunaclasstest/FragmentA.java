package com.example.yamuna.yamunaclasstest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Yamuna on 8/24/2016.
 */
public class FragmentA extends Fragment {
    EditText url;
    EditText url1;
    EditText url2;
    Button Go;
    Button Back;
    Button Forward;
    Button Clear;
    FragmentB.Tracker tracker;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        url = (EditText) view.findViewById(R.id.editText3);
        url1 = (EditText) view.findViewById(R.id.editText4);
        url2 = (EditText) view.findViewById(R.id.editText5);
        Go = (Button) view.findViewById(R.id.go);
        Back = (Button) view.findViewById(R.id.back);
        Forward = (Button) view.findViewById(R.id.fwd);
        Clear = (Button) view.findViewById(R.id.clr);

        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tracker = (Website) getActivity();
                String str = url.getText().toString();
                String st = url1.getText().toString();
                String strn = url2.getText().toString();
                tracker.goUrl(str+st+strn);
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tracker = (Website)getActivity();
                tracker.backUrl();
            }
        });

        Forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tracker = (Website)getActivity();
                tracker.fwdUrl();
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url.getText().clear();
                url1.getText().clear();
                url2.getText().clear();
            }
        });

        return view;

    }
}
