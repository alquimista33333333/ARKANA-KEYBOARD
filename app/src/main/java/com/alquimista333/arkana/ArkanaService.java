package com.alquimista333.arkana;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;

public class ArkanaService extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    @Override
    public View onCreateInputView() {
        KeyboardView kv = (KeyboardView) getLayoutInflater().inflate(R.layout.arkana_interface, null);
        Keyboard k = new Keyboard(this, R.xml.arkana_interface);
        kv.setKeyboard(k);
        kv.setOnKeyboardActionListener(this);
        return kv;
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        // Aquí es donde sucede la magia de las etiquetas
        getCurrentInputConnection().commitText(String.valueOf((char) primaryCode), 1);
    }

    // Métodos obligatorios de la interfaz
    @Override public void onPress(int primaryCode) {}
    @Override public void onRelease(int primaryCode) {}
    @Override public void onText(CharSequence text) {}
    @Override public void swipeLeft() {}
    @Override public void swipeRight() {}
    @Override public void swipeDown() {}
    @Override public void swipeUp() {}
}

