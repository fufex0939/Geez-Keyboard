package com.example.keyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.vanniktech.emoji.EmojiPopup;
import com.vanniktech.emoji.EmojiTextView;

public class MainActivity extends AppCompatActivity {
    EditText etEmoji;
    LinearLayout llTextViews;
    EmojiPopup popup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmoji=findViewById(R.id.etEmoji);
        llTextViews=findViewById(R.id.llTextViews);

         popup = EmojiPopup.Builder
                .fromRootView(findViewById(R.id.rootView)).build(etEmoji);


    }

   public void switchEmoji(InputConnection in, int code){
        switch (code){
            case -30:

                popup.toggle();

        }
   }


}