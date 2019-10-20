package nania.android.kameraaplikasi.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import nania.android.kameraaplikasi.R;

public class TampilPesan extends AppCompatActivity {

    private TextView namaPembeliText;
    private TextView barangText;
    private TextView jumlahText;
    private TextView alamatText;

    public static final String NAMAPEMBELI_KEY = "namaPembeli";
    public static final String BARANG_KEY = "namaBarang";
    public static final String JUMLAH_KEY = "jumlah";
    public static final String ALAMAT_KEY = "alamat";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_pesan);

        // TODO: bind here
        namaPembeliText = (TextView) findViewById(R.id.input_nama);
        barangText = (TextView) findViewById(R.id.input_barang);
        jumlahText = (TextView) findViewById(R.id.input_pesanan);
        alamatText = (TextView) findViewById(R.id.input_alamat);


        Bundle extras = getIntent().getExtras();

        String nama = extras.getString(NAMAPEMBELI_KEY);
        String lahir = extras.getString(BARANG_KEY);
        String jumlah = extras.get(JUMLAH_KEY).toString();
        String alamat = extras.get(ALAMAT_KEY).toString();

        if (extras != null) {
            // TODO: display value here

            namaPembeliText.setText(nama);
            barangText.setText(lahir);
            jumlahText.setText(jumlah);
            alamatText.setText(alamat);
        }
    }

    public void exit(View view) {
        finish();
        System.exit(0);
    }
}
