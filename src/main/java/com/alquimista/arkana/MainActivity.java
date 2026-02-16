package com.alquimista.arkana;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText("👁️ ARKANA KEYBOARD 👁️\n\nBienvenido, Alquimista.\nEl poder de los símbolos está en tus manos.");
        text.setGravity(Gravity.CENTER);
        text.setTextSize(24);
        setContentView(text);
    }
}

