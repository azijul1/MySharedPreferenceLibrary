package com.threemdigital.MySharedPreferenceLib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.mobtexting.sharedprefrencelib.MySharedPrefrennce;

public class MainActivity extends AppCompatActivity {
    private TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv=(TextView)findViewById(R.id.txtv);

        MySharedPrefrennce mySharedPrefrennce=MySharedPrefrennce.getInstance(getBaseContext());
        mySharedPrefrennce.saveStringData("test","dhananjay");


        String dataStr=mySharedPrefrennce.getStringData("test");
        txtv.setText(dataStr);
    }
}
