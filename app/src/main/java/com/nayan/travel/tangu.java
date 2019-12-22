package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class tangu extends AppCompatActivity {
    Button btn;
    private WebView wbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangu);
        //btn=(Button) findViewById(R.id.regs);
        wbt = (WebView) findViewById(R.id.WBT);


        String video_link="<iframe width=\"420\" height=\"159\" src=\"https://www.youtube.com/embed/iWFCVI8uyoo\"" +
                " frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\"" +
                " allowfullscreen></iframe>";

        wbt.setWebViewClient( new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;

            }
        });
        WebSettings ws = wbt.getSettings() ;
        ws.setJavaScriptEnabled(true);
        wbt.loadData(video_link , "text/html" , "utf-8");
    }
}
