package com.example.jeanc.calculadoratecgraff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nr1,nr2;
    private TextView tv;
    private RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nr1=(EditText)findViewById(R.id.etValor1);
        nr2=(EditText)findViewById(R.id.etValor2);
        tv=(TextView)findViewById(R.id.txtResultado);
        r1=(RadioButton)findViewById(R.id.rbSuma);
        r2=(RadioButton)findViewById(R.id.rbResta);
        r3=(RadioButton)findViewById(R.id.rbProd);
        r4=(RadioButton)findViewById(R.id.rbDivi);
    }

    private  void calcular(View view)
    {
        String valor1=nr1.getText().toString();
        String valor2=nr2.getText().toString();

        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);

        // si el boton esta activo r1
        if(r1.isChecked())
        {
            int suma=nro1+nro2;
            String resultado=String.valueOf(suma);
            tv.setText(resultado);  //que ejecute esta operacion
        }
        //si no
        else{
            if(r2.isChecked()){ // r2 = resta
                int resta= nro1-nro2;
                String resultado=String.valueOf(resta);
                tv.setText(resultado);
            }else{ // si no  que si el r3 esta activo que haga la multiplicacion
                int producto=nro1*nro2;
                String resultado=String.valueOf(producto);
                tv.setText(resultado);
            }

            // pero si no esta activo ni uno de los tres mensionados

            if(r4.isChecked())
            {
                int divi=nro1/nro2;
                String resultado=String.valueOf(divi);
                tv.setText(resultado);
            }

        }
    }

}
