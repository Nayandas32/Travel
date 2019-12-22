package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class sain extends AppCompatActivity {
    private WebView wbs;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sain);
        //btn=(Button) findViewById(R.id.regs);
       // btn=(Button) findViewById(R.id.regs);

        wbs = (WebView) findViewById(R.id.WBS);

        String video_link="<iframe width=\"420\" height=\"159\" src=\"https://www.youtube.com/embed/kvld2Ik429A\"" +
                " frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\"" +
                " allowfullscreen></iframe>";

        wbs.setWebViewClient( new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;

            }
        });
        WebSettings ws = wbs.getSettings() ;
        ws.setJavaScriptEnabled(true);
        wbs.loadData(video_link , "text/html" , "utf-8");



    }
}
