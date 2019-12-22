package com.nayan.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class saj extends AppCompatActivity {
    Button btn;
    public WebView wb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saj);


        //btn=(Button) findViewById(R.id.regs);
        wb = (WebView) findViewById(R.id.WB);

        String video_link="<iframe width=\"420\" height=\"159\" src=\"https://www.youtube.com/embed/qDzRdH4nEoQ\"" +
                " frameborder=\"0\" " +
                "allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";

        wb.setWebViewClient( new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;

            }
        });
        WebSettings ws = wb.getSettings() ;
        ws.setJavaScriptEnabled(true);
        wb.loadData(video_link , "text/html" , "utf-8");
    }
}
