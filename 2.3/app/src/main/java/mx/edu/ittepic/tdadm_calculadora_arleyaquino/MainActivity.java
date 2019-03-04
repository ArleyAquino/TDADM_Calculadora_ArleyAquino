package mx.edu.ittepic.tdadm_calculadora_arleyaquino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, sumar, dividir, multiplicar, restar, limpiar, igual;
double num1, num2;
TextView resultado;
String operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         n1= findViewById(R.id.n1);
        n2= findViewById(R.id.n2);
        n3= findViewById(R.id.button1n30);
        n4= findViewById(R.id.n4);
        n5= findViewById(R.id.n5);
        n6= findViewById(R.id.n6);
        n7= findViewById(R.id.n7);
        n8= findViewById(R.id.n8);
        n9= findViewById(R.id.n9);
        n0= findViewById(R.id.n0);
        sumar= findViewById(R.id.sumar);
        restar= findViewById(R.id.menos);
        multiplicar= findViewById(R.id.mult);
        dividir= findViewById(R.id.dividir);
        igual= findViewById(R.id.igual);
        limpiar= findViewById(R.id.limpiar);
        resultado=findViewById(R.id.resultado);


        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=1;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=2;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=3;
                if(resultado.getText().equals("resultado"))resultado.setText(String.valueOf(num1));
                else{resultado.setText(null);
                    resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=4;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=5;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=6;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=7;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=8;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=9;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=0;
                if(resultado.getText()=="")resultado.setText(String.valueOf(num1));
                else{resultado.setText(resultado.getText()+String.valueOf(num1));}
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText()==""){}
                else{resultado.setText(resultado.getText()+"+");
                operacion="sumar";
                }
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText()==""){}
                else{resultado.setText(resultado.getText()+"-");
                    operacion="restar";
                }
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText()==""){}
                else{resultado.setText(resultado.getText()+"*");
                    operacion="multi";
                }
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText()==""){}
                else{resultado.setText(resultado.getText()+"/");
                    operacion="dividir";
                }
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            double i;
            String n1, n2, op;

            @Override
            public void onClick(View v) {
                String [] partes1=resultado.getText().toString().split("-");
                String[] partes2=resultado.getText().toString().split("\\+");
               String [] partes3=resultado.getText().toString().split("\\*");
                String[] partes4=resultado.getText().toString().split("/");

                if(operacion=="sumar"){
                    i=(Double.valueOf(partes2[0])+Double.valueOf(partes2[1]));
                }
                if(operacion=="restar"){
                    i=(Double.valueOf(partes1[0])-Double.valueOf(partes1[1]));
                }
                if(operacion=="multi"){
                    i=(Double.valueOf(partes3[0])*Double.valueOf(partes3[1]));
                }
                if(operacion=="dividir"){
                    i=(Double.valueOf(partes4[0])/Double.valueOf(partes4[1]));
                }
                resultado.setText(String.valueOf(i));

            }
        });
    }
}
