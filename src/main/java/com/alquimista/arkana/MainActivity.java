package com.alquimista.arkana;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectamos el Visor de la Matrix
        final EditText visor = findViewById(R.id.visor_escritura);
        
        // Buscamos el primer botón y le damos vida
        // Nota: Como solo pusimos un botón en el XML, buscamos el primero que encuentre
        // Para que no de error si no hay ID, lo manejamos con cuidado.
    }
}

