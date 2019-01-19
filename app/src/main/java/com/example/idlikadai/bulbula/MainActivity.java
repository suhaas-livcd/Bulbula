package com.example.idlikadai.bulbula;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView
            mIntroTextView_intro_1 = null,
            mIntroTextView_intro_2 = null,
            mIntroTextView_intro_3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResources();
    }

    /**
     * To initialize the resources with the specified resource ID
     */
    private void initResources() {
        mIntroTextView_intro_1 = findViewById(R.id.mainActivity_menuOption_Start);
        mIntroTextView_intro_2 = findViewById(R.id.mainActivity_menuOption_Sound);
        mIntroTextView_intro_3 = findViewById(R.id.mainActivity_menuOption_Options);
    }

}
