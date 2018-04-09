package com.example.kyky.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CustomAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.lv);
        adapter=new CustomAdapter(this,getData());
        lv.setAdapter(adapter);

    }

    private ArrayList getData()
    {
        ArrayList<Spacecraft> spacecrafts=new ArrayList<>();

        Spacecraft s=new Spacecraft();
        s.setName("Bandung");
        s.setPropellant("Jawa Barat");
        s.setImage(R.drawable.bandug);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Bali");
        s.setPropellant("Pulau Bali");
        s.setImage(R.drawable.bali);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Padang");
        s.setPropellant("Sumatera Barat");
        s.setImage(R.drawable.padang);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Karawang");
        s.setPropellant("Jawa Barat");
        s.setImage(R.drawable.karawang);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Bogor");
        s.setPropellant("Jawa Barat");
        s.setImage(R.drawable.bogor);
        spacecrafts.add(s);

        return spacecrafts;
    }


    }
