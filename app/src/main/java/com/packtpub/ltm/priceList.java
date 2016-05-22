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
        capacity = (Spinner) findViewById(R.id.capacityTextView);
        ArrayAdapter adapterCapa=ArrayAdapter.createFromResource(this,R.array.arrayCapacity, android.R.layout.simple_spinner_item);
        capacity.setAdapter(adapterCapa);
        capacity.setOnItemSelectedListener(this);


        //Spinner for the Speed
        speed = (Spinner) findViewById(R.id.speedTextView);
        ArrayAdapter adapterSpd = ArrayAdapter.createFromResource(this,R.array.arraySpeed, android.R.layout.simple_spinner_item);
        speed.setAdapter(adapterSpd);
        speed.setOnItemSelectedListener(this);

/*









        hoistSpeed = (Spinner) findViewById(R.id.hoistSpeedTextView);
        ArrayAdapter adapterType=ArrayAdapter.createFromResource(this,R.array.arrayHoistSpeedSingle, android.R.layout.simple_spinner_item);
        hoistSpeed.setAdapter(adapterType);
*/

        //Spinner for the type
        type = (Spinner) findViewById(R.id.typeTextView);
        ArrayAdapter adapterBeam=ArrayAdapter.createFromResource(this,R.array.arrayType, android.R.layout.simple_spinner_item);
        type.setAdapter(adapterBeam);
        type.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

        //TextView myText = (TextView) view;
        //Toast.makeText(this, myText.getText(), Toast.LENGTH_SHORT).show();

        if(speed.getSelectedItem().toString().equals("Single Speed"))
        {
            hoistSpeed = (Spinner) findViewById(R.id.hoistSpeedTextView);
            ArrayAdapter adapterTypeA=ArrayAdapter.createFromResource(this,R.array.arrayHoistSpeedSingle, android.R.layout.simple_spinner_item);
            hoistSpeed.setAdapter(adapterTypeA);
            hoistSpeed.setOnItemSelectedListener(this);
        }

        else if(speed.getSelectedItem().toString().equals("Dual Speed"))
        {
            hoistSpeed = (Spinner) findViewById(R.id.hoistSpeedTextView);
            ArrayAdapter adapterTypeB=ArrayAdapter.createFromResource(this,R.array.arrayHoistSpeedDouble, android.R.layout.simple_spinner_item);
            hoistSpeed.setAdapter(adapterTypeB);
            hoistSpeed.setOnItemSelectedListener(this);
        }


        if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£989.00");
        }
        /*
        else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1019.00");
        }else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1119.00");
        }else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1836.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1084.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1114.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1214.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1958.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1174.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1204.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1304.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2048.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1294.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1324.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1424.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2168.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1679.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1739.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1899.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2633.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1854.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1914.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2074.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2808.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2474.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2624.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2774.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("8") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3548.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2464.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2614.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2764.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3538.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2754.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2904.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3054.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("4") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3828.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3004.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3154.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3304.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Single Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£4448.00");
        }else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1089.00");
        }else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1119.00");
        }else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1219.00");
        }else if(capacity.getSelectedItem().toString().equals("250") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2053.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1184.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1214.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1314.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2148.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1274.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1304.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1404.00");
        }else if(capacity.getSelectedItem().toString().equals("500") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2338.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1394.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1424.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1524.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2358.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1779.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1839.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1999.00");
        }else if(capacity.getSelectedItem().toString().equals("1000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2823.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£1954.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2014.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2174.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2998.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2574.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2724.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2874.00");
        }else if(capacity.getSelectedItem().toString().equals("2000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("8/2") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3738.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2564.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2714.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2864.00");
        }else if(capacity.getSelectedItem().toString().equals("3200") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3728.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£2854.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3004.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3154.00");
        }else if(capacity.getSelectedItem().toString().equals("4000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("4/1") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£4018.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2/0.8") && type.getSelectedItem().toString().equals("Eye Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3020.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2/0.8") && type.getSelectedItem().toString().equals("Hook Suspension")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3254.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2/0.8") && type.getSelectedItem().toString().equals("Push Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£3404.00");
        }else if(capacity.getSelectedItem().toString().equals("5000") && speed.getSelectedItem().toString().equals("Dual Speed") && hoistSpeed.getSelectedItem().toString().equals("3.2/0.8") && type.getSelectedItem().toString().equals("Electric Travel Trolley")){
            TextView t = (TextView) findViewById(R.id.textView5);
            t.setText("£4638.00");
        }
*/
        }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
