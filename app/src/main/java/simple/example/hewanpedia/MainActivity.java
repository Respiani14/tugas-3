package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKatak,btnSemut,btnKelinci;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKatak = findViewById(R.id.btn_buka_ras_katak);
        btnSemut = findViewById(R.id.btn_buka_ras_semut);
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnKatak.setOnClickListener(view -> bukaGaleri("Katak"));
        btnSemut.setOnClickListener(view -> bukaGaleri("Semut"));
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity ikan");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, Myprofil.class);
        startActivity(intent);
    }
}