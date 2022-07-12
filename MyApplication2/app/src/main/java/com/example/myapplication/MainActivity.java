package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.api.IHome;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView homeServiceTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeServiceTv = this.findViewById(R.id.home_service_tv);

        ServiceLoader<IHome> iHomeService = ServiceLoader.load(IHome.class);

        String result = iHomeService.iterator().next().show();
        Log.d(TAG,"--------> " +result);
        homeServiceTv.setText(result);


    }
}