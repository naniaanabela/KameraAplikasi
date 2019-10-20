package nania.android.kameraaplikasi.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import nania.android.kameraaplikasi.R;
import nania.android.kameraaplikasi.activities.TampilPesan;

/**
 * A simple {@link Fragment} subclass.
 */
public class PesanFragment extends Fragment {

    private EditText namaInput;
    private EditText barangInput;
    private EditText jumlahInput;
    private EditText alamatInput;

    public PesanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pesan, container, false);
        namaInput = (EditText) view.findViewById(R.id.input_nama);
        barangInput = (EditText) view.findViewById(R.id.input_barang);
        jumlahInput = (EditText) view.findViewById(R.id.input_pesan);
        alamatInput = (EditText) view.findViewById(R.id.input_alamat);
        Button button = (Button) view.findViewById(R.id.button_pesan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaPembeli = namaInput.getText().toString();
                String namaBarang = barangInput.getText().toString();
                int jumlah = Integer.parseInt(jumlahInput.getText().toString());
                String alamat = alamatInput.getText().toString();
//
                Intent intent = new Intent(getActivity(), TampilPesan.class);
                intent.putExtra("namaPembeli", namaPembeli);
                intent.putExtra("namaBarang", namaBarang);
                intent.putExtra("jumlah", jumlah);
                intent.putExtra("alamat", alamat);
//
                startActivity(intent);
//        Toast.makeText(getApplicationContext(), "TEST", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
