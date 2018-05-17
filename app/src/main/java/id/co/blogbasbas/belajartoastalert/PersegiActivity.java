package id.co.blogbasbas.belajartoastalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersegiActivity extends AppCompatActivity {

    //.buat variabel
    EditText pjg , lbr;
    Button hitung ;
    TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //Inisialisasi
        pjg = (EditText) findViewById(R.id.pjg);
        lbr = (EditText) findViewById(R.id.lbr);
        txtHasil = (TextView) findViewById(R.id.hasiltxt);
        hitung = (Button) findViewById(R.id.btnHitung);

        //buat event klik
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buat string untuk menangkap nilai input edittext

                String p = pjg.getText().toString();
                String l = lbr.getText().toString();

                if (p.isEmpty()){
                    pjg.setError("harus di isi ");

                } else if (l.isEmpty()){
                    lbr.setError("harus di isi");
                } else {

                    double panjang = Double.parseDouble(p);
                    double lebar = Double.parseDouble(l);
                    double hasil = panjang * lebar;

                    Toast.makeText(PersegiActivity.this, " hasil dari persegi :" +hasil, Toast.LENGTH_SHORT).show();
                    //tampilkan hasilnya di textview

                    txtHasil.setText("Hasil Luas :" +hasil);

                }
            }
        });

    }
}
