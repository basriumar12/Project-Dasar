package id.co.blogbasbas.belajartoastalert;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //buat variabel
    Button toast , count, alert;
    TextView showCount;
    int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialiasi variabel dengan id widget
        toast = (Button) findViewById(R.id.toast);
        count = (Button) findViewById(R.id.count);
        showCount = (TextView) findViewById(R.id.showCount);
        alert = (Button) findViewById(R.id.alert);


        //berikan even pada button toast
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this, "Ini Button Toast", Toast.LENGTH_SHORT).show();
                }
        });

        //berikan event pada button count
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //m count di tambah terys setiap di klik buttonya
                mCount++;
                //kondisi jika text kosong maka text akan di tambah sejumlah klik button
                if (showCount != null){
                    showCount.setText(Integer.toString(mCount));
                }

            }
        });

        //tambah button alert
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //panggil kelas alert, buat obejek namanya aBuilder
                AlertDialog.Builder aBuilder = new AlertDialog.Builder(MainActivity.this);

                //buat titelnya
                aBuilder.setTitle("Ini ALert Dialog");
                //buat pesan alertnya
                aBuilder.setMessage(" ini adalah pesan dari alert");

                //alert memiliki 3 button, yaitu positive button, negative dan neutrall
                aBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                   //ini postive button


                    }
                });

                aBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        //ini negative button
                    }
                });

                aBuilder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        //ini button cancel
                    }
                });

                //tambahkan showw
                aBuilder.show();
            }
        });



    }

    // buat folder menu di res
    //tambahkan method untuk menu item , ada 2 item seperti dibwah ini

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.mn_about ){
            //buat alertdialog
            AlertDialog.Builder alBuilder = new AlertDialog.Builder(this);
            alBuilder.setTitle("App -");
            alBuilder.setMessage(" v 1.0.0 -  Copyright 2017");
            alBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {


                }
            });

            alBuilder.show();

        } else if ( id == R.id.mn_browser){
          //akses ke webviewactivity
            startActivity(new Intent(MainActivity.this, WebViewActivity.class));
        } else if (id == R.id.mn_webInternal){
            startActivity(new Intent(MainActivity.this, WebViewInternalActivity.class));
        } else if (id== R.id.mn_persegi){
            startActivity(new Intent(MainActivity.this, PersegiActivity.class));
        }


            return super.onOptionsItemSelected(item);


}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menut_item, menu);
        return super.onCreateOptionsMenu(menu);


    }
}






