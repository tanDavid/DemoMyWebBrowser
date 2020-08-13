package sg.edu.rp.c346.id19002765.demomywebbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebSettingsActivity extends AppCompatActivity{

    WebView wvPage;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvPage = findViewById(R.id.webViewPage);

        //Extract the URL from the internet
        Intent intentReceive = getIntent();
        String url = intentReceive.getStringExtra("url");

        //Initialize the Client Window
        wvPage.setWebViewClient(new WebViewClient());

        //configure the webView
        WebSettings webSettings = wvPage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        //Load the web page
        wvPage.loadUrl(url);


    }
}
