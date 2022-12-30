package com.example.tic_tac_toe;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class KrestikiNoliki extends AppCompatActivity {
Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
String krest, nol;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krestiki_noliki);
        krest = "X";
        nol = "0";
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
    }

    public void clcBtn1(View view) {
        button1.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn2(View view) {
        button2.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn3(View view) {
        button3.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn4(View view) {
        button4.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn5(View view) {
        button5.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn6(View view) {
        button6.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn7(View view) {
        button7.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn8(View view) {
        button8.setText(krest);
        isPlayerWinner();
    }

    public void clcBtn9(View view) {
        button9.setText(krest);
        isPlayerWinner();
    }
    public void isPlayerWinner(){
            if (button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
                textView.setText("Вы победили!");
            }
    }
}