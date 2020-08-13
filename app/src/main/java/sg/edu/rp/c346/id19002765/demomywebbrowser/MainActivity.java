package sg.edu.rp.c346.id19002765.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        etURL = findViewById(R.id.editText);
        wvMyPage = findViewById(R.id.webViewPage);
        wvMyPage.setWebViewClient(new WebViewClient());



        //https://www.grab.com/sg/
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);
            }
        });

    }
}
