package id.co.blogbasbas.belajartoastalert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewInternalActivity extends AppCompatActivity {
    //buat variabel
    WebView webInternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_internal);

        //inisialiasasi id
        webInternal = (WebView) findViewById(R.id.webInternal);
        webInternal.setWebViewClient(new WebViewClient());
        webInternal.getSettings().setJavaScriptEnabled(true);
        //ambil web yg di simpan di asset
        webInternal.loadUrl("file:///android_asset/sukses.html");


    }
}
