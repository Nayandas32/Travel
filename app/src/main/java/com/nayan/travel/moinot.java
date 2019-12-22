package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class moinot extends AppCompatActivity {
    Button btn;
    private WebView wbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moinot);
        //btn=(Button) findViewById(R.id.regs);

       // btn=(Button) findViewById(R.id.regs);

        wbm = (WebView) findViewById(R.id.WBM);


        String video_link="<iframe width=\"420\" height=\"159\" src=\"https://www.youtube.com/embed/RXtTh1Nc08o\"" +
                " frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" " +
                "allowfullscreen></iframe>";

        wbm.setWebViewClient( new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;

            }
        });
        WebSettings ws = wbm.getSettings() ;
        ws.setJavaScriptEnabled(true);
        wbm.loadData(video_link , "text/html" , "utf-8");
    }
}
