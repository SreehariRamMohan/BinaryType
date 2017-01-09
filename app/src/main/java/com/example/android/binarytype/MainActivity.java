package com.example.android.binarytype;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText et = (EditText) findViewById(R.id.textArea);

        Button binary0 = (Button) findViewById(R.id.zero);
        Button binary1 = (Button) findViewById(R.id.one);

        binary0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.append("0 ");
            }
        });


        binary1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.append("1 ");
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_COMMA) {

            Toast.makeText(getApplicationContext(), "HISHF", Toast.LENGTH_SHORT).show();
        }
            // Do Code here

        else if(keyCode == KeyEvent.KEYCODE_B) {
            Log.v("w","worked");
        }


        else if(keyCode == KeyEvent.KEYCODE_1) {
        }


        return super.onKeyDown(keyCode, event); }


}
