package com.example.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickPlay(View view) {
    }

    public void OpClickLevel(View view) {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }

    public void OnClickOption(View view) {
    }
}
