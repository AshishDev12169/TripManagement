package com.example.ashish14060.traipmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String pkgName = getApplicationContext().getPackageName();
        //Toast.makeText(this, pkgName, Toast.LENGTH_LONG).show();
        Toast.makeText(this, ": "+Test.Url, Toast.LENGTH_LONG).show();

        Log.d("Trip", Test.Url);
    }
}
