package id.co.blogbasbas.belajartoastalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {

    //deklarasi varaibel
    WebView webView;
    EditText formUrl;
    Button cari ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
    //inisialisasi dan cari id nya
        webView = (WebView) findViewById(R.id.web);
        formUrl= (EditText) findViewById(R.id.urlform);
        cari = (Button) findViewById(R.id.cari);
        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buat method baru untuk menangkap isi url

                tampilkanWeb();
            }
        });

      /*  //set webviewnya menjadi client web
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        //load url, cari urlnya apa yang ingin kita load ?

        webView.loadUrl("https://www.youtube.com/");
*/


    }

    private void tampilkanWeb() {

        String url = formUrl.getText().toString();
        //set webviewnya menjadi client web
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        //apa yang kita isi di form url di tangkap oleh di load url
        webView.loadUrl(url);

    }
}
