package com.example.exp5_2;


import android.content.Intent;
import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MyWebView extends AppCompatActivity  {
    private WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView=(WebView)findViewById(R.id.webview);
        //String url=getIntent().getExtras().getString("url");
       // System.out.println("***********************"+url);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        System.out.println("usr====" + url);

        webView.loadUrl(url);
        // ����WebViewĬ��ͨ��������������ϵͳ���������ҳ����Ϊ��ʹ����ҳ������WebVIew�д�
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //����ֵ��true��ʱ�������ҳ��WebView��ȥ�򿪣����Ϊfalse����ϵͳ�����������������ȥ��
                view.loadUrl(url);
                return true;
            }
            //WebViewClient����WebViewȥ����һЩҳ����ƺ�����֪ͨ

        });
        //����֧��JavaScript
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        //WebView����ҳ������ʹ�û������
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
    }
}
