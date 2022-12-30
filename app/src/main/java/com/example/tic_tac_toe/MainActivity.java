package com.example.tic_tac_toe;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageTicTacIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageTicTacIcon = findViewById(R.id.tic_tac_icon);
    }

    public void start(View view) {
        Intent intent = new Intent(MainActivity.this, KrestikiNoliki.class);
        startActivity(intent);
        finish();
    }
}