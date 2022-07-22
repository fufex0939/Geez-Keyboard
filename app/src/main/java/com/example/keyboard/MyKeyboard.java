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




    private void switchKeyboard(InputConnection inputConnection, int k){
        switch (k){
            case -2:
                key_family = -2;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.letter_qwerty);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case -7:
                key_family = -7;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.letter_qwerty);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

            case -4:
                key_family = -4;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.symbols);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case -11:
                key_family = -11;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.number_qwerty);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

            case -12:
                key_family = -12;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.symbols_shift);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case -15:
                key_family = -15;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.amaharic_num);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

            case -10:
                key_family = -10;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.amaharic_hahu);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

//for letters
            case 4608:
                    key_family = 4608;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this,R.xml.hafamily);
                    kv.setKeyboard(keyboard);
                    kv.setOnKeyboardActionListener(this);
                break;

            case 4768:
                key_family = 4768;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.a_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);

                break;

            case 4816:
                key_family = 4816;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.aa_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

            case 4704:
                key_family = 4704;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.be_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

            case 4728:
                key_family = 4728;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.che_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4904:
                key_family = 4904;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ce_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4848:
                key_family = 4848;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.de_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4936:
                key_family = 4936;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.fe_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4872:
                key_family = 4872;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ge_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4624:
                key_family = 4624;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.haletaha_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4736:
                key_family = 4736;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.hne_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4792:
                key_family = 4792;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.hua_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4864:
                key_family = 4864;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.je_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4776:
                key_family = 4776;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ke_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4616:
                key_family = 4616;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.le_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4632:
                key_family = 4632;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.me_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4752:
                key_family = 4752;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ne_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4760:
                key_family = 4760;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.nye_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4944:
                key_family = 4944;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.pe_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4912:
                key_family = 4912;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.phe_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4672:
                key_family = 4672;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.qe_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4688:
                key_family = 4688;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.qua_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4648:
                key_family = 4648;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.re_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4656:
                key_family = 4656;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.se_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4640:
                key_family = 4640;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.sew_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4664:
                key_family = 4664;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.she_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4720:
                key_family = 4720;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.te_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4928:
                key_family = 4928;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.tse_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4712:
                key_family = 4712;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ve_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4808:
                key_family = 4808;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.we_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4896:
                key_family = 4896;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.xe_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4840:
                key_family = 4840;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ye_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4824:
                key_family = 4824;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ze_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4832:
                key_family = 4832;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.zy_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;
            case 4920:
                key_family = 4920;
                first_time_selected = 0;
                keyboard = new Keyboard(this,R.xml.ts_family);
                kv.setKeyboard(keyboard);
                kv.setOnKeyboardActionListener(this);
                break;

        }
    }

    @Override
    public void onRelease(int primaryCode) {


    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {


        InputConnection ic = getCurrentInputConnection();
        switchKeyboard(ic,primaryCode);
        playClick(primaryCode);
        switch (primaryCode){
            case KEYCODE_DELETE:
                ic.deleteSurroundingText(1,0);
                break;
            case Keyboard.KEYCODE_SHIFT:
                caps=!caps;
                keyboard.setShifted(caps);
                kv.invalidateAllKeys();
                break;
            case Keyboard.KEYCODE_DONE:
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_ENTER));
                break;
            case -30:



            default:
                if(primaryCode==-2|| primaryCode == -7 || primaryCode == -11 ||primaryCode == -12  || primaryCode == 46080 || primaryCode == -10 ||primaryCode == -15 ){
                    return;
                }
                char code = (char) primaryCode;
                if(Character.isLetter(code)&& caps){
                    code = Character.toUpperCase(code);
                }
                ic.commitText(String.valueOf(code),1);



        }

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
