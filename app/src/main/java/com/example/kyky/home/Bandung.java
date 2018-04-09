package com.example.kyky.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Bandung extends AppCompatActivity {

    TextView sblk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandung);

        sblk = (TextView) findViewById(R.id.seblak) ;

        sblk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seblaks = new Intent(Bandung.this, seblak.class);
                startActivity(seblaks);
            }
        });
    }
}
