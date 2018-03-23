package com.karla00058615.contadordetenis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarpuntos1(View v){
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
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
                if(cB.equals("40")){
                    text1.setText("Tie");
                    text2.setText("Tie");}
                 else{
                    text1.setText("40");
                }
                break;

            case "40" :
                Aumento(0);
                break;

            case "Tie" :
                if(cA.equals(cB)){
                    text1.setText("Winning");}
                 else{
                    text1.setText("Tie");
                    text2.setText("Tie");
                }
                break;

            case "Winning" :
                Aumento(0);
                break;
        }
    }

    public void agregarpuntos2(View v){
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);

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
                if(cA.equals("40")){
                    text1.setText("Tie");
                    text2.setText("Tie");}
                else{
                    text2.setText("40");
                }
                break;

            case "40" :
                Aumento(1);
                break;

            case "Tie" :
                if(cB.equals(cA)){
                    text2.setText("Winning");}
                else{
                    text1.setText("Tie");
                    text2.setText("Tie");
                }
                break;
            case "Winning" :
                Aumento(1);
                break;
        }
    }

    public void Aumento (int contar){
        TextView Reset = (TextView) findViewById(R.id.text1);
        TextView Reset2 = (TextView) findViewById(R.id.text2);
        TextView Reset3 = (TextView) findViewById(R.id.set1);
        TextView Reset4 =(TextView) findViewById(R.id.set2);
        Reset.setText("0");
        Reset2.setText("0");
        if(contar == 0){
            if(Reset3.getText().toString().equals("1")){
                Toast t = Toast.makeText(getApplicationContext(),"Gano el jugador 1",Toast.LENGTH_LONG);
                t.show();
                ResetAllFF();
            }else{
                Reset3.setText("1");
            }
        }else{
            if(Reset4.getText().toString().equals("1")){
                Toast t = Toast.makeText(getApplicationContext(),"Gano el jugador 2",Toast.LENGTH_LONG);
                t.show();
                ResetAllFF();
            }else{
                Reset4.setText("1");
            }
        }
    }

    public void ResetAllFF(){
        TextView Reset = (TextView) findViewById(R.id.text1);
        TextView Reset2 = (TextView) findViewById(R.id.text2);
        TextView Reset3 = (TextView) findViewById(R.id.set1);
        TextView Reset4 =(TextView) findViewById(R.id.set2);
        Reset.setText("0");
        Reset2.setText("0");
        Reset3.setText("0");
        Reset4.setText("0");
    }

    public void ResetAll(View v){

        TextView Reset = (TextView) findViewById(R.id.text1);
        TextView Reset2 = (TextView) findViewById(R.id.text2);
        TextView Reset3 = (TextView) findViewById(R.id.set1);
        TextView Reset4 =(TextView) findViewById(R.id.set2);

        Reset.setText("0");
        Reset2.setText("0");
        Reset3.setText("0");
        Reset4.setText("0");
    }
}

