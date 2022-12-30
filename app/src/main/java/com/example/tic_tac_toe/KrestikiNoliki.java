package com.example.tic_tac_toe;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class KrestikiNoliki extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String krest, nol;
    TextView textView,humanPoints, PCPoints;
    int pointsOfHuman, pointsOfPC;

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
        textView.setText("");
        humanPoints = findViewById(R.id.humanPoints);
        PCPoints = findViewById(R.id.PCPoints);
    }

    public void clcBtn1(View view) {
        if (button1.getText() == "" && textView.getText() == ""){
            button1.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn2(View view) {
        if (button2.getText() == "" && textView.getText() == ""){
            button2.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn3(View view) {
        if (button3.getText() == "" && textView.getText() == ""){
            button3.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn4(View view) {
        if (button4.getText() == "" && textView.getText() == ""){
            button4.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn5(View view) {
        if (button5.getText() == "" && textView.getText() == ""){
            button5.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn6(View view) {
        if (button6.getText() == "" && textView.getText() == ""){
            button6.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn7(View view) {
        if (button7.getText() == "" && textView.getText() == ""){
            button7.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn8(View view) {
        if (button8.getText() == "" && textView.getText() == ""){
            button8.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void clcBtn9(View view) {
        if (button9.getText() == "" && textView.getText() == ""){
            button9.setText(krest);
            isPlayerWinner();
            if(textView.getText() == "" && (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="")){
                hodPC();
            }
        }
    }

    public void isPlayerWinner() {
        if (button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        } else if (button4.getText() == krest && button5.getText() == krest && button6.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        } else if (button7.getText() == krest && button8.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        } else if (button1.getText() == krest && button4.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        } else if (button2.getText() == krest && button5.getText() == krest && button8.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        } else if (button3.getText() == krest && button6.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        }
        else if (button1.getText() == krest && button5.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
        }
        else if (button3.getText() == krest && button5.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_message);
            humanPoints.setText(""+pointsOfHuman);
        }
        else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" && button4.getText() != "" && button5.getText() != "" && button6.getText() != "" && button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.draw_message);

        }
    }
    public void isPCWinner(){
        if (button1.getText() == nol && button2.getText() == nol && button3.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        } else if (button4.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        } else if (button7.getText() == nol && button8.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        } else if (button1.getText() == nol && button4.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        } else if (button2.getText() == nol && button5.getText() == nol && button8.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        } else if (button3.getText() == nol && button6.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        }
        else if (button1.getText() == nol && button5.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        }
        else if (button3.getText() == nol && button5.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.winner_messagePC);
            pointsOfPC++;
            PCPoints.setText(""+pointsOfPC);
        }
    }
    public void hodPC(){
        Random random = new Random();
        random.nextInt(8);
        int buttonPcClick = random.nextInt(9) + 1;
        Log.i("","buttonPcClick - " + buttonPcClick);
        if (button1.getText()=="" || button2.getText()=="" || button3.getText()=="" || button4.getText()=="" || button5.getText()=="" || button6.getText()=="" || button7.getText()=="" || button8.getText()=="" || button9.getText()=="") {


            switch (buttonPcClick) {
                case 1:
                    if (button1.getText() == "") {
                        button1.setText(nol);
                    } else
                        hodPC();
                    break;
                case 2:
                    if (button2.getText() == "") {
                        button2.setText(nol);
                    } else
                        hodPC();
                    break;
                case 3:
                    if (button3.getText() == "") {
                        button3.setText(nol);
                    } else
                        hodPC();
                    break;
                case 4:
                    if (button4.getText() == "") {
                        button4.setText(nol);
                    } else
                        hodPC();
                    break;
                case 5:
                    if (button5.getText() == "") {
                        button5.setText(nol);
                    } else
                        hodPC();
                    break;
                case 6:
                    if (button6.getText() == "") {
                        button6.setText(nol);
                    } else
                        hodPC();
                    break;
                case 7:
                    if (button7.getText() == "") {
                        button7.setText(nol);
                    } else
                        hodPC();
                    break;
                case 8:
                    if (button8.getText() == "") {
                        button8.setText(nol);
                    } else
                        hodPC();
                    break;
                case 9:
                    if (button9.getText() == "") {
                        button9.setText(nol);
                    } else
                        hodPC();
                    break;
            }
            isPCWinner();
        }
        else{textView.setText("Ничья");}
    }

    public void clickRestart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");
    }
}