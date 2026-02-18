package com.alquimista.arkana;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {
    private TextView visor;
    private Handler handler = new Handler();
    private boolean activado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visor = findViewById(R.id.visor_info);
        Button btnSchumann = findViewById(R.id.boton_schumann);

        btnSchumann.setOnClickListener(v -> {
            activado = !activado;
            if (activado) {
                visor.setTextColor(0xFFBC13FE); // Violeta Arkana
                actualizarResonancia.run();
            } else {
                visor.setText("SISTEMA ARKANA: STANDBY");
                visor.setTextColor(0xFF00FFFF); // Cian
                handler.removeCallbacks(actualizarResonancia);
            }
        });
    }

    private Runnable actualizarResonancia = new Runnable() {
        @Override
        public void run() {
            if (!activado) return;
            
            // Generamos una fluctuación realista alrededor de 7.83Hz
            double variacion = (new Random().nextDouble() * 0.4) - 0.2;
            double frecuencia = 7.83 + variacion;
            
            String data = "MONITOR SCHUMANN\n" +
                         "-----------------\n" +
                         "FRECUENCIA: " + String.format("%.2f", frecuencia) + " Hz\n" +
                         "ESTADO: VÍVERE ACTIVO\n" +
                         "SINCRONÍA: 333";
            
            visor.setText(data);
            
            // Se actualiza cada 1000 milisegundos (1 segundo)
            handler.postDelayed(this, 1000);
        }
    };
}

