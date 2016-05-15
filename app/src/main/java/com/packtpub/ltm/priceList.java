package com.packtpub.ltm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class priceList extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner capacity;
    Spinner speed;
    Spinner hoistSpeed;
    Spinner type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_price_list);


        //Spinner for Capacity
        capacity = (Spinner) findViewById(R.id.capacity);
        ArrayAdapter adapterCapa=ArrayAdapter.createFromResource(this,R.array.arrayCapacity, android.R.layout.simple_spinner_item);
        capacity.setAdapter(adapterCapa);

        capacity.setOnItemSelectedListener(this);

        //Spinner for the Speed
        speed = (Spinner) findViewById(R.id.speed);
        ArrayAdapter adapterSpd = ArrayAdapter.createFromResource(this,R.array.arraySpeed, android.R.layout.simple_spinner_item);
        speed.setAdapter(adapterSpd);

        speed.setOnItemSelectedListener(this);

        //Spinner for the HoistSpeed

        if(speed.getSelectedItem().toString().equals("Single Speed"))
        {
        hoistSpeed = (Spinner) findViewById(R.id.hoistSpeed);
        ArrayAdapter adapterType=ArrayAdapter.createFromResource(this,R.array.arrayHoistSpeedSingle, android.R.layout.simple_spinner_item);
        hoistSpeed.setAdapter(adapterType);
            hoistSpeed.setOnItemSelectedListener(this);
        }

        else if(speed.getSelectedItem().toString().equals("Dual Speed"))
        {
            hoistSpeed = (Spinner) findViewById(R.id.hoistSpeed);
            ArrayAdapter adapterType=ArrayAdapter.createFromResource(this,R.array.arrayHoistSpeedDouble, android.R.layout.simple_spinner_item);
            hoistSpeed.setAdapter(adapterType);
            hoistSpeed.setOnItemSelectedListener(this);
        }

        //Spinner for the type
        type = (Spinner) findViewById(R.id.type);
        ArrayAdapter adapterBeam=ArrayAdapter.createFromResource(this,R.array.arrayType, android.R.layout.simple_spinner_item);
        type.setAdapter(adapterBeam);

        type.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

//        TextView myText = (TextView) view;
//        Toast.makeText(this, myText.getText(), Toast.LENGTH_SHORT).show();

        if (capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Eye Suspension")) {
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£989.00");
        } else if (capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Hook Suspension")) {
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1019.00");
        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
