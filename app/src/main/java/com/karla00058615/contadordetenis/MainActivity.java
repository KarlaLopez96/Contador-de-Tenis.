package com.karla00058615.contadordetenis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1 = (TextView) findViewById(R.id.text1);
    TextView text2 = (TextView) findViewById(R.id.text2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void agregarpuntos1(View v){
        String cA;
        cA = text1.getText().toString();
        String cB;
        cB = text2.getText().toString();

        switch(cA){
            case "0" :
                text1.setText("15");
                break;

            case "15" :
                text1.setText("30");
                break;

            case "30" :
                if(text2.equals("40")){
                    text1.setText("Tie");
                    text2.setText("Tie");}
                 else{
                    text1.setText("40");
                }
                break;

            case "40" :
                text1.setText("WINNER");
                break;

            case "Tie" :
                if(text1==text2){
                    text1.setText("WINNING");}
                 else{
                    text1.setText("Tie");
                    text2.setText("Tie");
                }
                break;

            case "Winnig" :
                text1.setText("WINNER!!!");
                break;
        }
    }

    public void agregarpuntos2(View v){

        String cA;
        cA = text1.getText().toString();
        String cB;
        cB = text2.getText().toString();

        switch(cB){
            case "0" :
                text2.setText("15");
                break;

            case "15" :
                text2.setText("30");
                break;

            case "30" :
                if(text1.equals("40")){
                    text1.setText("Tie");
                    text2.setText("Tie");}
                else{
                    text2.setText("40");
                }
                break;

            case "40" :
                text2.setText("WINNER");
                break;

            case "Tie" :
                if(text2==text1){
                    text2.setText("WINNING");}
                else{
                    text1.setText("Tie");
                    text2.setText("Tie");
                }
                break;

            case "Winnig" :
                text2.setText("WINNER!!!");
                break;
        }
    }
}

