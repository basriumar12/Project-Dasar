package id.co.blogbasbas.belajartoastalert;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SPlashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //panggil kelas handler dan buat objeknya
        Handler handler = new Handler();
        //panggil postdelayed
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //intent ke activity lain, dengan cara berikut ini

                startActivity(new Intent(SPlashScreenActivity.this,
                        IntroActivity.class));
                //berikan event finish, agar ketika tekan tombol back gak di kembalikan di splashscreen
                finish();


            }
        }, 8000); //lama dari splash screen 8 detik

    }
}
//untuk splash screen hanya seperti itu,
//selanjutnya kita buat intent ke activity sesudah splash screen