package com.example.customtoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomToast(View view) {
        LayoutInflater inflater=getLayoutInflater();
        View appearance=inflater.inflate(R.layout.custom_layout,(ViewGroup)findViewById(R.id.root_layout));

        Toast toast=new Toast(MainActivity.this);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);


        toast.setView(appearance);

        toast.show();
    }

    public void ilovetobeenjoy(View view) {
        Toast.makeText( getApplicationContext(), "I am Fine!!!",Toast.LENGTH_SHORT).show();

    }
}
