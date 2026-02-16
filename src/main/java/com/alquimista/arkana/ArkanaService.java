package com.alquimista.arkana;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;

public class ArkanaService extends InputMethodService {
    @Override
    public View onCreateInputView() {
        // Por ahora, solo le decimos al sistema que existimos
        return null; 
    }
}

