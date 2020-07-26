package com.servicsofts.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creamos una referencia a la variable que hemos creado
        btnLogin=findViewById(R.id.buttonLogin);
        //asignacion evento click
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //para checkbox
        //CheckBox checkBox = (ChecBox)v
        //boolean seleccionado =checkBox.isChecked
        Log.i("app","click en login");

    }
}