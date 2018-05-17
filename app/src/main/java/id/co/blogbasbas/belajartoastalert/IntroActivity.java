package id.co.blogbasbas.belajartoastalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IntroActivity extends AppCompatActivity {

    EditText nameEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //buat inisialisasi
        nameEdt = (EditText) findViewById(R.id.nameEdt);

    }

    // sama fungsinya dengan onClcikeListiner

    public void buttonPindah(View view) {

        //buat string untuk menangakap isian dari editetext nameEdt

        String nama = nameEdt.getText().toString();

        //kita buat kondisi untuk text yang kosong
        if (nama.isEmpty()) {
            nameEdt.setError("tidak bisa kosong");

        }
        //jangan lupa tambahkan else
        else {


            //intent berfungsi untuk mengirimkan data, pindah aktivity dll
            Intent pindah = new Intent(IntroActivity.this, MainActivity.class);

            //buat perintah untuk parse / mengirimkan data menggunakan intent

            pindah.putExtra("nm", nama);

            startActivity(pindah);
        }
    }
}

//setelah kita tambahkan event pindah
// sekarang kita tambahkan form isian pada layout, untuk mengisi nama