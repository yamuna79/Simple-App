package com.example.yamuna.yamunaclasstest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Yamuna on 8/24/2016.
 */
public class FragmentB extends Fragment {
    WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        webView = (WebView) view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        return view;
    }

    public void gourl(String s){
        webView.loadUrl(s);
    }
    public void backurl(){
        if(webView.canGoBack()){
            webView.goBack();
        }
    }
    public void fwdurl(){
        if(webView.canGoForward()){
            webView.goForward();
        }
    }

    public interface Tracker{
        public void goUrl(String s);
        public void backUrl();
        public void fwdUrl();
    }
}
