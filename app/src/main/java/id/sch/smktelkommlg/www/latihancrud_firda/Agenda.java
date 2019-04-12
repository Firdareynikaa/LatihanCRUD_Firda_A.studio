package id.sch.smktelkommlg.www.latihancrud_firda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Agenda extends AppCompatActivity {
    private Button buttondaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        buttondaftar = findViewById(R.id.buttondaftar);
        ImageView
                paperNote = findViewById(R.id.paper_note);
        paperNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new
                        Intent(Agenda.this, ShareActivity.class);
                startActivity(intent);
            }
        });
//Memfungsikan button daftar
        buttondaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new
                        Intent(Agenda.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    //Untuk mendisablekan button back
    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(android.R.anim.slide_in_left,
                android.R.anim.slide_out_right);
    }
}
