package com.alquimista.arkana;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Aquí le decimos que use el archivo XML con los cuadros neón
        setContentView(R.layout.activity_main);
    }
}

