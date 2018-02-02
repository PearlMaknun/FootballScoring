package inf.camp.bso.footballscoring;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {

    Button btnDetailPersib, btnDetailPersija;
    TextView txtScorePersija, txtScorePersib, txtHasilAkhir;
    Integer ScorePersija = 0, ScorePersib = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        btnDetailPersib = findViewById(R.id.btn_detailpersib);
        btnDetailPersija = findViewById(R.id.btn_detailpersija);

        btnDetailPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DetailPERSIBActivity.class);
                startActivity(i);
            }
        });
        btnDetailPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DetailPERSIJAActivity.class);
                startActivity(i);
            }
        });
    }

    public void AddScorePersija(View v) {
        ScorePersija = ScorePersija + 1;
        setScore();

    }

    public void AddScorePersib(View v) {
        ScorePersib = ScorePersib + 1;
        setScore();
    }

    public void MinScorePersija(View v) {
        if(ScorePersija>0){
            ScorePersija = ScorePersija - 1;
            setScore();
        }
    }

    public void MinScorePersib(View v) {
        if(ScorePersib>0){
            ScorePersib = ScorePersib - 1;
            setScore();
        }
    }

    public void Selesai(View v) {
        String HS = "";
        txtHasilAkhir = findViewById(R.id.tv_hasil);
        if (ScorePersija > ScorePersib){
            HS = "PERSIJA MENANG";
        }
        else if(ScorePersib > ScorePersija){
            HS = "PERSIB MENANG";
        }
        else if(ScorePersija == ScorePersib) {
            HS = "PERTANDINGAN SERI";
        }
        txtHasilAkhir.setText("Hasil Akhir: " + HS);
    }

    public void Reset(View v) {
        ScorePersib = 0;
        ScorePersija = 0;
        txtHasilAkhir = findViewById(R.id.tv_hasil);
        txtHasilAkhir.setText("Hasil Akhir: ");
        setScore();
    }

    public void Berita(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        String urllink = "https://tirto.id/hasil-persija-vs-persib-1-0-laga-diwarnai-kontroversi-czxS";
        browserIntent.setData(Uri.parse(urllink));
        startActivity(browserIntent);
    }

    public void Map(View v) {
        Uri gmmIntentUri = Uri.parse("geo:-6.957276, 107.712062");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    public void setScore(){
        txtScorePersija = findViewById(R.id.tv_scorepersija);
        txtScorePersib = findViewById(R.id.tv_scorepersib);
        txtScorePersija.setText(""+ScorePersija);
        txtScorePersib.setText(""+ScorePersib);

    }
}
