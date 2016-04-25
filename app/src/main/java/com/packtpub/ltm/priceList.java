package com.packtpub.ltm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class priceList extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_list);

        //Spinner for Capacity
        spinner = (Spinner) findViewById(R.id.capacity);
        ArrayAdapter adapterCapa=ArrayAdapter.createFromResource(this,R.array.capa, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapterCapa);

        //Spinner for the Speed
        spinner = (Spinner) findViewById(R.id.speed);
        ArrayAdapter adapterSpd=ArrayAdapter.createFromResource(this,R.array.spd, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapterSpd);

        //Spinner for the Type
        spinner = (Spinner) findViewById(R.id.type);
        ArrayAdapter adapterType=ArrayAdapter.createFromResource(this,R.array.type, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapterType);

        //Spinner for the beam
        spinner = (Spinner) findViewById(R.id.beam);
        ArrayAdapter adapterBeam=ArrayAdapter.createFromResource(this,R.array.beam, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapterBeam);

        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        TextView myText = (TextView) view;
        Toast.makeText(this, "you selected" + myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
