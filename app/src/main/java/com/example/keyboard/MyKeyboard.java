package com.example.keyboard;

import static android.inputmethodservice.Keyboard.KEYCODE_DELETE;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.AudioManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;

import com.vanniktech.emoji.EmojiPopup;
import com.vanniktech.emoji.EmojiView;

import java.util.logging.Handler;

public class MyKeyboard extends InputMethodService  implements KeyboardView.OnKeyboardActionListener {
    private KeyboardView kv;
    private Keyboard keyboard;


    private boolean caps = false;
    int first_time_selected = 0;
    int key_family = 0;
    MainActivity mainActivity;

    @Override
    public View onCreateInputView() {
        kv = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        keyboard = new Keyboard(this, R.xml.amaharic_hahu);
        kv.setKeyboard(keyboard);
        kv.setOnKeyboardActionListener(this);

        return kv;
    }

    private void playClick(int keyCode) {
        AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
        switch (keyCode) {
            case 32:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_SPACEBAR);
                break;
            case 10:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_RETURN);
                break;
            case KEYCODE_DELETE:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_DELETE);

                break;
            default:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);

        }
    }

    @Override
    public void onPress(int primaryCode) {

    }

    @Override
    public void onRelease(int primaryCode) {

    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {

    }


    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
