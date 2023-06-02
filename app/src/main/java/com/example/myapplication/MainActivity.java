package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    double n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         n1= Double.parseDouble(String.valueOf(txtnum1.getText()));
         n2=Double.parseDouble(String.valueOf(txtnum2.getText()));
            btnok.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V){
                    Double resu=n1+n2;
                    txtresult.setText(String.valueOf(resu));
                }
            });
            btnmenos.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V){
                    Double resu=n1-n2;
                    txtresult.setText(String.valueOf(resu));
                }
            });
            btndivisao.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V){
                    Double resu=n1/n2;
                    txtresult.setText(String.valueOf(resu));
                }
            });
            btnvezes.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V){
                    Double resu=n1*n2;
                    txtresult.setText(String.valueOf(resu));
                }
            });


    }
    final Button btnok= (Button) findViewById(R.id.btnok);
    final EditText txtnum1= (EditText) findViewById(R.id.txtnum1);
    final EditText txtnum2= (EditText) findViewById(R.id.txtnum2);
    final TextView txtresult= (TextView) findViewById(R.id.txtresult);
    final Button btnmenos = (Button) findViewById(R.id.btnmenos);
    final Button btndivisao = (Button) findViewById(R.id.btndivisao);
    final Button btnvezes = (Button) findViewById(R.id.btnvezes);

}