package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class debota extends AppCompatActivity {
    Button btn;
    private WebView wbd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debota);
        //btn=(Button) findViewById(R.id.regs);

        //btn=(Button) findViewById(R.id.regs);

        wbd = (WebView) findViewById(R.id.WBd);

        String video_link="<iframe width=\"420\" height=\"159\" src=\"https://www.youtube.com/embed/vthZBnapd2o\"" +
                " frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\"" +
                " allowfullscreen></iframe>";
        wbd.setWebViewClient( new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;

            }
        });

        WebSettings ws = wbd.getSettings() ;
        ws.setJavaScriptEnabled(true);
        wbd.loadData(video_link , "text/html" , "utf-8");







    }
}
